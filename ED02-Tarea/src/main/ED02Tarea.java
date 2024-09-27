package main;

public class ED02Tarea {

    
public static void main(String[] args) {
    int numero = 852499;
    System.out.print("Número invertido (recursivo): ");
    invierte(numero);  // Llamada al método recursivo
    System.out.println();  // Para nueva línea después del resultado 
    invierteIterativo(numero);  // Llamada al método iterativo
}

    public static void invierte(int numero) {
    // Condición de parada: si el número es menor a 10, se imprime tal cual
    if (numero < 10) {
        System.out.print(numero);  // Imprimir el último dígito
    } else {
        // Imprimir el último dígito del número
        System.out.print(numero % 10);
        // Llamada recursiva con el número sin el último dígito
        invierte(numero / 10);
    }
}

public static void invierteIterativo(int numeroiterativo) {
    System.out.print("Número invertido (iterativo): ");
    
  // bucle mientras el número sea mayor a 0
    while (numeroiterativo > 0) {
        // Imprimir el último dígito del número
        System.out.print(numeroiterativo % 10);
        // Eliminar el último dígito del número
        numeroiterativo = numeroiterativo / 10;
    }
    System.out.println();  // Para nueva línea después del resultado
}


}


