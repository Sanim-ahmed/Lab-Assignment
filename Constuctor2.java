public class Constuctor2 {
    // Instance variables
    String name;
    String color;

    // Parameterized constructor
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Dog using parameterized constructor
        Dog myDog = new Dog("Buddy", "Brown");

        // Print the values
        System.out.println("Dog Name: " + myDog.name);
        System.out.println("Dog Color: " + myDog.color);
    }
}
