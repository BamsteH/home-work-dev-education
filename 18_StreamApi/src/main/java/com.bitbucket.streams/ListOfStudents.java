package com.bitbucket.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ListOfStudents {

    private static ArrayList<Student> students = new ArrayList<>();


    public static void addDefaultStudents() {
        students.clear();
        Collections.addAll(students,
                new Student(1, "Nikolai", "Boyko", 1998,
                        "Simirenka xxA", "+380661242321", "FF", "6", "651"),
                new Student(2, "Alexa", "Olgova", 1999,
                        "Simirenka xxA", "+380663213454", "FF", "5", "551"),
                new Student(3, "Billie", "Jihn", 2000,
                        "Simirenka xxA", "+380666546341", "FF", "4", "451"),
                new Student(4, "Roza", "Tayler", 2001,
                        "Simirenka xxA", "+380665678696", "FF", "3", "351"),
                new Student(5, "Nick", "Alina", 1997,
                        "Simirenka xxA", "+380669305443", "RG", "6", "651"),
                new Student(6, "Kostya", "Boyko", 2000,
                        "Simirenka xxA", "+380664354231", "FF", "3", "351"),
                new Student(7, "Oleg", "Boyko", 1999,
                        "Simirenka xxA", "+380664123543", "RG", "5", "551"),
                new Student(8, "Sasha", "Boyko", 2000,
                        "Simirenka xxA", "+380664125436", "FF", "5", "551"),
                new Student(9, "Regina", "Boyko", 1998,
                        "Simirenka xxA", "+380666321451", "RG", "6", "651"));
    }

    public static Map<String, List<Student>> studentsFaculty() {
        return students.stream().collect(Collectors.groupingBy(Student::getFaculty));
    }


    public static List<Student> getByFaculty(String faculty) {
        return students
                .stream()
                .filter(student -> student.getFaculty().equals(faculty))
                .collect(Collectors.toList());
    }

    public static List<Student> getByFacultyAndCourse(String faculty, String course) {
        return students
                .stream()
                .filter(student -> student.getFaculty().equals(faculty))
                .filter(student -> student.getCourse().equals(course))
                .collect(Collectors.toList());
    }

    public static List<Student> getByYear(int year) {
        return students.stream()
                .filter(student -> student.getYearOfBirth() > year)
                .collect(Collectors.toList());
    }


    public static Optional<Student> getAnyByYear(int year) {
        return students
                .stream()
                .filter(student -> student.getYearOfBirth() > year)
                .findAny();
    }

    public static long getCountByFaculty(String faculty) {
        return students
                .stream()
                .filter(student -> student.getFaculty().equals(faculty))
                .count();
    }

    public static List<Student> setToOneFaculty(String faculty) {
        return students.stream()
                .map(student -> {
                    student.setFaculty(faculty);
                    return student;
                })
                .collect(Collectors.toList());
    }

    public static List<Student> setToOneGroup(String group) {
        return students.stream()
                .map(student -> {
                    student.setGroup(group);
                    return student;
                })
                .collect(Collectors.toList());
    }

    public static long countStudentsByGroup(String group){
        return students
                .stream()
                .filter(student -> student.getGroup().equals(group))
                .count();
    }

    public boolean checkAllAnFaculty(String faculty){
        return students
                .stream()
                .allMatch(s -> s.getFaculty().equals(faculty));
    }

    public boolean checkOneAnFaculty(String faculty){
        return students
                .stream()
                .anyMatch(s -> s.getFaculty().equals(faculty));
    }

    public boolean checkAllAnGroup(String group){
        return students
                .stream()
                .allMatch(s -> s.getGroup().equals(group));
    }

    public boolean checkOneAnGroup(String group){
        return students
                .stream()
                .anyMatch(s -> s.getGroup().equals(group));
    }
}
