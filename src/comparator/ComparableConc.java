package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableConc {

    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList();
        students.add(new Student(1,70));
        students.add(new Student(2,72));
        students.add(new Student(3,60));
        students.add(new Student(4,20));
        students.add(new Student(5,55));
        Collections.sort(students);
        for (Student s : students){
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student>{
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.marks, this.marks);
    }
}
