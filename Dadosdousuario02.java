/**
 * @author Paulo Henrique
 */
import java.util.Scanner;

public class Dadosdousuario02 {
    public static void main(String [] args){

        System.out.println("Olá mundo !");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boa noite, qual é o seu nome ?");

        String nome = scanner.nextLine();
        System.out.println("Olá, sejá bem-vindo " +nome + "!");


        Scanner pedeIdade = new Scanner(System.in);
        System.out.println("Quantos anos você tem ?");

        int idade = pedeIdade.nextInt();
        System.out.println("Você tem " + idade + " anos");

        System.out.println("Operações matemáticas !");

        Scanner calcule = new Scanner(System.in);
        System.out.println("Digite um número:");

        int a = calcule.nextInt();

        System.out.println("Digite outro número:");

        int b = calcule.nextInt();

        int multiplica = a * b;

        System.out.println("A multiplicação de a * b é = " +multiplica);












    }

}
