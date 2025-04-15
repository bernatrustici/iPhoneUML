import java.util.Scanner;

public class iPhone{

    public static void main(String[] args) {
    TocarMusica musica = new TocarMusica();
    Navegador browser = new Navegador();
    Telefone phone = new Telefone();

        var scanner = new Scanner(System.in);

        int select = 1;

        while(select >=1)
        {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Telefone - Fazer ligação");
        System.out.println("2 - Telefone - Atender");
        System.out.println("3 - Telefone - Iniciar correio de voz");

        System.out.println("- - -");
        System.out.println("4 - Música - Tocar");
        System.out.println("5 - Música - Pausar");
        System.out.println("6 - Música - Selecionar música");

        System.out.println("- - -");
        System.out.println("7 - Internet - Exibir página");
        System.out.println("8 - Internet - Nova aba");
        System.out.println("9 - Internet - Atualizar");

        System.out.println("- - -");
        System.out.println("0 - Sair");

        select = scanner.nextInt();

            switch (select) {
                case 1:
                    Scanner numero = new Scanner(System.in);
                    
                    System.out.println("Digite o número:");
                    String call = numero.nextLine();
                    phone.ligar(call);
                    
                    break;

                case 2:
                    phone.atender();
                    break;

                case 3:
                    phone.iniciarCorreioVoz();
                    break;
                
                case 4:
                    musica.tocar();
                    break;

                case 5:
                    musica.pausar();
                    break;

                case 6:
                    Scanner musicaHelper = new Scanner(System.in);
                        
                    System.out.println("Digite o nome da música:");
                    String musicHelp = musicaHelper.nextLine();
                    musica.selecionarMusica(musicHelp);
                    break;

                case 7:
                    Scanner page = new Scanner(System.in);
                        
                    System.out.println("Digite a URL:");
                    String url = page.nextLine();
                    browser.exibirPagina(url);
                    break;

                case 8:
                    browser.adicionarNovaAba();
                    break;

                case 9:
                    browser.atualizarPagina();
                    break;
                
            
                default:

                    break;
            }
        }

    }


}
