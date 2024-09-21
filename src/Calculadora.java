import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double numero1, numero2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro numero : ");
        numero1 = scan.nextInt();
        System.out.print("Digite o segundo numero : ");
        numero2 = scan.nextInt();

        System.out.print("Qual operação matematica voce quer fazer? \n\n1 - Soma\n2 - Subtração\n3 - Multiplicação \n4 - Divisão\nOpção: ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                numero1 = numero1+numero2;
                System.out.println("Resultado da soma é : "+ (int)numero1);
                break;
            case 2:
                numero1 = numero1 - numero2;
                System.out.println("Resultado da subtração é : "+ (int)numero1);
                break;
            case 3:
                numero1 = numero1 * numero2;
                System.out.println("Resultado da multiplicação é : "+ (int)numero1);
                break;
            case 4:
                numero1 = numero1 / numero2;
                System.out.println("Resultado da divisão é : "+ numero1);
                break;
            default:
                System.out.println("Opção invalida");
                main(args);
                break;
        }
    }
}
