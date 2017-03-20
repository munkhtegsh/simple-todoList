public class Student {

    private String name;
    private String iD;
    private boolean tuitionPaid;

    //constructor
    public Student (String initialName, String initialID, boolean initialTuitionPaid){
        name = initialName;
        iD = initialID;
        tuitionPaid = initialTuitionPaid;
    }

    //getters
    public String getName(){
        return name;
    }

    public String getID(){
        return iD;
    }

    public boolean isTuitionPaid(){
        return tuitionPaid;
    }

    //setters
    private void setName(String newName) {
        name = newName;
    }

    private void setID(String newID) {
        iD = newID;
    }

    private void setTuitionPaid(boolean newTuitionPaid) {
        tuitionPaid = newTuitionPaid;

    }

    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Student ID: " + iD + "\n" + "Tuition Paid: " + tuitionPaid;
    }
}