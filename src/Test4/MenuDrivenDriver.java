package Test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class StudentManupilation
{
    Student s=null;
    HashSet<Student > h = new HashSet<>();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
    void showMenu()
    {

        while(true) {
            try {
                System.out.println("1) for Insert \n2) Update\n3) Remove\n4) Fetch\n5 for exit");
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice) {
                    case 1:
                        this.addStudent();
                        break;
                    case 2:
                        this.updateStudent();
                        break;
                    case 3:
                        this.removeStudent();
                        break;
                    case 4:
                        this.fetchStudent();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Sorry Wrong Choice");
                        break;
                }


        }catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    }
    void addStudent() throws IOException
    {
        s = new Student();
        System.out.println("Enter id");

        s.setId(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter Name");
        s.setName(bufferedReader.readLine());
        System.out.println("Enter City");
        s.setCity(bufferedReader.readLine());
        System.out.println("Enter TechStack");
        s.setTechStack(bufferedReader.readLine());
        System.out.println("Enter Phone Number");
        s.setMobileNo(Long.parseLong(bufferedReader.readLine()));
        h.add(s);
    }
    void fetchStudent()
    {
        for(Student s : h)
        {

            System.out.println(s.getId()+"  "+s.getName()+"  "+s.getMobileNo()+"  "+s.getCity()+"  "+s.getTechStack());
        }
    }
    void updateStudent()throws Exception
    {
        System.out.println("Enter Id");
        int id=Integer.parseInt(bufferedReader.readLine());
        Student s =h.stream().filter(c->c.getId()==id).findFirst().get();
        System.out.println(s.getId()+"  "+s.getName()+"  "+s.getCity()+" "+s.getMobileNo()+" "+s.getTechStack());
        System.out.println("Enter What you want to update");
        String choice=bufferedReader.readLine();

        if(choice.equals("name")) {
            System.out.println("Enter New Name");
            s.setName(bufferedReader.readLine());
        }
        else if(choice.equals("city")) {
            System.out.println("Enter New city");
            s.setCity(bufferedReader.readLine());
        }
        else if(choice.equals("TechStack")) {
            System.out.println("Enter New TechStack");
            s.setTechStack(bufferedReader.readLine());
        }
        else if(choice.equals("MobileNumber"))
        {
            System.out.println("Enter New Phone NUmberr");
            s.setMobileNo(Long.parseLong(bufferedReader.readLine()));
        }
        else
        {

            System.out.println("Wrong choice");
        }
    }
    void removeStudent()throws Exception
    {
        System.out.println("Enter Id");
        int id=Integer.parseInt(bufferedReader.readLine());
        Student s =h.stream().filter(c->c.getId()==id).findFirst().get();
        h.remove(s);

    }
}
public class MenuDrivenDriver {
    public static void main(String[] args) {
     new StudentManupilation().showMenu();
    }
}

/*
OUTPUT
Enter What you want to update
Shailesh
Wrong choice
1) for Insert
2) Update
3) Remove
4) Fetch
5 for exit
4
800  Anuj  8788279  Dehradun  Java
1) for Insert
2) Update
3) Remove
4) Fetch
5 for exit
5
 */