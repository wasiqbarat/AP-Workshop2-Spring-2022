public class Student {
    private String firstName;
    private String lastName;

    //Students id contains at least 7 digits
    private String id;
    private double grade;

    public Student(String firstName, String lastName, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        if ( id.length() >= 7){
            this.id = id;
        }
        this.grade = 0;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getId() {
        return id;
    }
    public double getGrade(){
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        if (id.length() >= 7) {
            this.id = id;
        }else {
            System.out.println("your entered id is less than 7!!");
            return;
        }
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void printStudentInfo() {
        System.out.println(firstName+ " " + lastName + "\nId: "+ id + "\nGrade: "+ grade);
    }
}
