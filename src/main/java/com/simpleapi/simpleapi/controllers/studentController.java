package com.simpleapi.simpleapi.controllers;

import com.simpleapi.simpleapi.services.studentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class studentController {

    private final studentService studentService;

    public studentController(studentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addstudent")
    public String studentAdd(
            @RequestParam int ID,
            @RequestParam String name) {

        return studentService.studentAdd(ID, name);
    }

    @PutMapping("/Replace")
    public String replace(
            @RequestParam int i,
            @RequestParam int id,
            @RequestParam String name) {

        return studentService.replace(i, id, name);
    }

    @DeleteMapping("/delet")
    public String delete(@RequestParam int i) {

        return studentService.delete(i);
    }

    @PatchMapping("/PATCH")
    public String patchStudent(
            @RequestParam int i,
            @RequestParam String name) {

        return studentService.patchStudent(i, name);
    }

    @GetMapping("/student/name")
    public String searchByName(@RequestParam String name) {

        return studentService.searchByName(name);
    }

    @GetMapping("/student/id")
    public String searchById(@RequestParam int id) {

        return studentService.searchById(id);
    }

    @GetMapping("/students/{index}")
    public String getStudent(@PathVariable int index) {
        return studentService.getStudent(index);
    }

    @GetMapping("/students")
    public String[] getAllStudents() {

        return studentService.getAllStudents();
    }
}