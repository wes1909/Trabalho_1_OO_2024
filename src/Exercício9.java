/*9.	Faça um programa em Java que leia o nome e 3 notas de um aluno.
Se obtiver média maior que 7 exibir a mensagem de aprovado,
se ficar entre 5 e 7, exibir a mensagem em exame,
e se for abaixo disso, exibir reprovado. Lembrando que terá que exibir o nome do aluno também.
 */

import java.util.Scanner;

public class Exercício9 {

    public static void main(String[] args) {

        String nome;
        int nota, media = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
            nome = scan.next();

                for (int i=1; i<4; i++) {
                    System.out.println("Informe sua nota: ");
                         nota = scan.nextInt();

                        media += nota;
                 }
                media = media/3;

            if(media >= 7){
                System.out.println("Aprovado");

            } else if (media < 7 && media >= 5) {
                System.out.println("Em exame");
            }else{
                System.out.println("Reprovado");
            }
    }
}
