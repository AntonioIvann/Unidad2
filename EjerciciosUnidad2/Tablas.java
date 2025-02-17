class Tablas { // Nombre de la clase
    public static void main(String[] args) { // Metodo principal
        // Bucle para los números del 1 al 9
        for (int i = 1; i <= 10; i++) {
            // Imprimimos un mensaje inidcando la tabla
            System.out.println("Tabla de multiplicar del " + i + ":");
            // Bucle para multiplicar cada número por el 1 al 10
            for (int j = 1; j <= 10; j++) {
                // Imprimimos el resultado de la multiplicación
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Salto de línea entre tablas
        }
    }
}