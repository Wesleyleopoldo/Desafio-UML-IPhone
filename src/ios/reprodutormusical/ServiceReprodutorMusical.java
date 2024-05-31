package ios.reprodutormusical;

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
