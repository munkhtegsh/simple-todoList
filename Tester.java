/*
        1. creates six students
        2. creates a course that can hold five students
        3. prints the course
        4. prints the roster
        5. adds the first five students to the course
        6. tries to add the sixth student and prints a message if the add fails
        7. prints the roster
        8. drops the third student from the course
        9. prints the roster
        10. tries again to add the sixth student to the course (it should succeed this time)
        11. prints the roster
 */
public class Tester {
    public static void main(String[] args) {

        // 1. Six Student Creation
        Student Mark    = new Student("Mark Mares", "A146", true);
        Student Andrew  = new Student("Andrew Munkhtegsh", "A147", true);
        Student Eric    = new Student("Eric Yongzheng", "A148", true);
        Student Sam     = new Student("Sam Bowne", "A149", true);
        Student Jessica = new Student("Jessica Masters", "A150", true);
        Student Greg    = new Student("Gregory Boyd", "A151", true);

        // 2. Course Creation w/ Five Student Hold
        Course Physics  = new Course("Physics", 5);


        // 3. Print Course
        System.out.println(Physics);

        // 4. Print Roster
        Physics.printRoster();

        // 5. Add 5 students to course
        Physics.addStudent(Mark);
        Physics.addStudent(Andrew);
        Physics.addStudent(Eric);
        Physics.addStudent(Sam);
        Physics.addStudent(Jessica);

        // 6. Tries to add & fail
        Physics.addStudent(Greg);

        // 7. Prints Roster (Again)
        Physics.printRoster();

        // 8. Drop 3rd student

        // 9. Prints Roster (Again)
        Physics.printRoster();

        // 10. Tries to add (Again) and succeed
        // addStudent()

        // 11. Prints Roster (Again)
        Physics.printRoster();
    }

}