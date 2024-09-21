import java.util.Scanner;

public class GostoFav {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual sabor voce prefere ?\n\n1 - Salgados\n2 - Doces\n3 - Picante\n4 - Azedo\nOpção: ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Voce prefere sabores salgados");
                break;
            case 2:
                System.out.println("Voce prefere sabores doces");
                break;
            case 3:
                System.out.println("Voce prefere sabores picantes");
                break;
            case 4:
                System.out.println("Voce prefere sabores azedos");
                break;
            default:
                System.out.println("Opção invalida");
                main(args);
                break;
        }
    }
}
