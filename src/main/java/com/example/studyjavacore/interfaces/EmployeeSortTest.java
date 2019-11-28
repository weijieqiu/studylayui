package com.example.studyjavacore.interfaces;

import java.util.Arrays;

/**
 * @PackageName: com.example.studyjavacore.interfaces
 * @ClassName: EmployeeSortTest
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/25  18:53
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff= new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 35000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);
        for(Employee e: staff){
            System.out.println("name= " + e.getName() +",salary=" + e.getSalary());
        }
    }
}
