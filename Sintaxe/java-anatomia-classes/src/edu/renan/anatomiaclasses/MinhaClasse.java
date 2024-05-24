package edu.renan.anatomiaclasses;
public class MinhaClasse {
public static void main (String [] args) {
    
    String primeiroNome = "Renan";
    String segundoNome = "Carlos";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
}

}
