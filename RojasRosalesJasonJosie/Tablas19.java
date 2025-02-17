public class Tablas19 { //nombre de la clase
    public static void main(String[] args) { 
        // Método principal
                int i = 1; // Iniciamos la variable i
                // Bucle para los números del 1 al 9
                do {
                    // Imprimimos un mensaje indicando la tabla
                    System.out.println("Tabla de multiplicar del " + i + ":");
                    
                    int j = 1; // Iniciamos la variable j
                    // Bucle para multiplicar cada número por el 1 al 10
                    do {
                        // Imprimimos el resultado de la multiplicación
                        System.out.println(i + " x " + j + " = " + (i * j));
                        j++; // Incrementamos j
                    } while (j <= 10); // Condición para el bucle interno
                    
                    System.out.println(); // Salto de línea entre tablas
                    i++; // Incrementamos i
                } while (i <= 10); // Condición para el bucle externo
            }
        }

