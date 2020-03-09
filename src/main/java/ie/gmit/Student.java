package ie.gmit;

public class Student {


    private String Name;
    private String Email;

    public Student(String name, String email) {
       if (name == "" )
       {
         throw new IllegalArgumentException("Invalid Data passed to Name");
       }

       if (email == "")
       {
           throw new IllegalArgumentException("Invalid Data passed to Email");
       }
        Name = name;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }


}
