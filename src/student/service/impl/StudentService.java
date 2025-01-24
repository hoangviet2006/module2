package student.service.impl;

import student.model.Student;
import student.service.IStudentService;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Việt1");
        students[1] = new Student(2, "Việt2");
        students[2] = new Student(3, "Việt3");
        students[3] = new Student(4, "Việt4");
    }

    @Override
    public Student[] getAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && id == students[i].getId()) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Student[] search(String name) {
        Student[] listSearch = new Student[100];
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().contains(name)) {
                listSearch[i] = students[i];
            }
        }
        return listSearch;

    }

    @Override
    public boolean editStudent(int id,Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i].setName(student.getName());
                return true;
            }
        }
        return false;
    }

}
