/**
 * @author Paulo Henrique
 */

// Importando a biblioteca Scanner para ler a entrada de dados do usuário
import java.util.Scanner;

public class dadosDousuario {
    public static void main(String[] args) {

        // Criando um objeto do tipo Scanner com o nome scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá mundo !");

        System.out.println("Digite seu :");

        // Lendo o nome do usuário
        String nomeDousuario = scanner.nextLine();
        System.out.println("Seja bem-vindo " + nomeDousuario + "!");

        scanner.close();


    }
}



