import exceptions.AgeAndHeightBelowToZero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void execptions() {
        try {
            //=== exceptions ===
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite sua idade: ");
            int nmb = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double height = scanner.nextDouble();

            if (nmb <= 0 || height <= 0)
                throw new AgeAndHeightBelowToZero();
        } catch (InputMismatchException e) {
            System.out.println("Idade e altura precisam ser numéricos.");
        }
    }
}
