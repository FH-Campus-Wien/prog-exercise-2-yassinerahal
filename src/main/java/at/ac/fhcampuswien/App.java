package at.ac.fhcampuswien;

import org.w3c.dom.css.Counter;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
      double numbers;
      double max = 0;
      int count = 1;
        Scanner scanner;
        Scanner LargestNumber = new Scanner(System.in);
        do {
            System.out.println("Number" + count + ": ");
            numbers = Scanner.nextDouble();
            if (count == 1 && numbers <= 0) {
                System.out.println("No number entered.");
                return;

            } else if (numbers > max) {
                max = numbers;
            }
        } while (numbers > 0);
        String largestnumberformatted = String.format("The largest number is",max);
        System.out.println(largestnumberformatted.replaceAll(",","."));
        }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.println("n: ");
        int length = scanner.nextInt();
        if (length<=0){
            System.out.println("Invalid number!");

        }
        int test = 1;
        for (int i = 1 ; i <= length; i++){
            for (int y = 1; y <= i; y++){
                System.out.print(test++ + " ");
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int Line = 6;
        int row;
        int column;

        for (row=1; row<= Line; row = row +1){
            for (column = Line; column > row; column = column -1) {
                System.out.println(" ");
            }
            for (column = 0; column < row * 2 -1; column = column +1) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("c: ");

        if(h % 2 == 1) {
            for (int row = 0; row <= h/2; row = row +1){
                for (int spaces = row; spaces < h/2; spaces = spaces +1){
                    System.out.println(" ");
                }
                for (int difference = 0 - row; difference <= row; difference= difference+1){
                    System.out.println((char)(c-Math.abs(difference)));
                }
                System.out.println();
            }
            for (int row = h/2;row > 0; row = row -1){
                for (int rowForSpaces = row; rowForSpaces <= h/2; rowForSpaces=rowForSpaces +1){
                    System.out.println(" ");
                }
                for (int diffrence = 0 - row +1; diffrence < row; diffrence= diffrence+1){
                    System.out.println((char)(c-Math.abs(diffrence)));
                }
                System.out.println();
            }
                if (h%2 ==0) {
                    System.out.println("Invalid number!");

            }

        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        int num=0, neg=0, i=0;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.printf("Mark :", i+1);
            num = scanner.nextInt();
            if (num == 0) break;
            if (num > 5|| num < 0 ){
                System.out.println("Invalid mark!");
                continue;
            }
            sum+=num;
            i++;
            if(num == 5) neg++;
        }
        System.out.printf("Average: Negative mark: ", i>0 ? sum/i:sum,neg);
        scanner.close();
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
            System.out.print("n: ");
            int number = Scanner.nextInt();
            int remaining = 0;
            int sum = 0;

            while(number != 1 || number == 4)
            {
                remaining = number % 10;
                sum = sum + (remaining * remaining);
                number = number / 10;

                if (number == 0)
                {
                    number = sum;
                    sum = 0;
                }
                else if (sum == 4)
                {
                    System.out.println("Sad number!");
                    break;
                }
            }
            if (number == 1 )
            {
                System.out.println("Happy number!");
            }
        }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}