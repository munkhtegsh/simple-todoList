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

    public boolean getTuitionPaid(){
        return tuitionPaid;
    }

    //setters
    public void setName(String newName) {
        name = newName;
    }

    public void setID(String newID) {
        iD= newID;
    }

    public void setTuitionPaid(boolean newTuitionPaid) {
        tuitionPaid = newTuitionPaid;

    }

    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Student ID: " + iD + "\n" + "Tuition Paid: " + tuitionPaid;
    }
}