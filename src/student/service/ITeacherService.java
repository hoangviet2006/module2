package student.service;

import student.model.Student;
import student.model.Teacher;

public interface ITeacherService {
    Teacher[] getAll();

    void addTeacher(Teacher teacher);

    boolean delete(int id);

    Teacher[] search(String name);
}
