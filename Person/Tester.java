package Person;

public class Tester {
    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        myEmployee.setName("eakkarin", "Masanglong");
        System.out.println(myEmployee.getFirstname() + " " + myEmployee.getLastname());
        System.out.println("salary : " + myEmployee.getSalary() + " Bath");
        ParttimeEmployee myParttimeEmployee = new ParttimeEmployee();
        System.out.println("================================");
        myParttimeEmployee.setName("eakkarat", "Masanglong");
        System.out.println(myParttimeEmployee.getFirstname() + " " + myParttimeEmployee.getLastname());
        myParttimeEmployee.setHour(7);
        myParttimeEmployee.setRate(1400);
        System.out.println("Parttime per day : " + (myParttimeEmployee.getPay())+ " Bath");
    }
}
