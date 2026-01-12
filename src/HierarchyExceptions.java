import exceptions.InsuficientBalance;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//--checked exception--
public class HierarchyExceptions {
    public static void hierarchyExceptions() {
        try {
            //tratando uma runtimeexception
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu saldo: ");
            int balance = scanner.nextInt();

            if (balance < 100) {
                throw new InsuficientBalance();
            }

            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
    }
}
