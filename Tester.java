public class Tester {
    public static void main(String[] args) {
        Course Physics = new Course("Physics", 0);
        Student Mark = new Student("Mark Mares", "A146", false);
        Physics.addStudent(Mark);

        System.out.println(Physics);
    }

}
