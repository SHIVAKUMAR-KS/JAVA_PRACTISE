package Car_Management_ShowRoom;

import java.util.Scanner;

interface utility{
    public  void  getDetail();
    public  void setDetail();
}
public class main {
    static  void main_menu(){
        System.out.println();
        System.out.println("*****Welcome to showRoom Management System*******");
        System.out.println();
        System.out.println("*********Enter your choice**********");
        System.out.println();
        System.out.println("1].ADD SHOWROOM \t\t\t 2].ADD EMPLOYE \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOM \t\t\t 5].GET EMPLOYE \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("*********Enter 0 to exit************");
    }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            ShowRoom showRooms[]=new ShowRoom[5];
            Employee employees[]=new Employee[5];
            Car cars[]=new Car[5];
            int car_counter=0;
            int showRoom_counter=0;
            int employe_counter=0;
            int choice=100;
            while(choice !=0){
                    main_menu();
                    choice=sc.nextInt();

                    while(choice!=9 && choice!=0){
                        switch (choice){
                            case 1:
                                showRooms[showRoom_counter]=new ShowRoom();
                                showRooms[showRoom_counter].setDetail();
                                showRoom_counter++;
                                System.out.println();
                                System.out.println("1].ADD NEW SHOWROOM");
                                System.out.println("9].GO BACK TO MAIN MENU");
                                choice=sc.nextInt();
                                break;
                            case 2:
                                employees[employe_counter]=new Employee();
                                employees[employe_counter].setDetail();
                                employe_counter++;
                                System.out.println();
                                System.out.println("3].ADD NEW Employee");
                                System.out.println("9].GO BACK TO MAIN MENU");
                                choice=sc.nextInt();
                                break;
                        }
                    }
            }
    }
}
