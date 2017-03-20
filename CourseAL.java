import java.util.ArrayList;

public class CourseAL {

    // Instance Data
    private String name;
    private int maxEnrollment, currentEnrollment; // Added to count enrolled students
    private ArrayList<Student> roster;

    // Class Constructor
    public CourseAL (String initialName, int initialMaxEnrollment){
        this.name = initialName;
        this.maxEnrollment = initialMaxEnrollment;
        this.currentEnrollment = 0;

        // AL roster added by Chris. Using maxEnrollment
        roster = new ArrayList<>(maxEnrollment);
    }

    // Getter Methods
    public String getName(){ return this.name; }
    public int getMaxEnrollment(){ return this.maxEnrollment; }

    // Setter Methods
    public void setName(String newName) { this.name = newName; }
    public void setMaxEnrollment(int newMaxEnrollment) {
        if (newMaxEnrollment < 1){
            System.out.print("Enrollment must be greater than 1 student!");
        }
        else if (newMaxEnrollment > maxEnrollment){
            System.out.print("Enrollment cannot be greater than " + maxEnrollment + " students.");
        }
        else{
            maxEnrollment = newMaxEnrollment;
        }
    }

    // addStudent method, receives student object and inserts to roster (= student array).
    public boolean addStudent(Student s) {
        boolean isStudentAdded = false;
        if (s.isTuitionPaid() && (currentEnrollment < maxEnrollment)) {
            roster.add(s);
            currentEnrollment++;
            isStudentAdded = true; // After adding student, boolean turns 'true'.
        }
        return isStudentAdded;
    }

    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Enrollment: " + currentEnrollment + "/"+ maxEnrollment;
    }

}
