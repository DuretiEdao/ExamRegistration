public class Student {
    //static variables shared exam settings for all students
    static int examYear, fee;
    //Instance variables: each student has their own copy
    String name, status, centre;

    static {
        examYear = 2026; fee = 60000;
        System.out.println("1. STATIC: exam settings loaded");
    }
    {
        status = "Pending"; centre = "Kampala Centre";
        System.out.println("2. INSTANCE: defaults set");
    }
    Student(String name) {
        this.name = name;
        System.out.println("3. CONSTRUCTOR: " + name + " registered");
    }
    public static void main(String[] args) {
        System.out.println("Main started");
        new Student("Siwoye");
        new Student("Winta");
    }
}