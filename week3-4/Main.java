public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Amin", "P100");
        Person p2 = new Student("Radif", "S255");
        Person p3 = new Lecturer("Dr Ahmad", "L100");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}

