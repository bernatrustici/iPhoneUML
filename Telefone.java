public class Telefone implements Phone{
    @Override
    public void ligar(String numero)
    {
        System.out.println("");
        System.out.println("Ligando para: " + numero);
        System.out.println("");
    }

    @Override
    public void atender() {
        System.out.println("");
        System.out.println("Atendendo chamada");
        System.out.println("");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("");
        System.out.println("Iniciando correio de voz");
        System.out.println("");
    }

}
