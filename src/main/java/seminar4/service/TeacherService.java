package seminar4.service;

import seminar4.model.Teacher;
import seminar4.repository.TeacherRepository;

import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return null;
    }

    @Override
    public void removeUser(String fullName) {

    }
}
