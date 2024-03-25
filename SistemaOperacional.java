import java.util.ArrayList;
import java.util.Scanner;

public class SistemaOperacional {

    public static int porcentagem(int votos, int totalVotos) {
        return (votos * 100) / totalVotos;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sistema = 0;
        int total = 0;
        ArrayList<Integer> windows = new ArrayList<>();
        ArrayList<Integer> unix = new ArrayList<>();
        ArrayList<Integer> linux = new ArrayList<>();
        ArrayList<Integer> netware = new ArrayList<>();
        ArrayList<Integer> macOs = new ArrayList<>();
        ArrayList<Integer> outros = new ArrayList<>();

        System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("As possíveis respostas são:\n" +
                "\n" +
                "1- Windows Server\n" +
                "2- Unix\n" +
                "3- Linux\n" +
                "4- Netware\n" +
                "5- Mac OS\n" +
                "6- Outro");
        System.out.println("-----------------------------");

        do {
            System.out.println("Qual a sua escolha: ");
            sistema = sc.nextInt();

            if (sistema == 0 || sistema > 6) {
                break;
            } else {
                total++;
            }

            switch (sistema) {
                case 1:
                    windows.add(sistema);
                    break;
                case 2:
                    unix.add(sistema);
                    break;
                case 3:
                    linux.add(sistema);
                    break;
                case 4:
                    netware.add(sistema);
                    break;
                case 5:
                    macOs.add(sistema);
                    break;
                case 6:
                    outros.add(sistema);
                    break;
            }

        } while (sistema >= 1 && sistema <= 6);

        System.out.println("Sistema Operacional     Votos    %");
        System.out.println("-------------------     -----   ---");
        System.out.println("Windows Server:           " + windows.size() + "    (" + porcentagem(windows.size(), total) + "%)");
        System.out.println("Unix:                     " + unix.size() + "    (" + porcentagem(unix.size(), total) + "%)");
        System.out.println("Linux:                    " + linux.size() + "    (" + porcentagem(linux.size(), total) + "%)");
        System.out.println("Netware:                  " + netware.size() + "    (" + porcentagem(netware.size(), total) + "%)");
        System.out.println("Mac OS:                   " + macOs.size() + "    (" + porcentagem(macOs.size(), total) + "%)");
        System.out.println("Outros:                   " + outros.size() + "    (" + porcentagem(outros.size(), total) + "%)");

        System.out.println("-------------------     -----  ");
        System.out.println("Total:                    " + total);
    }
}
