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
    }
}
