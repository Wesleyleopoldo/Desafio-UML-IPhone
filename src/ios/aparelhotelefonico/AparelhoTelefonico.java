package ios.aparelhotelefonico;

/**
 * Como já explicado aqui vemos a interface e seus respectivos métodos
 * e para qualquer outra classe implementa-lo tera que ter esses métodos e subscreve-lo
 */
public interface AparelhoTelefonico {

    public void ligar();

    public void atender();

    public void iniciarCorreioVoz();

    public String getNumero();

    public void setNumero(String numero);

}
