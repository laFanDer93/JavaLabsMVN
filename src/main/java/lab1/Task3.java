package lab1;

import java.util.Scanner;

//Написать программу, которая принимает через командную строку
//несколько числовых диапазонов и выдает на экран список чисел.
//Например: ''1,2,4-7,18-21'' -> 1,2,4,5,6,7,18,19,20,21.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Формат ввода: 1,4,5-19,24-27,28,45");
        System.out.print("NUMBERS: ");
        String[] s2 = scanner.nextLine().split(",");
        for(String s: s2){
        if(s.indexOf('-') == (-1)){
            System.out.print(s+" ");
        } else {
            String num1 = s.substring(0,s.indexOf('-'));
            String num2 = s.substring(s.indexOf('-')+1);
            for (int i = Integer.parseInt(num1); i<=Integer.parseInt(num2);i++){
                System.out.print(i+ " ");
            }
        }
        }
    }

}
