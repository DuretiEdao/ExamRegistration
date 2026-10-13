public class Student {
    static int examYear, fee;
    String name, status, centre;

    static {
        //Loads the general exam settings(year and registration fee)
        examYear = 2026; fee = 60000;
        System.out.println("1. STATIC: exam settings loaded");
    }
    {
        //Sets default registration status and exam center
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