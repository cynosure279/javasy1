package hfuuedu.cy.tm2;

// 学生类
public class Student {
    private String name;   // 姓名
    private String id;     // 考号
    private double total;  // 综合成绩
    private double sports; // 体育成绩

    public Student(String name, String id, double total, double sports) {
        this.name = name;
        this.id = id;
        this.total = total;
        this.sports = sports;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public double getSports() {
        return sports;
    }
}