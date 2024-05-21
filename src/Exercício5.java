import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int ida;

        System.out.print("Insira o seu nome: ");
            nome = scan.next();

        System.out.print("Insira sua idade: ");
             ida = scan.nextInt();

        if (ida >= 16) {
            System.out.println(nome+" Apto a Votar");

        } else if (ida < 16) {

            System.out.println(nome+ " não pode Votar");
        }
    }
}
