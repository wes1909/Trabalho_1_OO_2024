import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;


        System.out.print("Entre com um número inteiro:");
            num = scan.nextInt();

        System.out.println("O Sucessor de "+num+ " é "+(num+1));
        System.out.println("O Antecessor de "+num+ " é "+(num-1));
    }
}
