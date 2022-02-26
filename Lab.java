public class Lab {
    private Student[] students;
    private String teacherName;
    // the day in which this lab is held
    private String dayOfWeek;
    private int maxSize;
    private int currentSize = 0;
    private double avgGrade;



    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        // create an array of students with the size of "maxSize"
        students = new Student[maxSize];
    }

    private int index = 0;

    public void enrollStudent(Student student){
        students[index] = student;
        index++;
        currentSize+= 1;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getDayOfWeek(){
        return dayOfWeek;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void printLabInfo() {
        System.out.println(teacherName + "\nday of the week: " + dayOfWeek + "maxSize :" + maxSize);
        for (int i = 0; i < currentSize; i++){
            students[i].printStudentInfo();
        }
        System.out.print("average of class: ");
        calAvg();
    }

    public void calAvg() {
        double average = 0;
        for (int i = 0; i < currentSize; i++) {
            average += students[i].getGrade();
        }
        System.out.print(average / currentSize + "\n" );
    }
}
