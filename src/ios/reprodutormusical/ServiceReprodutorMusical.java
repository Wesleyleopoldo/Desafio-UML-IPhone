package ios.reprodutormusical;

/**
 * Aqui está a classe com os métodos concretos que fornecem o serviço e atende ao contrato da interface
 * Reprodutor Musical...
 */
public class ServiceReprodutorMusical implements ReprodutorMusical{
    private String musica;

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
