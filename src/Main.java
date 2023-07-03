// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
     *
     * Tened en cuenta que los textos pueden venir de un array de tipo String.
     * @param args
     */
    public static void main(String[] args) {
        String[] nombres = {"Andreu", "es", "un", "crack", "del copon"};
        String fraseConcatenada = "";
        for( int i = 0; i < nombres.length; i++) {
            fraseConcatenada += nombres[i] + " ";
        }
        System.out.println(fraseConcatenada);
    }
}