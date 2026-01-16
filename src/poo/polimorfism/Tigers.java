package poo.polimorfism;

public class Tigers extends Animals {
    public Tigers(String _name, String _family, String _country) {
        super(_name, _family, _country);
    }

    public void run() {
        System.out.println("Tiger is Running..");
    }

    public void hunt() {
        System.out.println("Tiger is Hunting..");
    }

    public void swim() {
        System.out.println("Tiger is Swimming..");
    }

    public void hide() {
        System.out.println("Tiger is Hiding..");
    }

    public void eat() {
        System.out.println("Tiger is Eating..");
    }
}
