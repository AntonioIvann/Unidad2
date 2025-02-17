class FizzBuzz { // Nombre de la clase
    public static void main(String[] args) { // Metodo principal
        // Utilizamos un bucle for que recorra los números del 1 al 20
        for (int i = 1; i <= 20; i++) {
            // Utilizamos la condición if para verificar si el número es divisible por 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                // SI es divisible por 3 y 5 imprimimos FizzBuzz
                System.out.println("FizzBuzz");
                // Si es divisible por 3 pero no por 5 imprimimos Fizz
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                // Si es divisible por 5 pero no por 3 imprimimos Buzz
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                // Si no es divisible por 3 ni 5 imprimimos el número
                System.out.println(i);
            }
        }
    }
}