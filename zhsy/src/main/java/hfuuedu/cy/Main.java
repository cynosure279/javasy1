package hfuuedu.cy;

import hfuuedu.cy.tm1.*;
import hfuuedu.cy.tm2.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入题目：(1/2)");
        int choice = sc.nextInt();
        if (choice == 1) {
            Shape rect = new Rectangle(5.0, 3.0);
            Shape circle = new Circle(4.0);
            System.out.println("矩形面积：" + rect.getArea());
            System.out.println("圆形面积：" + circle.getArea());
        } else if (choice == 2) {
            School school = new School();
            school.setLine(350);

            Student[] students = {
                new Student("张三", "2024001", 380, 85),
                new Student("李四", "2024002", 310, 98),
                new Student("王五", "2024003", 290, 88),
                new Student("赵六", "2024004", 340, 97)
            };

            Admission admission = new Admission();
            System.out.println("=== 录取结果 ===");
            for (Student s : students) {
                if (admission.isAdmitted(s, school)) {
                    System.out.println(s.getName() + "被录取");
                } else {
                    System.out.println(s.getName() + "未录取");
                }
            }
        }
        sc.close();
    }
}