package ios.reprodutormusical;

/**
 * Novamente vemos aqui uma interface que seria para o reprodutor musical...
 */
public interface ReprodutorMusical {
    public void tocar();

    public void pausar();

    public String getMusica();

    public void setMusica(String musica);
}