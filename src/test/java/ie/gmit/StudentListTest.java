package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest {

    // carryin instances of each class to be tested
    Student myStudent;
    StudentList myList;

    @BeforeEach
    void setup()
    {
        myStudent = new Student("Stephen", "stephenk669@gmail.com");
        myList = new StudentList();
    }

    @Test
    void testAdd()
    {
       myList.addStudent(myStudent);
       assertEquals(1,myList.getSize());

    }

}
