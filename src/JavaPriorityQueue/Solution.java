package JavaPriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        java.util.PriorityQueue<Student> queue = new java.util.PriorityQueue<Student>(11, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b){
                if(a.getCGPA() == b.getCGPA()){
                    if(a.getName().equals(b.getName())){
                        return a.getID() > b.getID() ? 1 : -1;
                    }else{
                        return a.getName().compareTo(b.getName());
                    }
                }else{
                    return a.getCGPA() > b.getCGPA() ? -1 : 1;
                }
            }
        });

        List<Student> list = new ArrayList<>();


        for (String ev: events){
            String[] params = ev.split(" ");
            switch (params[0]) {
                case "ENTER":
                    queue.add(new Student(
                                    Integer.parseInt(params[3]),
                                    params[1],
                                    Double.parseDouble(params[2])
                            )
                    );
                    break;
                case "SERVED":
                    queue.poll();
                    break;
                default:
                    System.err.println("Unsupported command.");
            }
        }

        while(!queue.isEmpty()) {
            list.add(queue.poll());
        }

        return list;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

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