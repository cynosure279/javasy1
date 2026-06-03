package hfuuedu.cy;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void kanmen() {
        System.out.println(name + "正在看门");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void zhuolaoshu() {
        System.out.println(name + "扑向了老鼠");
    }
}

public class tm1 {
    public static void func() {

        Cat myCat = new Cat("小咪", 2);
        System.out.println("创建了一只猫 -> 名字: " + myCat.name + ", 年龄: " + myCat.age + "岁");
        myCat.zhuolaoshu();

        Dog myDog = new Dog("旺财", 3);
        System.out.println("创建了一只狗 -> 名字: " + myDog.name + ", 年龄: " + myDog.age + "岁");
        myDog.kanmen();

    }
}