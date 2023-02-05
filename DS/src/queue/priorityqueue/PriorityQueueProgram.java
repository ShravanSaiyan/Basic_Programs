package queue.priorityqueue;

import java.util.*;

class Student {

    private String name;
    private double cgpa;
    private int id;

    public Student(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class Priorities {


    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue(events.size(), new MyComparator());
        events.stream().map(event -> event.split(" ")).forEach(strings ->
                {

                    if (strings[0].equals("ENTER")) {
                        priorityQueue.add(new Student(strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3])));
                    } else {
                        priorityQueue.poll();

                    }

                }

        );
        ArrayList<Student> students = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            students.add(priorityQueue.poll());
        }
        return students;
    }
}

class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (Double.compare(o1.getCgpa(), o2.getCgpa()) == 0) {
            return o1.getName().compareTo(o2.getName()) == 0 ? o1.getId() - o2.getId() : o1.getName().compareTo(o2.getName());
        } else {
            return Double.compare(o1.getCgpa(), o2.getCgpa()) < 0 ? 1 : -1;
        }


    }
}

public class PriorityQueueProgram {

    private static final Scanner scan = new Scanner(System.in);
    private static final Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
