package Ex4;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jon", 4);
        System.out.println(String.format("Adaugat %s, clasa %s. Nr total studenti: %s, clasa medie: %s",
                s1.getName(),
                s1.getGrade(),
                Student.noOfStudents,
                Student.avgGradeOfStudents()));
        Student s2 = new Student("James",12);
        System.out.println(String.format("Adaugat %s, clasa %s. Nr total studenti: %s, clasa medie: %s",
                s2.getName(),
                s2.getGrade(),
                Student.noOfStudents,
                Student.avgGradeOfStudents()));
        Student s3 = new Student("Mircea",1);
        System.out.println(String.format("Adaugat %s, clasa %s. Nr total studenti: %s, clasa medie: %s",
                s3.getName(),
                s3.getGrade(),
                Student.noOfStudents,
                Student.avgGradeOfStudents()));

    }
}
