package services;

import models.StudentAdd;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<StudentAdd> student = new ArrayList<>();

    public String studentAdd(int id, String name) {

        student.add(new StudentAdd(id, name));

        return "student added successfully";
    }

    public List<StudentAdd> getStudents() {

        return student;
    }

    public String studentReplace(int id, String name) {

        for (int i = 0; i < student.size(); i++) {

            if (student.get(i).studentIdList() == id) {

                student.set(i, new StudentAdd(id, name));

                return "student updated successfully";
            }
        }

        return "student not found";
    }

    public String studentDelete(int id) {

        for (int i = 0; i < student.size(); i++) {

            if (student.get(i).studentIdList() == id) {

                student.remove(i);

                return "student deleted successfully";
            }
        }

        return "student not found";
    }
}