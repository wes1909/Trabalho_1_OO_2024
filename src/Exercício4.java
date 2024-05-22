/*4.	Crie um programa em Java que imprima o sexo de uma pessoa utilizando como valores de entrada M ou F.*/

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sex;


        System.out.print("Insira o seu sexo (M/F): ");
            sex = scan.next().toUpperCase();

        if (sex.equals("M")) {
            System.out.println("Você é Masculino");

        } else if (sex.equals("F")) {

            System.out.println("Você é Feminino ");

        } else {

            System.out.println("Sexo Inexistente");
        }

    }
}
