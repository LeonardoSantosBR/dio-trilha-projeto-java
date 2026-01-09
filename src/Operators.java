public class Operators {
    public static void typesOperators() {
        // ===============================
        // 1. OPERADORES ARITMETICOS
        // ===============================
        int a = 10;
        int b = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("Soma: " + (a + b));          // +
        System.out.println("Subtração: " + (a - b));    // -
        System.out.println("Multiplicação: " + (a * b)); // *
        System.out.println("Divisão: " + (a / b));      // /
        System.out.println("Resto (módulo): " + (a % b)); // %

        // ===============================
        // 2. OPERADORES RELACIONAIS
        // ===============================
        System.out.println("\n=== Operadores Relacionais ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // ===============================
        // 3. OPERADORES UNARIOS
        // ===============================
        int x = 5;

        System.out.println("\n=== Operadores Unários ===");
        System.out.println("Valor original: " + x);
        System.out.println("Incremento (++x): " + (++x));
        System.out.println("Decremento (--x): " + (--x));
        System.out.println("Negativo (-x): " + (-x));
        System.out.println("Positivo (+x): " + (+x));

        // ===============================
        // 4. OPERADORES LOGICOS
        // ===============================
        boolean cond1 = true;
        boolean cond2 = false;

        System.out.println("\n=== Operadores Lógicos ===");
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // AND
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // OR
        System.out.println("!cond1: " + (!cond1)); // NOT

        // ===============================
        // 5. OPERADOR TERNARIO
        // ===============================
        int idade = 18;

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("\n=== Operador Ternário ===");
        System.out.println("Resultado: " + resultado);
    }
}
