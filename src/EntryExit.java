import java.util.Scanner;

public class EntryExit {
    public static void typesEntryExit() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10: ");
        int nmb = scanner.nextInt();

        if (nmb < 1 || nmb > 10)
            throw new Exception("Número tem que estar entre 1 e 10");
    }
}

