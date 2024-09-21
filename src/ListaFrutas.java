import java.util.Scanner;

public class ListaFrutas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] fruta = new String[5];
        int opcao, ponteiro = 0;
        char opcao2;

        do
        {
            System.out.print("|-------Menu--------\n|1 - Listar\n|2 - Adicionar\n|3 - Remover\n|-------Menu--------\nOpção: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    if (ponteiro == 0){
                        System.out.println("A lista esta vazia");
                    }
                    else{
                        for (int i = 0; i < ponteiro; i++) {
                            System.out.println(i+1+"º Fruta : "+ fruta[i]);
                        }
                    }
                    break;
                case 2:
                    if (ponteiro >= 0) {
                        System.out.println("Qual fruta gostaria de adicionar ?");
                        fruta[ponteiro] = scan.next();
                        ponteiro++;
                    }
                    else if (ponteiro < 5){
                        System.out.println("A lista esta cheia");
                    }
                    break;
                case 3:
                    System.out.println("Deseja realmente excluir a ultima fruta da lista? [S/N]");
                    opcao2 = scan.next().charAt(0);
                    if (opcao2 == 'S' || opcao2 == 's') {
                        ponteiro--;
                    }
                    else{
                        System.out.println("A fruta não foi removida");
                    }
                    break;
                default:
                    System.out.println("Programa finalizado");
                    break;
            }
        } while (opcao > 0 && opcao < 4);
    }
}
