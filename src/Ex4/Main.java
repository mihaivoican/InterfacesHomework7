package Ex4;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jon", 6);
        System.out.println(String.format("Adaugat %s, nota %s. Nr total studenti: %s, nota medie: %s",
                s1.getName(),
                s1.getGrade(),
                Student.noOfStudents,
                Student.avgGradeOfStudents()));
        Student s2 = new Student("James",10);
        System.out.println(String.format("Adaugat %s, nota %s. Nr total studenti: %s, nota medie: %s",
                s2.getName(),
                s2.getGrade(),
                Student.noOfStudents,
                Student.avgGradeOfStudents()));
        Student s3 = new Student("Mircea",8);
        System.out.println(String.format("Adaugat %s, nota %s. Nr total studenti: %s, nota medie: %s",
                s3.getName(),
                s3.getGrade(),
                Student.noOfStudents,
                Student.avgGradeOfStudents()));

    }
}
