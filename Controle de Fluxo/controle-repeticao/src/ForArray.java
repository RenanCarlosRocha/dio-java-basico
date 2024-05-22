public class ForArray {
    public static void main(String[] args) {
        //Em Arrays o indice dos elementos começa em Zero.
        String alunos[] = { "Renan", "Tiago", "Pedro", "Maria" };

        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        // for (int x=0; x<alunos.length; x++) {
        // System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        // }
    }
    
}
