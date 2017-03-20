public class Course {

    private String name;
    private int maxEnrollment, currentEnrollment; // Added to count enrolled students
    private final int MAXCAPACITY = 1000; // unsure what max capacity should be; 1000 is just a placeholder
    private Student[] roster;

    //constructor
    public Course (String initialName, int initialMaxEnrollment){
        this.name = initialName;
        this.maxEnrollment = initialMaxEnrollment;
        this.currentEnrollment = 0;

        // roster added by Chris. Using maxEnrollment, I think MAXCAPACITY might be redundant.
        roster = new Student[maxEnrollment];
    }

    //getters
    public String getName(){ return this.name; }
    public int getMaxEnrollment(){ return this.maxEnrollment; }

    //setters
    public void setName(String newName) { this.name = newName; }
    public void setMaxEnrollment(int newMaxEnrollment) {
        if (newMaxEnrollment < 1){
            System.out.print("Enrollment must be greater than 1 student!");
        }
        else if (newMaxEnrollment > MAXCAPACITY){
            System.out.print("Enrollment cannot be greater than " + MAXCAPACITY + " students.");
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
        }
        return isStudentAdded;
    }

    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Enrollment: " + currentEnrollment + "/"+ maxEnrollment;
    }

}
