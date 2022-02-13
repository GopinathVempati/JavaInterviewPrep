package arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int sizeOfStudents = scanner.nextInt();
        ArrayList<Student> students = new ArrayList();
        for(int i=0;i<sizeOfStudents ;i++){
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            Student st = new Student(id,name,cgpa);
            students.add(st);
        }

        Collections.sort(students);
        for(Student s : students){
            System.out.println(s.name);
        }
    }
}
class Student implements Comparable<Student> {
    public int id;
    public String name;
    public double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s) {
        if (this.cgpa == s.cgpa) {
            if (this.name.equals(s.name)) {
                return Integer.compare(this.id, s.id);
            } else if(this.name.compareTo(s.name)<0)
                return -1;
            else
                return 1;
        } else {
            return this.cgpa > s.cgpa ? -1 : 1;
        }
    }
}
