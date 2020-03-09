package ie.gmit;

/*
unit test for student
 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    void testContructor()
    {
        Student myStudent = new Student("Stephen", "stephenk669@gmail.com");
        assertEquals("Stephen", myStudent.getName());
       // assertEquals("stephenk669@gmail.com", myStudent.getEmail());

    }

    @Test
    void testContructorNoName()
    {
       // Student myStudent = new Student("", "stephenk669@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Student("", "stephenk669@gmail.com"));
    }

    @Test
    void testContructorNoEmail()
    {
        //Student myStudent = new Student("Stephen", "");
        assertThrows(IllegalArgumentException.class, () ->new Student("Stephen", ""));
    }



}
