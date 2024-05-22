import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercício8 {

    //Método Maior e Menor;
    public static void MaiorMenor(){

            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> numeros = new ArrayList<>();

                int contador;
                Integer maior, menor;

                     for (contador = 1; contador <= 4; contador++) {
                            System.out.print("Digite um número: ");
                                     numeros.add(scan.nextInt());
                     }
                                    maior = Collections.max(numeros);
                                    menor = Collections.min(numeros);

                            System.out.println("**O maior numero é " + maior + " **");
                            System.out.println("**O menor numero é " + menor + " **");

        }
////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void main(String[] args) {

       MaiorMenor();

    }

}
