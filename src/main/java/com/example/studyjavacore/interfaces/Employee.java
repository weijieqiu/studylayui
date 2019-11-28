package com.example.studyjavacore.interfaces;

/**
 * @PackageName: com.example.studyjavacore.interfaces
 * @ClassName: Employee
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/25  18:54
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary *byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
