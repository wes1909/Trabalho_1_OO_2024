/*7.	Escreva um programa em Java que pergunte quanto o funcionário ganha por hora
e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */

import java.util.Scanner;

public class Exercício7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hsal,htrab,salm;


        System.out.print("Quanto você ganha por hora ?: ");
            hsal = scan.nextInt();

        System.out.print("Quantas horas você trabalhou no mês ? : ");
            htrab = scan.nextInt();

                    salm = hsal * htrab;

                    System.out.println("**Seu salário total no mês será de "+salm+" Reais**");

    }
}
