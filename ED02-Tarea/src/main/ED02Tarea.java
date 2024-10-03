package main;

public class ED02Tarea {

    
public static void main(String[] args) {
    int numero = 123456;
    System.out.print("Número invertido (metodo recursivo): ");
    invertido(numero);  // Llama al met recursivo
    System.out.println();  // nueva linea 
    invierteIterativo(numero);  // Llama al met iterativo
}

//Linea Prueba

    public static void invertido(int numero) {
    // si el num es menor a 10 se imprime
    if (numero < 10) {
        System.out.print(numero);  
        
    } else {
        // Imprimir ultimo numero
        System.out.print(numero % 10);
        // Llamada recursiva 
        invertido(numero / 10);
    }
}

public static void invierteIterativo(int numeroiterat) {
    System.out.print("Número invertido (metodo iterativo): ");
    
  // bucle mientras el num sea mayor a 0
    while (numeroiterat > 0) {
        // Imprimir ultimo num 
        System.out.print(numeroiterat % 10);
        // Elimina ultimo numero 
        numeroiterat = numeroiterat / 10;
    }
    System.out.println();  // nueva linea
}

public class Busqueda {
    // Arreglo ordenado de enteros
    private int[] v;

    // Constructor que inicializa el arreglo
    public Busqueda(int[] v) {
        this.v = v;
    }

    // Met pub que inicia la busqueda
    public int busca(int x) {
        return buscaR(x, 0, v.length - 1);  // Llamada al método recursivo
    }

    // Met privado que realiza la busquda recursiva
    private int buscaR(int x, int izquierda, int derecha) {
        if (izquierda > derecha) {
            return -1;  // Valor no encontrado
        }
        
        int mitad = (izquierda + derecha) / 2;

        if (v[mitad] == x) {
            return mitad;  // Valor encontrado
        } else if (v[mitad] < x) {
            // Buscar en la mitad derecha
            return buscaR(x, mitad + 1, derecha);
        } else {
            // Buscar en la mitad izquierda
            return buscaR(x, izquierda, mitad - 1);
        }
    }
}

}


