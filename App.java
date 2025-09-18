import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);


        while ( true){

            System.out.println("Digite Seu Nome Para Inicializarmos");
            String usuario = sc.nextLine();

            System.out.println("Digite Os Numeros Para Ser Calculado Na Tabuada;");
            int numero = sc.nextInt();
            int numero1 = sc.nextInt(); ;
            int tabuada = numero * numero1;


             System.out.println(" O Resultado De: " + numero + "  Multiplicado Por "  + numero1 +
                     " E  "  +   tabuada);
              return;
            }

    }

}
