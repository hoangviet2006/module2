package student.service.impl;

import student.model.Student;
import student.model.Teacher;
import student.service.ITeacherService;

public class TeacherService implements ITeacherService {
    private static Teacher[] teachers = new Teacher[100];

    static {
        teachers[0] = new Teacher("Hoàng Việt1", 1);
        teachers[1] = new Teacher("Hoàng Việt2", 2);
        teachers[2] = new Teacher("Hoàng Việt3", 3);
    }

    @Override
    public Teacher[] getAll() {
        return teachers;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId() == id) {
                teachers[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Teacher[] search(String name) {
        Teacher[] searchList = new Teacher[100];
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getName().contains(name)){
               searchList[i]=teachers[i];
               break;
            }
        }
        return searchList;
    }
}
