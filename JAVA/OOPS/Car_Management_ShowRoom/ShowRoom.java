package Car_Management_ShowRoom;

import java.util.*;

public class ShowRoom implements utility{

    String ShowRoom_Name;
    String ShowRoom_Address;
    int total_Employe;
    int total_car_in_Stock=0;
    String manager_name;
    @Override
    public void getDetail() {
        System.out.println("ShowRoom Name: "+ShowRoom_Name);
        System.out.println("ShowRoom Address: "+ShowRoom_Address);
        System.out.println("Total Employe in this showroom :"+total_Employe);
        System.out.println("Total car in stock: "+total_car_in_Stock);
        System.out.println("Manager name of this ShowRoom:"+manager_name);

    }

    @Override
    public void setDetail() {
        Scanner sc=new Scanner(System.in);
        System.out.println("******Welcome to Car ShowRoom********");
        System.out.println();
        System.out.print("Enter ShowRoom Name:");
        ShowRoom_Name= sc.next();
        System.out.print("Enter ShowRoom Address :");
        ShowRoom_Address=sc.next();
        System.out.println("Enter the Manager Name :");
        manager_name=sc.next();
        System.out.print("Total Number of employee in showroom:");
        total_Employe=sc.nextInt();
        System.out.print("Total Number of car avalaible in stock");
        total_car_in_Stock=sc.nextInt();
    }
}
