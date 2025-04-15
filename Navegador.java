public class Navegador implements Browser{

    @Override
    public void exibirPagina(String url) {
        System.out.println("");
        System.out.println("Abrindo página: " + url);
        System.out.println("");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("");
        System.out.println("Nova aba");
        System.out.println("");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("");
        System.out.println("Atualizando página");
        System.out.println("");
    }

}
