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
