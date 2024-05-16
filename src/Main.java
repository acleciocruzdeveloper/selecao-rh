import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "JULIA", "MARCIA", "MARIA", "PAULO", "AUGUSTO"};
        for (String candidato :
                candidatos) {
            entrandoEmContato(candidato);
        }
    }

    private static void entrandoEmContato(String candidato) {
        int numeroTentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                numeroTentativas++;
            }else {
                System.out.println("CONTATO REALIZADO COM SUCESSO, COM O CANDIDATO " + candidato);
            }
        }while (continuarTentando && numeroTentativas < 3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA TENTATIVA " + numeroTentativas);
        }else {
            System.out.println("NAO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + ", NUMERO DE TENTATIVAS "  + numeroTentativas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

}