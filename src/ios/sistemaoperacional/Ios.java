package ios.sistemaoperacional;

import ios.aparelhotelefonico.AparelhoTelefonico;
import ios.navegadorinternet.NavegadorNaInternet;
import ios.reprodutormusical.ReprodutorMusical;
import ios.aparelhotelefonico.ServicoLigacao;
import ios.navegadorinternet.ServicaoWeb;
import ios.reprodutormusical.ServiceReprodutorMusical;

public class Ios {
    private AparelhoTelefonico aparelhoTelefonico;
    private ReprodutorMusical reprodutorMusical;
    private NavegadorNaInternet navegadorNaInternet;

    public Ios(){
        this.aparelhoTelefonico = new ServicoLigacao();

        this.reprodutorMusical = new ServiceReprodutorMusical();

        this.navegadorNaInternet = new ServicaoWeb();
    }

    public void ligar(){
        aparelhoTelefonico.ligar();
    }

    public void atender(){
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz(){
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public String getNumero(){
        return aparelhoTelefonico.getNumero();
    }

    public void setNumero(String numero){
        aparelhoTelefonico.setNumero(numero);
    }

    public void tocar(){
        reprodutorMusical.tocar();
    }

    public void pausar(){
        reprodutorMusical.pausar();
    }

    public String getMusica(){
        return reprodutorMusical.getMusica();
    }

    public void setMusica(String musica){
        reprodutorMusical.setMusica(musica);
    }

    public void exibirPagina(){
        navegadorNaInternet.exibirPagina();
    }

    public void atualizarPagina(){
        navegadorNaInternet.atualizarPagina();
    }

    public void adicionarNovaAba(){
        navegadorNaInternet.adicionarNovaAba();
    }

    public String getPagina(){
        return navegadorNaInternet.getPagina();
    }

    public void setPagina(String site){
        navegadorNaInternet.setPagina(site);
    }
}