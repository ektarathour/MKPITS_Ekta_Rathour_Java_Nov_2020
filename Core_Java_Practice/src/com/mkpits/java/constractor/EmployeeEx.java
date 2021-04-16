// WAP to employee class having constructor  overloading
package com.mkpits.java.constractor;

class Employee {
    public int empid;
    String empname;
    String designation;
    int salary;

    public Employee() {
        empname = "ekta";
        designation = "manager";
        salary = 2000;
    }

    public Employee(String en, String de, int sa) {
        empname = en;
        designation = de;
        salary = sa;
    }

    public Employee(String en, int sa, String de) {
        empname = en;
        salary = sa;
        designation = de;
    }

    public void show() {
        System.out.println("empname=" + empname);
        System.out.println("designation=" + designation);
        System.out.println("salary=" + salary);
    }

    public void getdata(int en, String ename, String ed, float sa) {
    }

    public void showdata() {
    }
}

class EmployeeEX {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("\n");
        System.out.println("employee 1 details");
        e.show();
        Employee e1 = new Employee();
        System.out.println("\n");
        System.out.println("employee 2 detail");
        e1.show();
        Employee e2 = new Employee();
        System.out.println("\n");
        System.out.println("employee 3 deatil");
        e2.show();
    }
}







