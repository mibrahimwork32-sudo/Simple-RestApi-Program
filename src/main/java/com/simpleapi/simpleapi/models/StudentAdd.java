package models;

public class StudentAdd {

    int id;
    String name;

    public StudentAdd(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int studentIdList() {
        return id;
    }

    public String getName() {
        return name;
    }
}