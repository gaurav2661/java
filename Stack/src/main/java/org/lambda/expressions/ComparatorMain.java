package org.lambda.expressions;

import java.util.function.Predicate;

class Student {
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        // Before java 8
        // Implementation of Comparator using anonymous inner classes
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getId() - student2.getId();
            }
        };
        Student student1 = new Student();
        student1.setId(5);
        Student student2 = new Student();
        student2.setId(2);
        int compared = comparator.compare(student1,student2);
        System.out.println(compared);

        // After java 8
        // Using Lambda Expressions

        Comparator<Student> comparator1 = (student3, student4) -> student3.getId() - student4.getId();
        Student student3 = new Student();
        student3.setId(5);
        Student student4 = new Student();
        student4.setId(2);
        int compared1 = comparator1.compare(student3,student4);
        System.out.println(compared1);
    }
}
