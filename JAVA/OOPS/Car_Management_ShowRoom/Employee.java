package Car_Management_ShowRoom;

public class Employee implements utility{
    String emp_id;
    String emp_name;
    String emp_age;
    String emp_department;

    @Override
    public void getDetail() {
        System.out.println("ID:"+emp_id);
        System.out.println("Name:"+emp_name);
        System.out.println("Age:"+emp_age);
        System.out.println("Dapartment:"+emp_department);
    }
    @Override
    public void setDetail() {

    }


}
