package ios.aparelhotelefonico;

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

    private boolean tocar(){
        Random random = new Random();
        boolean tocando = random.nextInt(3)==1;
        System.out.println("TOCANDO...");
        System.out.println("ATENDEU? " + tocando);
        return ! tocando;
    }
}