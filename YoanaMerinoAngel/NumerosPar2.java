public class NumerosPar2 { // Define la clase principal
    public static void main(String[] args) { // Método principal donde se ejecuta el programa
        for (int i = 1; i <= 100; i++) { // Bucle que recorre los números del 1 al 100
            if (i % 2 == 0) { // Verifica si el número es par (su residuo al dividir por 2 es 0)
                System.out.println(i); // Imprime el número si es par
            } // Cierre del bloque "if"
        } // Cierre del bloque "for"
    } // Cierre del método "main"
} // Cierre de la clase "NumerosPar2"
