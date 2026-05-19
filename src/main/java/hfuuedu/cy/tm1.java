package hfuuedu.cy;

public class tm1 {
    public tm1(){}
    public static void func(int month){
        switch (month){
            case 3,4,5:
                System.out.println("春");
                break;
            case 6,7,8:
                System.out.println("夏");
                break;
            case 9,10,11:
                System.out.println("秋");
                break;
            case 1,2,12:
                System.out.println("冬");
                break;
            default:
                System.out.println("输入不合法");
        }
    }
}
