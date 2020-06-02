import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private LocalDate birthDay;
    private String department;
    private static int nextID=1;

    {
        id=nextID;
        nextID++;
    }

    public Employee(String name,double salary,String department,int day,int month,int year){
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.birthDay=LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Employee.nextID = nextID;
    }

    @Override
    public String toString(){
        return this.getName()+" "+this.getSalary()+" "+this.getBirthDay()+" "+this.getDepartment();
    }

    public String[] getArray(){
        String[] myString= new String[]{String.valueOf(this.getId()),this.getName(), String.valueOf(this.getSalary()), String.valueOf(this.getBirthDay()),this.getDepartment()};
        return myString;
    }
}
