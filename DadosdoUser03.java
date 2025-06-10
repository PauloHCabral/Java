/**
 * @author Paulo Henrique
 */

import java.util.Scanner;

public class DadosdoUser03 {
    public static void main(String [] args) {


        System.out.println("Olá, qual é o seu nome ?");

        Scanner nomeUsuario = new Scanner(System.in);

        String nome = nomeUsuario.nextLine();
        System.out.println("Sejá bem-vindo(a) " +nome);

        Scanner pedeIdade = new Scanner(System.in);

        System.out.println("Digite sua idade:");

        int receIdade = pedeIdade.nextInt();

        System.out.println(nome+ "você tem " +receIdade+ " anos !");

        System.out.println("Calculadora");

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");

        int x = input.nextInt();

        System.out.println("Digite outro valor:");

        int y = input.nextInt();

        int multiplica = x * y;

        System.out.println("A multiplicação de x * y ="+multiplica);



    }
}

