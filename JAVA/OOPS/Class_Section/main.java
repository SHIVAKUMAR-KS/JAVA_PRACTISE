package Class_Section;

class Student{
    public String name;
    public int age;
    public String StudentId;

    //constructor
    public Student(String name,int age,String StudentId){
        this.name=name;
        this.age=age;
        this.StudentId=StudentId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getStudentId(){
        return StudentId;
    }

    public void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("Student id is : "+StudentId);
    }

}
public class main {
    public static void main(String[] args) {
        Student st =new Student("Shiva",20,"05J2");
        Student st1=new Student("Ayush",23,"05J3");
        st.display();
        st1.display();
    }
    
}
