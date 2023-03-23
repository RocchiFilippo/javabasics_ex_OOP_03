package _3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student1 = new Student();

        student1.setStudentName("Franco");
        student1.setStudentAge(23);
        student1.setStudentID(10234);
        student1.setStudentScholarship(true);
        student1.setStudentSituation("good");

        System.out.println("student stats:" + "\nName = " + student1.getStudentName() + "\nAge = " + student1.getStudentAge() +
                            "\nID = " + student1.getStudentID() + "\nScholarship = " + student1.getStudentScholarship() +
                            "\nSituation = " + student1.getStudentSituation());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student2 = new Student();
        student2.setStudentName("Albert");
        student2.setStudentAge(-34);
        student2.setStudentID(78065947);
        student2.setStudentScholarship(false);
        student2.setStudentSituation("nice");

        System.out.println("student stats:" + "\nName = " + student2.getStudentName() +
                "\nAdjusted age = " + student2.getStudentAge() +
                "\nAdjusted ID = " + student2.getStudentID() +
                "\nAdjusted scholarship = " + student2.getStudentScholarship() +
                "\nSituation = " + student2.getStudentSituation());

        System.out.println("the school have only " + student2.getTotalStudents() + " student");
    }

}
