package Ex4;

public class Student {
    static int sumOfGrades;
    static int noOfStudents;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        Student.noOfStudents ++;
        Student.sumOfGrades +=grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }



    public static int avgGradeOfStudents(){
        return sumOfGrades/noOfStudents;
    }
}
