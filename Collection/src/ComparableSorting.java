import java.util.*;

class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student student) {

        if (cgpa == student.cgpa)
            return firstName.equals(student.getFirstName()) ? id - student.getId() : firstName.compareTo(student.getFirstName());
        else return student.cgpa - cgpa > 0 ? 1 : -1;

    }
    private final int id;
    private final String firstName;
    private final double cgpa;

    public Student(int id, String firstName, double cgpa) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class ComparableSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String firstName = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, firstName, cgpa);
            studentList.add(st);

            testCases--;
        }

        for (Student st : studentList) {
            System.out.println(st.getFirstName());
        }
    }
}



