package ios.aparelhotelefonico;

public class ServicoLigacao implements AparelhoTelefonico {
    private String numero;

    public void iniciarCorreioVoz(){
        verificarSinal();
        System.out.println("INICIANDO CORREIO DE VOZ...");
    }

    public void ligar(){
        verificarSinal();
        System.out.println("FAZENDO LIGAÇÃO...");
    }

    public void atender(){
        System.out.println("ATENDENDO O CELULAR...");
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    private void verificarSinal(){
        System.out.println("Verificando Sinal...");
    }
}