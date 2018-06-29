package quanlysinhvien;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng sinh viên: ");
        int size = sc.nextInt();
        Student[] student = new Student[size];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].NhapTT();
        }
        System.out.println("--------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm kiếm: ");
        String Name = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < student.length; i++) {
            if (Name.equalsIgnoreCase(student[i].getName())) {
                student[i].getInfomation();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Sinh viên bạn tìm kiếm không tồn tại trong danh sách.");
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Hiển thị toàn bộ sinh viên có trong danh sách:");
        for (int i = 0; i < student.length; i++) {
            System.out.println("Infomation Student " + (i+1) + " :");
            student[i].getInfomation();
            System.out.println();
        }
    }
}
