package org.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    int id;

    String name;

    double percentage;

    String specialization;

    public Student(int id, String name, double percentage, String specialization)
    {
        this.id = id;

        this.name = name;

        this.percentage = percentage;

        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString()
    {
        return id+"-"+name+"-"+percentage+"-"+specialization;
    }

    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<Student>();

        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

        Predicate<Student> mathsPredicate = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getSpecialization().equals("Mathematics");
            }
        };
        listOfStudents.forEach(student -> {
            if(mathsPredicate.test(student)) {
                System.out.println(student.getName());
            }
        });

        Consumer<Student> studentConsumer = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println("Student name: "+student.getName()+ " Student percentage : "+student.getPercentage());
            }
        };

        listOfStudents.forEach(studentConsumer::accept);
        Function<Student,String> nameFunction = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        };
        List<String> list = new ArrayList<>();
        listOfStudents.forEach(student -> {
            list.add(nameFunction.apply(student));
        });
        System.out.println("Student names : "+list);
    }
}
