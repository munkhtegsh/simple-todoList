import sun.plugin2.message.Message;

import java.util.Arrays;
import java.text.MessageFormat;

public class Course {

    private String name;
    private Student[] roster;
    private int maxEnrollment, currentEnrollment; // Added to count enrolled students
    private final int MAXCAPACITY = 1000; // unsure what max capacity should be; 1000 is just a placeholder
    private final int minEnrollment;

    //constructor
    public Course (String initialName, int initialMaxEnrollment){
        this.name = initialName;
        this.minEnrollment = 1;
        this.maxEnrollment = initialMaxEnrollment;
        this.currentEnrollment = 0;

        // roster added by Chris. Using maxEnrollment. NOTE: I think MAXCAPACITY might be redundant.
        roster = new Student[maxEnrollment];
    }

    //getters
    public String getName(){ return this.name; }
    public int getMaxEnrollment(){ return this.maxEnrollment; }
    public String getRoster() {
        String strRoster = "\n-----------------------------------\n";
        for (Student subscript : roster){
            if (subscript != null) {
                strRoster += subscript.toString() + "\n";
            }
        }
        if (roster[0] == null) strRoster += "    ** No student enrolled **\n";
        strRoster += "-----------------------------------\n";
        return strRoster;
    }

    //setters
    public void setName(String newName) { this.name = newName; }
    public void setMaxEnrollment(int newMaxEnrollment) {
        if (newMaxEnrollment < minEnrollment){
            System.out.print(MessageFormat.format("Enrollment must be greater than {0} student!", minEnrollment));
        }
        else if (newMaxEnrollment > MAXCAPACITY){
            System.out.print(MessageFormat.format("Enrollment cannot be greater than {0} students.", MAXCAPACITY));
        }
        else{
            maxEnrollment = newMaxEnrollment;
        }
    }

    // addStudent method, receives student object and inserts to roster (= student array).
    public boolean addStudent(Student s) {
        boolean isStudentAdded = false;
        if (s.isTuitionPaid() && (currentEnrollment < maxEnrollment)) {
            // 'currentEnrollment' is always the next array index to be used.
            // ex) if 3 people enrolled, array index 0, 1, 2 is filled. Therefore next index is 3.
            roster[currentEnrollment++] = s; // After adding student, increase currentEnrollment by 1.
            isStudentAdded = true; // After adding student, boolean turns 'true'.
        } else {
            System.out.println("    ** Enrollment failed **");
            if (!s.isTuitionPaid())
                System.out.println("     └─ Unpaid tuition balance remain");
            if (currentEnrollment >= maxEnrollment) {
                System.out.println("     └─ Sorry, enrollment is full");
            }
        }
        return isStudentAdded;
    }

    //String method
    public String toString(){
        return MessageFormat.format("Course: {0}\nEnrollment: {1}/{2}", name, currentEnrollment, maxEnrollment);
    }

}
