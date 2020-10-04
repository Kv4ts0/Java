import java.util.Scanner;
public class ClassA {
    public ClassA() {
        System.out.println("Hello");
    }
    protected int x = 0;
    void method1() {
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
    }
    void method2() {
        System.out.println(x + 12);
    }
    void method3() {
        if (x % 2 == 0) {
            System.out.println("The number is odd");
        }
    }
    static class ClassB extends ClassA {
        int y = 0;

        void method1_1() {
            Scanner input = new Scanner(System.in);
            y = input.nextInt();
        }
        public void method2_2(Integer x) {
            System.out.println(y+x);
        }
    }
}
