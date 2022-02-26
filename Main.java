public class Main {
    public static void main(String[] args){
        Student st1 = new Student("wasiq1399", "Barat", "9931116");
        Student st2 = new Student("wasiq1400", "nbarat", "20202020");
        st1.setGrade(20);
        st2.setGrade(18);

        Lab aut1400 = new Lab("Mr.Smith", "Monday", 30);
        aut1400.enrollStudent(st1);
        aut1400.enrollStudent(st2);
        aut1400.printLabInfo();
    }
}
