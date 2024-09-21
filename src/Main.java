import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("Voce é maior de idade");
        }
        else if (idade < 0){
            System.out.println("Escreva uma idade valida");
            main(args);
        }
        else {
            System.out.println("Voce é menor de idade");
        }
    }
}