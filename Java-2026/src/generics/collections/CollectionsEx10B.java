package generics.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionsEx10B {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new ScoreComparator());  //ScoreComparator

        students.add(new Student("Alice", 2, 90.0));
        students.add(new Student("John", 1, 85.0));
        students.add(new Student("Bob", 3, 95.0));

        System.out.println(students);
    }
}

//comparator.compare(s1,s2)
class StudentNumberComparator1 implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSno() - o2.getSno();
    }
}

//comparator.compare(s1,s2)
class ScoreComparator1 implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() > o2.getScore())
            return 1;
        else if (o1.getScore() < o2.getScore())
            return -1;
        else
            return 0;
    }
}

//s1.compareTo(s2)
class Student1 implements Comparable<Student>{
    private String name;
    private int sno;
    private double score;





    public Student1(String name, int sno, double score) {
        this.name = name;
        this.sno = sno;
        this.score = score;
    }

    public int getSno() {
        return sno;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) { //default comparison
        return this.name.compareTo(o.getName() );
    }
}