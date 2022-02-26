public class Main {
    public static void main(String[] args){
        Student st1 = new Student("wasiq", "Barat", "9931116");
        Student st2 = new Student("nwasiq", "nbarat", "20202020");

        st1.setGrade(20);
        st2.setGrade(21);

        st1.printStudentInfo();
        st2.printStudentInfo();
    }
}
