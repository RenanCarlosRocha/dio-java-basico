public class Unarios {
    public static void main (String args[]) throws Exception {
        int numero = 5;
        numero = - numero;
        System.out.println( - numero);
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero = numero++; // a ordem está errada
        numero = ++numero;
        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);
    }
}
