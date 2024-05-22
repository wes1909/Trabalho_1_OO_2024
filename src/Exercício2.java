/*2.	Escreva um programa em Java que leia uma distância inteira percorrida (em quilômetros),
bem como o total de combustível gasto (em litros)
e informe a média de consumo do veículo por km.
 */

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int km, gas, media;


        System.out.print("Informe a distância percorrida: (km) ");
            km = scan.nextInt();

       System.out.print("Agora informe o total de combustível usado: (Litros) ");
                gas = scan.nextInt();

                media = km/gas;

        System.out.println("**O consumo médio de seu veículo é de "+media+ " km/L**");

    }

}
