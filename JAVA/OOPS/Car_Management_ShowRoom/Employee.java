package Car_Management_ShowRoom;

import java.util.Scanner;
import java.util.UUID;

public class Employee implements utility{
    String emp_id;
    String emp_name;
    String emp_age;
    String emp_department;
    String showRoom;

    @Override
    public void getDetail() {
        System.out.println("ID:"+emp_id);
        System.out.println("Name:"+emp_name);
        System.out.println("Age:"+emp_age);
        System.out.println("Dapartment:"+emp_department);
        System.out.println("ShowRoom Name:"+showRoom);
    }
    @Override
    public void setDetail() {
        Scanner sc=new Scanner(System.in);
        UUID uuid=UUID.randomUUID();
        emp_id=String.valueOf(uuid);
        System.out.println("*********Enter the Employee Details:**********");
        System.out.println();
        System.out.print("Enter Employee Name :");
        emp_name= sc.nextLine();
        System.out.print("Enter Employee Age:");
        emp_age=sc.nextLine();
        System.out.print("Enter Employee's Department:");
        emp_department=sc.nextLine();
        System.out.print("Enter ShowRoom Name:");
        showRoom=sc.nextLine();
    }


}
