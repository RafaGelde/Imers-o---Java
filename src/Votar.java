import java.util.Scanner;

public class Votar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = scan.nextInt();

        if (idade >= 16){
            System.out.println("Voce ja pode votar");
        }
        else if (idade == 0){
            System.out.println("Escreva uma idade valida");
            main(args);
        }
        else {
            System.out.println("Voce não pode votar");
        }
    }
}

