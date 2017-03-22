import java.util.ArrayList;

public class CourseAL {

    // Instance Data
    private String name;
    private ArrayList<Student> roster;
    private int minEnrollment, maxEnrollment, currentEnrollment; // Minimum enrollment will be inclusive

    // Class Constructor
    public CourseAL (String courseNameInput, int MaxEnrollmentInput){
        this.name = courseNameInput;
        this.minEnrollment = 5;
        this.maxEnrollment = MaxEnrollmentInput;
        this.currentEnrollment = 0;
        this.roster = new ArrayList<Student>(maxEnrollment);
    }

    // Getter Methods
    public String getName(){ return this.name; }
    public int getMaxEnrollment(){ return this.maxEnrollment; }

    // Setter Methods
    public void setName(String newName) { this.name = newName; }
    public void setMaxEnrollment(int MaxEnrollmentInput) {
        if (MaxEnrollmentInput < this.minEnrollment){
            System.out.print("Enrollment must be greater than " + this.minEnrollment + " student!");
        }
        else if (MaxEnrollmentInput > this.maxEnrollment){
            System.out.print("Enrollment cannot be greater than " + this.maxEnrollment + " students.");
        }
        else{
            this.maxEnrollment = MaxEnrollmentInput;
        }
    }



    // addStudent method, receives student object and inserts to roster.
    public boolean addStudent(Student s) {
        boolean isStudentAdded = false;
        if (s.isTuitionPaid() && (currentEnrollment < maxEnrollment)) {
            roster.add(s);
            currentEnrollment++;
            isStudentAdded = true; // After adding student, boolean turns 'true'.
        } else {
            System.out.println("** Enrollment failed **");
            if (!s.isTuitionPaid())
                System.out.println(" └─ Sorry, unpaid tuition balance remain");
            if (currentEnrollment >= maxEnrollment) {
                System.out.println(" └─ Sorry, enrollment is full");
            }
        }
        return isStudentAdded;
    }

    /*
        public boolean dropStudent(Student s)
            if the student is currently in the roster,
            remove them from the roster and return true return false otherwise
        public void printRoster()
            print how many students are enrolled in the course
            also print the list of each student on a single line
            (use good object-oriented principles to access a text representation of each student!)
            print an appropriate message if there are no students yet enrolled
     */
     // dropStudent method
         public boolean dropStudent(Student s){
           for(int i=0; i<currentEnrollment; i++){
     // verify if the student is ni the roster by checking its name and id
             if(s.getName().equals(this.roster[i].getName()) && s.getID().equals(this.roster[i].getID())){
               // rotate the array in case any empty slot after dropping the student
               this.roster.remove(i);
               }
               this.currentEnrollment--;
               return true;//after dropping and rotating the array return true break the outter for loop
             }

           }

           return false;

         }

         public void printRoster(){

             // print out the result and specify a case when no students enrolled
             if(this.currentEnrollment == 0){System.out.println("There are no students enrolled in the class now.");}
             else{
               System.out.printf("Enrollment:%d\n",this.currentEnrollment);
               for(int i=0;i<currentEnrollment;i++){
                 System.out.println(this.roster[i].getName() +"  ("+ this.roster[i].getID() +")");
               }
             }
         }


    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Enrollment: " + currentEnrollment + "/"+ maxEnrollment;
    }

}
