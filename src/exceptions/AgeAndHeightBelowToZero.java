package exceptions;

public class AgeAndHeightBelowToZero extends RuntimeException {
    public AgeAndHeightBelowToZero() {
        super("Idade ou altura devem ser maiores que zero.");
    }
}
