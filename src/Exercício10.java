import java.util.Scanner;

/*10.	Desenvolva um programa em Java que calcule a quantidade de dinheiro gasta por um fumante.
O usuário deverá fornecer o número de anos que ele fuma,
o número de cigarros fumados por dia e o preço de uma carteira.
Considere que existem 20 cigarros em uma carteira.
 */
public class Exercício10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano,dia;
        double preco,total=0;

        System.out.println("Quantos anos você fuma ?");
            ano = scan.nextInt();

        System.out.println("Quantos cigarros você fuma por dia ?");
            dia = scan.nextInt();

        System.out.println("Qual o preço de uma carteira ?");
            preco = scan.nextDouble();

   total = (ano * (365*dia))*(preco/20);

        System.out.println("O total gasto por "+(ano * (365*dia))+" cigarros fumados em "+ano+" anos foi de "+total+ " Reais");

    }
}