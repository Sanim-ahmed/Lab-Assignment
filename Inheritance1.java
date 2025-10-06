class Person {
    String name;
    int age;
    
    void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Teacher extends Person {
    String courseName;
    void displayTeacherinfo() {
        System.out.println("Course Name: " + courseName);
    }
}

class Student extends Person {
    int batch;
    void displayStudentInfo() {
        System.out.println("Batch: " + batch);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Sami";
        t1.age  = 21;
        t1.courseName = "OOP";
        
        Student st1 = new Student();
        st1.name = "Sanim";
        st1.age = 25;
        st1.batch = 65;
        
        System.out.println("=== Teacher Info ===");
        t1.displayTeacherinfo();
        t1.displayInfo();
        
        System.out.println("\n=== Student Info ===");
        st1.displayStudentInfo();
        st1.displayInfo();
    }
}
