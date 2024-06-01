/**
 *
 * @author Wesleyleopoldo
 * @since 01/06/2024
 * @version 1.0
 *
 * Desafio da DIO modelando um IPhone com diagramas classes e etc...
 *
 * Nesse caso em especifico eu criei uma classe para o Hardware no caso um IPhone
 * Outras classes para as suas Respectivas Funcionalidades como Serviço Web, Serviço de Ligação e Serviço para Reprodução
 * de Música
 *
 * Criei interfaces também para determinar o que cada classe teria que ter: Seus métodos, comportamentos dentre outras coisas...
 *
 * Utilizei bastante métodos construtores para instanciar os serviços de cada funcionalidade do código
 * Utilizei também variaveis de tipo interface deixando as privadas e dentro delas instanciei os serviços
 * para um melhor controle e também para cuidar da parte do encapsulamento visto que dentro do Ios e Iphone
 * cada uma das variaveis que contém os serviços são privadas(private).
 *
 * criei também um método para iniciar(run) a aplicação no método main dentre outras coisas...
 */

/**
 * @package hardwareiphone onde se encontra a classe que é executada no caso a Iphone...
 */
package hardwareiphone;

/**
 * importando a classe Scanner e o Sistema operacional Ios...
 */

import java.util.Scanner;
import ios.sistemaoperacional.Ios;
// Classe do Iphone...
public class Iphone {
    // Aqui está a criação do ios, Esse objeto é private ou seja as outras classes não sabem como ele é executado...
    private Ios ios = new Ios();

    /** O método que executa o código...
     * Aqui vemos o método run() nele vemos toda a funcionalidade do programa.
     * Nele eu criei variaveis para laços de repetição para todas as aréas do meu código..
     * por exemplo o repetição é usado no laço de repetição principal de todo o código...
     * e assim é para navegar na internet, reproduzir música e etc...
     */
    public void run() {
        boolean repeticao = true;
        boolean continueReprodutor;
        boolean repeticaoWeb;
        Scanner ler = new Scanner(System.in);
        System.out.println("Iniciando IPhone");
        while(repeticao == true) {
            System.out.println("Bem Vindo");

            System.out.println("Selecione a funcionalidade desejada do meu Sistema Operacional iOS");
            System.out.println("1 - Aparelho Telefônico");
            System.out.println("2 - Reprodutor Musical");
            System.out.println("3 - Navegador");
            System.out.println("4 - Encerrar");
            int opcao = ler.nextInt();
            /**
             * Como podemos ver logo a frente os metodos getters e setters para enviar o input do método e voltar
             * com a execução e armazenar que seja música ou para ligações
             */
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
                continueReprodutor = true;
                while(continueReprodutor == true){
                    ios.tocar();
                    System.out.println("Deseja Pausar? \n1 Sim | 2 Não: ");
                    int sair = ler.nextInt();

                    if(sair == 1) {
                        ios.pausar();
                        break;
                    } else{

                    }
                }
            } else if (opcao == 3) {
                System.out.println("Digite o site que deseja visitar: ");
                String site = ler.next();
                ios.setPagina(site);
                repeticaoWeb = true;
                while(repeticaoWeb == true) {
                    System.out.println("EXIBINDO PÁGINA: " + ios.getPagina());
                    System.out.println("Deseja Atualizar a Página ou Adicionar uma nova Aba?");
                    System.out.println("1 - Adicionar Nova Aba | 2 - Atualizar Página | 3 - Sair: ");
                    int sairNavegador = ler.nextInt();
                    if (sairNavegador == 1) {
                        System.out.println("Digite o site que deseja visitar: ");
                        String novaAba = ler.next(); // Aqui foi criada uma nova variavél para abrir uma nova aba e já pesquisar o site...
                        ios.setPagina(novaAba);
                        ios.adicionarNovaAba();
                    } else if (sairNavegador == 2) {
                        ios.atualizarPagina();
                    } else if (sairNavegador == 3) {
                        repeticaoWeb = false;
                        break;
                    } else
                        System.out.println("As opções disponíveis são somente essas: ");
                }
            } else if (opcao == 4) {
                repeticao = false;
                break;
            } else
                System.out.println("As opções disponíveis são somente essas: ");
        }
    }
    // método onde tudo é executado...
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.run();
    }
}
