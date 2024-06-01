package ios.sistemaoperacional;

/**
 * Aqui como podemos ver eu importei bem dizer todos os serviços do meu código ou aplicação
 * porque será aqui onde tudo vai ser executado porque esse é o sistema operacional do IPhone bem dizer o coração dele...
 */

import ios.aparelhotelefonico.AparelhoTelefonico;
import ios.navegadorinternet.NavegadorNaInternet;
import ios.reprodutormusical.ReprodutorMusical;
import ios.aparelhotelefonico.ServicoLigacao;
import ios.navegadorinternet.ServicaoWeb;
import ios.reprodutormusical.ServiceReprodutorMusical;

/**
 * Já aqui vemos nosso Ios sua classe
 * Aqui eu simplesmente criei as variaveis privadas que receberam os valores de interface onde agora eu posso injetar
 * as dependencias com classes concretas, dessa forma também cuidando do encapsulamento, dessa forma falando alguém saberia que esse
 * método ou serviço existe, só que não saberia a logica e implementação por traz...
 */
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