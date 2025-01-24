package student.service;

import student.model.Teacher1;

public interface ITeacherService {
    Teacher1[] getAll();

    void addTeacher(Teacher1 teacher);

    boolean delete(int id);

    Teacher1[] search(String name);
}
