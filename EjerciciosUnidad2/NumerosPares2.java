class NumerosPares2 { // Nombre de la clase
    public static void main(String[] args) { // Metodo principal
        // Utilizamos un bucle for que recorra los números del 0 al 100 de 1 en 1
        for (int i = 0; i <= 100; i++) {
            // Utilizamos la condición if para verificar si el número es par
            if (i % 2 == 0) { 
                // Imprimimos el número
                System.out.println(i);
            }
        }
    }
}