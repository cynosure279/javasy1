package hfuuedu.cy;

public class tm2 {
    public static void func(String s){
        System.out.print("出生年月日：");
        for(int i = 6;i<=9;i++){
            System.out.print(s.charAt(i));
        }
        System.out.print("年");
        for(int i = 10;i<=11;i++){
            System.out.print(s.charAt(i));
        }
        System.out.print("月");
        for(int i = 12;i<=13;i++){
            System.out.print(s.charAt(i));
        }
        System.out.print("日");
        System.out.println();
        System.out.print("性别为：");
        if(s.charAt(16)=='1'){
            System.out.print("男");
        }else{
            System.out.print("女");
        }
        System.out.println();
    }
}
