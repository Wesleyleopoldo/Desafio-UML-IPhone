package ios.navegadorinternet;

/**
 * Aqui estão as interfaces do meu código nesse caso vemos a interface do Navegador na Internet...
 * Aqui a classe que implementar ela tera que ter os seguintes métodos encontrados no código abaixo...
 */
public interface NavegadorNaInternet {
    public void exibirPagina();

    public void atualizarPagina();

    public void adicionarNovaAba();

    public String getPagina();

    public void setPagina(String site);
}