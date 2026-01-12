package exceptions;

public class InsuficientBalance extends RuntimeException {
    public InsuficientBalance() {
        super("Saldo insuficiente");
    }
}
