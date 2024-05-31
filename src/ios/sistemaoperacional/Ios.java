package ios.sistemaoperacional;

import ios.aparelhotelefonico.AparelhoTelefonico;
import ios.navegadorinternet.NavegadorNaInternet;
import ios.reprodutormusical.ReprodutorMusical;

public class Ios implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    private String musica;
    private String numero;
    private String site;

    public void exibirPagina(){
        verificarConexao();
        System.out.println("Exibindo Pagina");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public String getPagina(){
        return site;
    }

    public void setPagina(String site){
        this.site = site;
    }

    private void verificarConexao(){
        System.out.println("Verificando conexão...");
    }

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

    public void tocar(){
        System.out.println("TOCANDO MÚSICA...");
    }

    public void pausar(){
        System.out.println("PAUSANDO MÚSICA");
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getMusica(){
        return musica;
    }

}