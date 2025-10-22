package by.lessons.task11;

public class Employee extends Person{
    private Double salary;

    public Employee(String name, String surname,Double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
