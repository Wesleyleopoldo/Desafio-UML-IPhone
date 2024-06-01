package ios.navegadorinternet;

/**
 * Já aqui vemos a classe que implementa o Navegador na Internet, aqui estou implementando os metodos
 * da interface e os sobescrevendo cumprindo com o contrato...
 */
public class ServicaoWeb implements NavegadorNaInternet{
    private String site;

    @Override
    public void exibirPagina(){
        verificarConexao();
        System.out.println("Exibindo Pagina");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    @Override
    public String getPagina(){
        return site;
    }

    public void setPagina(String site){
        this.site = site;
    }

    private void verificarConexao(){
        System.out.println("Verificando conexão..."); // Aqui para uma simulação de serviços para o negocio eu criei esse
    }                                                 // método privado para que o Usuario não tivesse que executar isso manualmente...:-)
}
