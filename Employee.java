public class Employee {
    String name;
    int id;
    double salary;
    String dob;
    String city;
    public Employee(String name, int id, double salary,String dob,String city){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.dob=dob;
        this.city=city;
    }
    public void displayInfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("XYZ", 101, 50000.0,"26-11-2005","Dharwad");
        e1.displayInfo();
    }
}
