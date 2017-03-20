public class Course {

    private String name;
    private int maxEnrollment;
    public final int MAXCAPACITY = 1000; // unsure what max capacity should be; 1000 is just a placeholder

    //constructor
    public Course (String initialName, int initialMaxEnrollment){
        name = initialName;
        maxEnrollment = initialMaxEnrollment;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getMaxEnrollment(){
        return maxEnrollment;
    }


    //setters
    public void setName(String newName) {
        name = newName;
    }

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

    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Max enrollment: " + maxEnrollment;
    }

}
