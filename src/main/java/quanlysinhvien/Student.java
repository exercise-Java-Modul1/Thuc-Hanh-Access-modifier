package quanlysinhvien;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Scanner sc = new Scanner(System.in);

    public void NhapTT() {
        System.out.print("Input Name for student: ");
        setName(sc.nextLine());
        System.out.print("Nhập tuổi for student: ");
        setAge(sc.nextInt());
    }


    public void getInfomation() {
        System.out.println("Tên sinh viên là: " + getName());
        System.out.println("Tuổi của sinh viên là: " + getAge());
    }
}
