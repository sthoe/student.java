public class Student extends Person {
    //extend


    public Student(String name, String surname, int age) {
        super(name, surname, age);
        //go and call constructor of superclass
    }

    public static void run(String[] args) {
        System.out.println("student is running");

    }
}
