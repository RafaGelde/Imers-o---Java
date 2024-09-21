import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero : ");
        int numero = scan.nextInt();

        if (numero > 0){
            System.out.println("Seu numero é positivo");
        } else if (numero < 0) {
            System.out.println("Seu numero é negativo");
        }
        else {
            System.out.println("Seu numero é zero");
        }
    }
}
