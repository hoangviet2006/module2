package student.service;

import student.model.Student;

public interface IStudentService {
    Student[] getAll();

    void add(Student student);

    boolean delete(int id);

    Student[] search(String id);

}
