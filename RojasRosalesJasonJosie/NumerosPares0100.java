public class NumerosPares0100 { // nombre de la clase  igual al archivo 
    public static void main(String[] args) {// Metodo main metod mas importante
        for (int i = 0; i <= 100; i++) {// Usamos el bucle for para recorrer los numeros del 0 al 100
            if (i % 2 == 0) {// La condicion if hace que verifique si los numeros son par
                System.out.println(i);// Imprime los numeros pares del 0 al 100
            }
        }
    }
}
