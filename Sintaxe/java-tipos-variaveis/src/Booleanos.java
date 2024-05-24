public class Booleanos {
    public static void main (String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.print("A nossa condição é verdadeira!");
        }

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior que numeroDois? " + simNao);
    }
}
