class NumeroFizzBuzz {// Nombre de la clase
    public static void main(String[] args) {// Metodo main
        for (int i = 1; i <= 20; i++) {// El bucle for hace que recorra los numeros del 1 al 20
            if (i % 3 == 0 && i % 5 == 0) { // La condicion if hace que verifique si el número es divisible por 3 y 5
                System.out.println("FizzBuzz");// SI el numero es divisible por 3 y 5 imprime FizzBuzz
            } else if (i % 3 == 0) {// Si el nuemero es divisible por 3 pero no por 5 imprime Fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0) {// Si el numero es divisible por 5 pero no por 3 imprime Buzz
                System.out.println("Buzz");
            } else {// Si el numero no es divisible por 3 ni por 5 imprime solo el número
                System.out.println(i);
            }
        }
    }
}