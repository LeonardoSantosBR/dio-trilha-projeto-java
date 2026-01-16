package poo.polimorfism;

public class Birds extends Animals {
    public Birds(String _name, String _family, String _country) {
        super(_name, _family, _country);
    }

    public void fly() {
        System.out.println("Bird is flying..");
    }

    public void hide() {
        System.out.println("Bird is Hiding..");
    }

    public void eat() {
        System.out.println("Bird is Eating..");
    }
}
