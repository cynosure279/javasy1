package hfuuedu.cy;


class Point {
    protected double x;
    protected double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
}

class Circle extends Point {
    protected double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() { return r; }
    public void setR(double r) { this.r = r; }

    public double getArea() {
        return Math.PI * r * r;
    }
}

class Cylinder extends Circle {
    protected double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public double getH() { return h; }
    public void setH(double h) { this.h = h; }

    public double getVolume() {
        return getArea() * h;
    }
}

public class tm2 {
    public static void func() {

        Cylinder cyl1 = new Cylinder(0.0, 0.0, 3.0, 5.0);
        Cylinder cyl2 = new Cylinder(2.5, -1.5, 4.5, 10.0);

        System.out.println("--- 圆柱体 1 对象信息 ---");
        System.out.printf("轴心位置坐标: (%.1f, %.1f)\n", cyl1.getX(), cyl1.getY());
        System.out.printf("底面圆半径 r: %.1f\n", cyl1.getR());
        System.out.printf("圆柱体的高 h: %.1f\n", cyl1.getH());
        System.out.printf("底面积 Area : %.2f\n", cyl1.getArea());
        System.out.printf("圆柱体体积 V : %.2f\n\n", cyl1.getVolume());

        System.out.println("--- 圆柱体 2 对象信息 ---");
        System.out.printf("轴心位置坐标: (%.1f, %.1f)\n", cyl2.getX(), cyl2.getY());
        System.out.printf("底面圆半径 r: %.1f\n", cyl2.getR());
        System.out.printf("圆柱体的高 h: %.1f\n", cyl2.getH());
        System.out.printf("底面积 Area : %.2f\n", cyl2.getArea());
        System.out.printf("圆柱体体积 V : %.2f\n", cyl2.getVolume());

        System.out.println("\n====== 测试完成 ======");
    }
}