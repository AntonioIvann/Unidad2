class NumerosPares2 {// Nombre de la clase
    public static void main(String[] args) {// Metodo main
        for (int i = 0; i <= 100; i += 2) {// Usamos el bucle for para recorrer los numeros del 0 al 100
            if (i % 2 == 0) {// La condicion if hace que verifique si los numeros son par
                System.out.println(i);// Imprime los numeros pares del 0 al 100
            }
        }
    }
}