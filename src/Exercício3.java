/*3.	Faça um programa em Java que leia 2 números
e exiba qual deles é o maior ou então informe que são iguais.
 */

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numa, numb;


        System.out.print("Insira o primeiro número ");
            numa = scan.nextInt();

        System.out.print("Insira o segundo número ");
            numb = scan.nextInt();

                if(numa > numb) {
                    System.out.println(numa+" é maior que "+numb);

                } else if (numa < numb) {

                    System.out.println(numb+" é maior que "+numa);

                } else {

                    System.out.println(numa+" é igual a "+numb);
                    }

    }


}
