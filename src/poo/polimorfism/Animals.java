package poo.polimorfism;

/**
 * classe pai para Animals
 * //POLIMORFISM
 *
 * @author Leonardo Santos
 * @version 0.1
 * @since 15/01/2026
 */
public class Animals {
    String name;
    String family;
    String country;

    public Animals(String name, String family, String country) {
        this.name = name;
        this.family = family;
        this.country = country;
    }

    public void run() {
        System.out.println("Running..");
    }

    public void sing() {
        System.out.println("Singing..");
    }

    public void hunt() {
        System.out.println("Hunting..");
    }

    public void swim() {
        System.out.println("Swimming..");
    }

    public void fly() {
        System.out.println("flying..");
    }

    public void hide() {
        System.out.println("Hiding..");
    }

    public void eat() {
        System.out.println("Eating..");
    }
}
