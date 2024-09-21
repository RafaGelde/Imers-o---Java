import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero : ");
        int num = scan.nextInt();

        if (num == 0){
            System.out.println("Numero invalido");
            main(args);
        }
        else if (num % 2 == 0){
            System.out.println("Seu numero é par");
        }
        else {
            System.out.println("Seu numero é impar");
        }
    }
}
