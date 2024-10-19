package Car_Management_ShowRoom;

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

    }
}
