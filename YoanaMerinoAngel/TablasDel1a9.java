public class TablasDel1a9 { // Clase principal
    public static void main(String[] args) { // Método principal
        for (int num = 1; num <= 9; num++) { // Bucle exterior: recorre los números del 1 al 9
            System.out.println("Tabla del " + num + ":"); // Muestra el encabezado de la tabla
            for (int i = 1; i <= 10; i++) { // Bucle interior: recorre los números del 1 al 10
                System.out.println(num + " x " + i + " = " + (num * i)); // Imprime la multiplicación
            } // Fin del bucle interior
            System.out.println(); // Salto de línea entre tablas
        } // Fin del bucle exterior
    } // Fin del método principal
} // Fin de la clase
