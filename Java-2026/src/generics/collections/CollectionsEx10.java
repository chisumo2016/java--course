package generics.collections;

import java.util.Comparator;
import java.util.TreeSet;

/*
   COMPARATOR - give more control  flexible
 */
public class CollectionsEx10 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentNumberComparator());  //ScoreComparator

        students.add(new Student("Alice", 2, 90.0));
        students.add(new Student("John", 1, 85.0));
        students.add(new Student("Bob", 3, 95.0));

        System.out.println(students);
    }
}

//comparator.compare(s1,s2)
class StudentNumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSno() - o2.getSno();
    }
}

//comparator.compare(s1,s2)
class ScoreComparator implements Comparator<Student> {

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
class Student {
    private String name;
    private int sno;
    private double score;





    public Student(String name, int sno, double score) {
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
}
