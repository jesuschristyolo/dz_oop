package seminar4.controller;

import seminar4.model.Teacher;
import seminar4.repository.UserRepository;

import java.util.List;

public class TeacherController implements UserController<Teacher> {


    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

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
    public boolean removeUser(String fullName) {
        return false;
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return null;
    }
}
