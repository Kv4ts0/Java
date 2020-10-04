import java.lang.reflect.Array;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        List<Integer> newList = new ArrayList<>();
        List<Integer> OddList = new ArrayList<>();
        List<Integer> EvenList = new ArrayList<>();
        List<Integer> sumOfEven = new ArrayList<>();
        List<Integer> sumOfOdd = new ArrayList<>();
        List<Integer> finalSum = new ArrayList<>();

        for(int i = 0; i<40; i++){
            int intRandom = rand.nextInt(b);
            newList.add(intRandom);
        }
        System.out.println("40 random numbers of [a, b]: \n \n" + newList);
        for (Integer integer : newList) {
            if (integer % 2 != 0) {
                OddList.add(integer);
                sumOfOdd.add(integer);
            }
        }
        int oddlements = 0;
        int sumofodd = 0;
        for (int i: sumOfOdd) {
            oddlements = oddlements+i;
        }
        System.out.println("\n" + OddList.size() + " Odds");


        for (Integer integer : newList) {
            if (integer % 2 == 0) {
                EvenList.add(integer);
                sumOfEven.add(integer);
            }
        }
        int evenelements = 0;
        int sumofeven = 0;
        for (int i: sumOfEven) {
             evenelements = evenelements+i;
        }
        int summ = (evenelements + oddlements);
        for(int i = 0; i<5; i++){
            int intRandom = rand.nextInt(summ);
            finalSum.add(intRandom);
        }
        System.out.println("\n" + EvenList.size() + " Evens");
        System.out.println("\n Sum of the Even and Odd numbers: " + (evenelements + oddlements));
        System.out.println("\n" + finalSum);


    }
}

