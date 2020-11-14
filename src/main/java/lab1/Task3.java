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
        String s = scanner.nextLine();
        deploy(s);

    }

    public static String deploy(String s) {
        String result = "";
        String[] sArr = s.split(",");
        for (String num : sArr) {
            if (num.indexOf('-') == (-1)) {
                System.out.print(num + " ");
                result+=(num+",");
            } else {
                String num1 = num.substring(0, num.indexOf('-'));
                String num2 = num.substring(num.indexOf('-') + 1);
                for (int i = Integer.parseInt(num1); i <= Integer.parseInt(num2); i++) {
                    result += (i + ",");
                    System.out.print(i + ",");
                }
            }
        }
        return result.substring(0,result.length()-1);
    }
}
