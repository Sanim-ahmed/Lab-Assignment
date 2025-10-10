public class Constructor1 {
    
    String name;
    int age;

    
    Cat() {
        name = "Unknown";
        age = 0;
    }

    
    public static void main(String[] args) {
       
        Cat myCat = new Cat();

       
        System.out.println("Name: " + myCat.name);
        System.out.println("Age: " + myCat.age);
    }
}
