public class Tester {
    public static void main(String[] args) {
        Course physics = new Course("Physics", 10);
        Student mark = new Student("Mark Mares", "A146", true);
        Student eric = new Student("Eric","W7800",true);
        Student sam = new Student("Sam","W701",true);
        physics.addStudent(mark);
        physics.addStudent(eric);
        physics.addStudent(sam);
        physics.dropStudent(eric);

        physics.printRoster();


    }

}
