package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Collectors utilts
       joining(delimiter) for strings joining
       toList()
       toSet()
       toMap(keyMapper, valueMapper)

       groupingBy()
            - grouping stream of elements using a function into a map .

       grouping(Function,Collector)
            - grouping stream if elements using a function into map
            - reduction is performed on each group using the downstairs collector .
 */
public class StreamsEx11 {

    public static void main(String[] args) {

        Stream<Student> studentStream = Stream.of(
                new Student(1, "John", 100), //100  ,"A"
                new Student(2, "Jane", 76), //76  "B"
                new Student(3, "Bob", 98), //89    "A"
                new Student(4, "Alice", 90) //90   "C"
        );

        //Trnslate the stream into a map of students grouped by score  Map<Integer, Student> Map<Key, Value>

//        Map<Integer, Student> studentMap = studentStream.
//                collect(Collectors.toMap(Student::getId, Function.identity()));// element part of stream value and key
//
//        System.out.println(studentMap);
        System.out.println();

        //Group all students based on score eg String , Double
//        Map<String, List<Student>> groupedStudents = studentStream
//                .collect(Collectors.groupingBy(Student::getScore));
//
//        System.out.println(groupedStudents);

        System.out.println();

        //Count of students per score , String ,Double
        Map<Double, Long> studentCountByScore = studentStream
                .collect(Collectors.groupingBy(Student::getScore, Collectors.counting()));

        System.out.println(studentCountByScore);

    }


}

class Student {
    private int id;
    private String name;
    private double  score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
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

    public double getScore() {

        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", score=" + score + "]"; //print out Student details
    }
}
