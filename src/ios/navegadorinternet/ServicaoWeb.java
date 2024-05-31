package ios.navegadorinternet;

public class ServicaoWeb implements NavegadorNaInternet{
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
}
