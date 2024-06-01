package hardwareiphone;

import java.util.Scanner;
import ios.sistemaoperacional.Ios;

public class Iphone {
    private Ios ios;

    public Iphone(){
        this.ios = new Ios();
    }

    public void run() {
        boolean repeticao = true;
        Scanner ler = new Scanner(System.in);
        System.out.println("Iniciando IPhone");
        while(repeticao == true) {
            System.out.println("Bem Vindo");

            System.out.println("Selecione a funcionalidade desejada do meu Sistema Operacional iOS");
            System.out.println("1 - Aparelho Telefônico");
            System.out.println("2 - Reprodutor Musical");
            System.out.println("3 - Navegador");
            int opcao = ler.nextInt();
            if (opcao == 1) {

                System.out.println("Digite o Número que Você deseja ligar: ");
                String numero = ler.next();
                ios.setNumero(numero);
                System.out.println("LIGANDO PARA " + ios.getNumero());
                ios.ligar();

            } else if (opcao == 2) {
                System.out.println("Digite o nome da música: ");
                String musica = ler.next();
                ios.setMusica(musica);
                System.out.println("TOCANDO: " + ios.getMusica());
                ios.tocar();
            } else if (opcao == 3) {
                System.out.println("Digite o site que deseja visitar: ");
                String site = ler.next();
                ios.setPagina(site);
                System.out.println("EXIBINDO PÁGINA: " + ios.getPagina());
            } else if (opcao == 4) {
                repeticao = false;
                break;
            } else
                System.out.println("As opções disponíveis são somente essas: ");
        }
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.run();
    }
}
