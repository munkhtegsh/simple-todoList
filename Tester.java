public class Tester {
    public static void main(String[] args) {
        Course physics = new Course("Physics", 10);
        Student mark = new Student("Mark Mares", "A146", true);

        physics.addStudent(mark);
      

        physics.dropStudent(eric);
        physics.printRoster();
    }

}
