package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu == false) {
            System.out.println("Não conseguimos contato com " + candidato + ", numero máximo de tentativas excedido.");
        }
             
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}


    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        try {
            while (candidatosSelecionados < 5) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();
                if (salarioPretendido <= salarioBase) {
                    System.out.println("O candidato " + candidato + " cumpre os requisitos de pretensão salarial.");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Somente " + candidatosSelecionados + " candidatos estavam de acordo com os requisitos de pretensão salarial.");
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato, com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
