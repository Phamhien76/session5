package session6Oop.baiTap6;

import java.util.Scanner;

public class Employee {
  /*
  Xây dựng lớp Employee
    Xây dựng lớp Employee gồm các thuộc tính như: mã nhân viên(employeeId), tên nhân viên (employeeName) ,
     tuổi (age), giới tính (gen), hệ số lương(rate) và lương(salary). các phương thức khởi tạo (constructor) 0 tham số
      và có tham số, phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng trừ lương,
      phương thức displayData() cho phép hiển thị toàn bộ thông tin nhân viên, phương thức calSalary() cho phép tính
      lương nhân viên theo công thức salary = rate * 1.300.000 .
   */

    //Bước 1: Tạo lớp Employee, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (constructors).
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
// nhập thông tin
    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hãy nhập mã nhân viên: ");
        this.employeeId= scanner.nextLine();
        System.out.println("Hãy nhập tên: ");
        this.employeeName=scanner.nextLine();
        System.out.println("Hãy nhập tuổi: ");
        this.age= Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập giơi tính:");
        this.gen=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Hãy nhập hệ số lương: ");
        this.rate=Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập lương: ");
        this.salary=Double.parseDouble(scanner.nextLine());
    }
    // hiện thị thông tin
    public void displayData(){
        System.out.printf("Mã NV: %s - Tên NV: %s -Tuổi NV: %d ", this.employeeId,this.employeeName,this.age );
        System.out.printf("Giới tính: %b - Hệ số lương: %d - Lương: %d", this.gen, this.rate,this.salary);
    }

    // tính lương
    public void  calSalary(){
        this.salary= this.rate*1300000;
    }

}
