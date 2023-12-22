package Person;

public class Employee extends Person{
    private int salary;
    public Employee(){
        this.salary = 350000;
    }
    public int getSalary(){
        return salary;
    }
}
