import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Obter o nome do cliente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + "!");

        // Obter a idade do cliente
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}
