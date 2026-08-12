package com.simpleapi.simpleapi.services;

import org.springframework.stereotype.Service;
@Service
public class studentService {

    String[] student = new String[5];
    int index = 0;
    public String studentAdd(int ID, String name) {

        if (index >= student.length) {
            return "student array is full";
        }
        student[index] = ID + " : " + name;
        index++;
        return "student added successfully";
    }

    public String replace(int i, int id, String name) {

        if (i < 0 || i >= student.length || student[i] == null) {
            return "student not found";
        }
        student[i] = id + " : " + name;
        return "replace done";
    }

    public String delete(int i) {
        if (i < 0 || i >= student.length || student[i] == null) {
            return "student not found";
        }
        student[i] = null;
        return "deleted";
    }

    public String patchStudent(int i, String name) {
        if (i < 0 || i >= student.length || student[i] == null) {
            return "student not found";
        }
        String id = student[i].split(" : ")[0];
        student[i] = id + " : " + name;
        return "student name updated";
    }

    public String searchByName(String name) {
        for (int i = 0; i < student.length; i++) {

            if (student[i] != null && student[i].contains(": " + name)) {
                return student[i];
            }
        }
        return "student not found";
    }

    public String searchById(int id) {

        for (int i = 0; i < student.length; i++) {

            if (student[i] != null && student[i].startsWith(id + " :")) {
                return student[i];
            }
        }
        return "student not found";
    }

    public String getStudent(int index) {

        if (index < 0 || index >= student.length) {
            return "student not found";
        }
        if (student[index] == null) {
            return "student not found";
        }
        return student[index];
    }

    public String[] getAllStudents() {
        return student;
    }
}