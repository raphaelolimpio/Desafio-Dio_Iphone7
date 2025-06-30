import java.util.Scanner;

public class Terminal {
    public static void main(String[] args)  {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        int opcao; 
        do { 
            System.out.println("Escolha uma opção:");
        System.out.println("1 - Tocar música");
        System.out.println("2 - Pausar música");
        System.out.println("3 - Selecionar música");
        System.out.println("4 - Ligar");
        System.out.println("5 - Atender");
        System.out.println("6 - Iniciar correio de voz");
        System.out.println("7 - Exibir página");
        System.out.println("8 - Adicionar nova aba");
        System.out.println("9 - Atualizar página");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcao) {
            case 1:
                iphone.playMusic();
                break;
                
            case 2:
                iphone.pauseMusic();
                break;
                
            case 3:
                System.out.print("Digite o nome da música: ");
                String musica = scanner.nextLine();
                iphone.SelectMusic(musica);
                break;
                
            case 4:
                System.out.print("Digite o número: ");
                String numero = scanner.nextLine();
                iphone.Ligar(numero);
                break;
                
            case 5:
                iphone.Atender();
                break;

            case 6:
                iphone.IniciarCorreioVoz();
                break;

            case 7:
                System.out.print("Digite a URL: ");
                String url = scanner.nextLine();
                iphone.ExibirPagina(url);
                break;
            case 8:
                iphone.adicionarNovaAba();
                break;
            case 9:
                iphone.AtualizarPagina();
                break;

            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
                
        }

    } while (opcao != 0);
    scanner.close();
    }
}


