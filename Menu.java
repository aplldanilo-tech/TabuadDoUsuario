import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao1;
        String aviso;
        int n = 0;

        do {
            System.out.println("Digite Uma  Das Alternatias Abaixo");
            System.out.println(" 1 Para Continuar " + " \n " + "  2 Para Sair");
           opcao1 = sc.nextInt();
            aviso = sc.nextLine();

           if(opcao1 == 1) {
                System.out.println("Digiete Uma Mensagem Antes De Continuar");
               aviso = sc.nextLine();
           }
           else if (opcao1 == 2) {
               System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado");
           } else {
               System.out.println("Opção Invalida");
           }
         break;
        } while (opcao1 ==  1);
        sc.close();
    }
}
