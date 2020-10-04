import java.util.Scanner;
public class ClassC {
    int a,b,c = 0;
    void method1(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }
    void method2(){
        System.out.println("Last digit of the a is: " + a%10);
    }
    void method3() {
        while (b >= 10)
            b /= 10;
        System.out.println("First digit of the number: " + b);
    }
    void method4() {
        int k = c%10;
        while (c >= 10)
            c /= 10;
        System.out.println("Sum value of c: " + (k + c));
    }
    void method5() {
        System.out.println("mult value of Method 2 and Method 3 " + a%10*b);
    }
    void method6() {
        System.out.println("Sum value of Method 3 and Method 5 " + (b+(a%10*b)));
    }
}
