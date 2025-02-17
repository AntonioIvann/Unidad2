public class FizzBuzz { // Define la clase principal
    public static void main(String[] args) { // Método principal donde se ejecuta el programa
        for (int i = 1; i <= 20; i++) { // Bucle del 1 al 20
            if (i % 3 == 0 && i % 5 == 0) { // Si es divisible por 3 y 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Si es divisible solo por 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Si es divisible solo por 5
                System.out.println("Buzz");
            } else { // En cualquier otro caso, imprime el número
                System.out.println(i);
            } // Cierre del bloque "if-else"
        } // Cierre del bloque "for"
    } // Cierre del método "main"
} // Cierre de la clase "FizzBuzz"
