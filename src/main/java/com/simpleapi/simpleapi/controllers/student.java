package com.simpleapi.simpleapi.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class student {

    String[] student = new String[5];
    int index = 0;

    @PostMapping("/addstudent")
    public String studentAdd(@RequestParam int ID, @RequestParam String name) {
        student[index] = ID + " : " + name;
        index++;
        return "student added successfully";
    }
    @PutMapping("/Replace")
    public String replace(@RequestParam int i ,@RequestParam int id,@RequestParam String name ) {
        String oldStudent = student[i];
        if (oldStudent == null) {
            return "student not found";
        }
            student[i] = id + " : " + name;
            return "replace done";
    }

    @DeleteMapping("/delet")
    public String delete(@RequestParam int i){
        student[i]=null;
        return "deleted";
    }
    @PatchMapping("/PATCH")
    public String patchStudent(@RequestParam int i, @RequestParam String name) {
        String oldStudent = student[i];
        if (oldStudent == null) {
            return "student not found";
        }
        String id = oldStudent.split(" : ")[0];
        student[i] = id + " : " + name;
        return "student name updated updated";
    }

    @GetMapping("/students/{index}")
    public String getStudent(@PathVariable int index) {
        if (index < 0 || index >= student.length) {
            return "student not found";
        }
        if (student[index] == null) {
            return "student not found";
        }
        return student[index];
    }

}