package student.service.impl;

import student.model.Teacher1;
import student.service.ITeacherService;

public class TeacherService implements ITeacherService {
    private static Teacher1[] teachers = new Teacher1[100];

    static {
        teachers[0] = new Teacher1("Hoàng Việt1", 1);
        teachers[1] = new Teacher1("Hoàng Việt2", 2);
        teachers[2] = new Teacher1("Hoàng Việt3", 3);
    }

    @Override
    public Teacher1[] getAll() {
        return teachers;
    }

    @Override
    public void addTeacher(Teacher1 teacher) {
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
    public Teacher1[] search(String name) {
        Teacher1[] searchList = new Teacher1[100];
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getName().contains(name)){
               searchList[i]=teachers[i];
               break;
            }
        }
        return searchList;
    }
}
