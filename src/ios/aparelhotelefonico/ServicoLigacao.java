package ios.aparelhotelefonico;
/**
 * Aqui eu coloco uma dinâmica mais diferente nessa classe concreta com os métodos da implementação
 * eu importo a Classe Random para criar o sisteminha que fizemos em aulas anteriores.
 * utilizando um laço de repetição que apenas verifica se repete após executa-lo uma vez e vê se repete no final,
 * Onde após o celular tocar ele verifica se a outra possivel pessoa atendeu...
 */
import java.util.Random;

public class ServicoLigacao implements AparelhoTelefonico {
    private String numero;

    @Override
    public void iniciarCorreioVoz(){
        verificarSinal();
        System.out.println("INICIANDO CORREIO DE VOZ...");
    }
    @Override
    public void ligar(){
        verificarSinal();
        System.out.println("FAZENDO LIGAÇÃO...");
        do{
            System.out.println("CHAMANDO...");
        }while(tocar());
        atender();
    }
    @Override
    public void atender(){
        System.out.println("ATENDENDO O CELULAR...");
        System.out.println("ALÔÔÔÔÔ!!!");
    }
    @Override
    public String getNumero(){
        return numero;
    }
    @Override
    public void setNumero(String numero){
        this.numero = numero;
    }

    private void verificarSinal(){
        System.out.println("Verificando Sinal...");
    }


    /**
     * E aqui vemos o método que faz o telefone tocar e verifica se a outra pessoa atendeu
     * nesse caso utilizando a classe Random ele gera um número aleatorio de de 0 à 2 e ele compara
     * para ver se o número gerado é igual a um, se sim verdadeiro(true) se não falso(false) e volta a tocar
     * para a dinamica do atendeu? ser o mais realista possível simplesmente coloco uma negação lógica "!"
     * que é para inverter o resultado printado no terminal...
     * @return ! tocando <- "!" inverte o resultado printado na tela, se for true ele inverte e o torna false
     * quando printa no terminal...
     */
    private boolean tocar(){
        Random random = new Random();
        boolean tocando = random.nextInt(3)==1;
        System.out.println("TOCANDO...");
        System.out.println("ATENDEU? " + tocando);
        return ! tocando;
    }
}