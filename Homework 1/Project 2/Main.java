public class Main {
    public static void main(String[] args) {
        ClassA a1 = new ClassA();
        ClassA.ClassB b1 = new ClassA.ClassB();
        a1.method1();
        a1.method2();
        a1.method3();
        b1.method1_1();
        b1.method2_2(6);
    }
}
