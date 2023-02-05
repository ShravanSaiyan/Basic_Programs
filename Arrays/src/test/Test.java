package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InvalidException {
        Scanner scanner = new Scanner(System.in);

        Graduate[] graduates = new Graduate[2];
        UnderGraduate[] underGraduates = new UnderGraduate[2];

        for (int i = 0; i < graduates.length; i++) {

            Graduate graduate = new Graduate();

            System.out.println("Enter student id");
            String studentId = scanner.next();
            if (studentId == null) {
                throw new InvalidException("studentId is null");
            }

            System.out.println("Enter student grade");
            int grade = scanner.nextInt();

            System.out.println("Enter student age");
            int age = scanner.nextInt();

            System.out.println("Enter student name");
            String studentName = scanner.next();

            graduate.setStudentId(studentId);
            graduate.setGrade(grade);
            graduate.setAge(age);
            graduate.setStudentName(studentName);

            graduates[i] = graduate;
        }


        for (int i = 0; i < underGraduates.length; i++) {

            UnderGraduate underGraduate = new UnderGraduate();

            System.out.println("Enter student id");
            String studentId = scanner.next();

            System.out.println("Enter student grade");
            int grade = scanner.nextInt();

            System.out.println("Enter student age");
            int age = scanner.nextInt();

            System.out.println("Enter student name");
            String studentName = scanner.next();

            underGraduate.setStudentId(studentId);
            underGraduate.setGrade(grade);
            underGraduate.setAge(age);
            underGraduate.setStudentName(studentName);

            underGraduates[i] = underGraduate;
        }

        Test.displayStudentDetails(graduates, underGraduates);
    }

    public static void displayStudentDetails(Graduate[] graduates, UnderGraduate[] underGraduates) {

        for (Graduate graduate : graduates) {
            System.out.println("The Student Name is " + graduate.getStudentName());
            System.out.println("The Student Id is " + graduate.getStudentId());
            System.out.println("The Student Age is " + graduate.getAge());
            System.out.println("The Student Grade is " + graduate.getGrade());
            System.out.println("The Student Result is " + (graduate.isPassed(graduate.getGrade()) ? "Passed" : "Failed"));
            if (graduate.isPassed(graduate.getGrade())) graduate.collectResult();
        }

        for (UnderGraduate underGraduate : underGraduates) {
            System.out.println("The Student Name is " + underGraduate.getStudentName());
            System.out.println("The Student Id is " + underGraduate.getStudentId());
            System.out.println("The Student Age is " + underGraduate.getAge());
            System.out.println("The Student Grade is " + underGraduate.getGrade());
            System.out.println("The Student Result is " + (underGraduate.isPassed(underGraduate.getGrade()) ? "Passed" : "Failed"));
            if (underGraduate.isPassed(underGraduate.getGrade())) underGraduate.collectResult();
        }

    }
}
