package ie.gmit;

import java.util.ArrayList;

public class StudentList {

    // storing an array of objects students
    private ArrayList <Student> List;


    public StudentList() {
        List = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        List.add(student);
    }

    public int getSize()
    {
        List.size();
        return List.size();
    }

}
