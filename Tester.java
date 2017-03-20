public class Tester {
    public static void main(String[] args) {
        Course Physics = new Course("Physics", 34);
        Student Mark = new Student("Mark Mares", "A146", true);
        Physics.addStudent(Mark);

        System.out.println(Physics);
    }

}
