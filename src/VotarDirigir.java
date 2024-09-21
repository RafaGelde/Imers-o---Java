import java.util.Scanner;

public class VotarDirigir {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("Voce pode votar e dirigir");
        }
        else if (idade >= 16 && idade < 18) {
            System.out.println("Voce ja pode votar mas não pode dirigir");
        }
        else if (idade == 0){
            System.out.println("Numero invalido");
            main(args);
        }
        else {
            System.out.println("Voce não pode votar nem dirigir");
        }
    }
}

