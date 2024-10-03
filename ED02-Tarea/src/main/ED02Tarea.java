package main;

public class ED02Tarea {

    
public static void main(String[] args) {
    int numero = 852499;
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
        // Imprimir el último digiyo 
        System.out.print(numeroiterat % 10);
        // Elimina el último digiyo 
        numeroiterat = numeroiterat / 10;
    }
    System.out.println();  // nueva linea
}


}


