package Car_Management_ShowRoom;

import java.util.Scanner;

public class Car implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void setDetail() {
        System.out.println("Car name is :"+car_name);
        System.out.println("Car color is :"+car_color);
        System.out.println("Car fuel type is :"+car_fuel_type);
        System.out.println("Total Car price is :"+car_price);
        System.out.println("Car type consist as :"+car_type);
        System.out.println("Car Transmission is :"+car_transmission);

    }

    @Override
    public void getDetail() {
        Scanner sc=new Scanner(System.in);
        System.out.print("******Enter Car Detail*******");
        System.out.println();
        System.out.print("Enter car name:");
        car_name=sc.nextLine();
        System.out.print("Enter car color:");
        car_color=sc.nextLine();
        System.out.print("Enter fuel type:");
        car_fuel_type=sc.nextLine();
        System.out.print("Enter car price:");
        car_price=sc.nextInt();
        System.out.print("Enter car Type:");
        car_type=sc.nextLine();
        System.out.print("Enter car transmission:");
        car_transmission=sc.nextLine();


    }
}
