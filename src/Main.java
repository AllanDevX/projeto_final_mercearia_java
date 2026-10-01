import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arrProdu[] = {
                "Tomate", "Cebola", "Mamao", "Arroz", "Azeite",
                "Cuscuz", "Pimentao", "Feijao", "Macarrao", "Farofa"
        };

        float precoUnta[] = { 2.99f, 3.99f, 4.59f, 5.48f, 11.89f,
                2.99f, 1.89f, 5.48f, 3.99f, 5.99f
        };

        while (true) {
            System.out.println("Digite sua entrada: ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("EXIT")) {
                System.out.println("Saindo.....");
                while (true) {
                    System.out.println("Digite o produto: ");
                    String produto = sc.nextLine();
                    if (produto.equalsIgnoreCase("COMPLETE")) {
                        System.out.println("Saindo da secao produtos.....");
                        break;
                    }
                }
            }
        }
    }

}
