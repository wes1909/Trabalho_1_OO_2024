/*6.	Para doar sangue é necessário ter entre 18 e 67 anos.
Faça um aplicativo em Java que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.
 */

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ida;

            System.out.println("Descubra se você pode doar sangue: ");

            System.out.print("Quantos anos você têm? : ");
                 int idade = scan.nextInt();

                     if (idade >= 18 && idade <= 67) {
                             System.out.println("**Pode doar sangue!**");

                     } else {
                         System.out.println("**Não pode doar sangue**");
                    }
            }
        }
