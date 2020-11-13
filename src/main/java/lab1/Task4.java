package lab1;


//Написать программу, осуществляющую свертку числовых диапазонов (обратная задача к 3).

public class Task4 {
    public static void main(String[] args) {
        String s1 = "1,2,3,4,5,6,7,8,9";
        String[] numStr = s1.split(",");
        int[] numInt = new int[numStr.length];
        for (int i = 0; i < numInt.length; i++) {
            numInt[i] = Integer.parseInt(numStr[i]);
        }
        someMethod(numInt);
//        System.out.println(Arrays.toString(numInt));
    }

    public static StringBuilder someMethod(int[] arr) {
        //[1, 2, 3, 20, 21, 22, 26]
        StringBuilder result = new StringBuilder();
        int i;
        for (i = 0; i < arr.length -3; i++) {
            System.out.print(arr[i]);
            if (arr[i] == arr[i + 1] - 1 && arr[i + 1] == arr[i + 2] - 1) {
                while (i < arr.length - 1 && arr[i] == arr[i + 1] - 1) {
                    i++;
                }
                System.out.print("-" + arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(",");
                }
            } else {
                System.out.print(",");
            }}


            if (i < arr.length) {
                result.append(arr[i]);
                if (arr[i] == arr[i + 1] - 1 && arr[i + 1] == arr[i + 2] - 1) {
                    result.append("-" + arr[i + 2]);
                } else {
                    for (; i < arr.length; i++) {
                    result.append("," + arr[i]);
                    }

                }
            }


        return result;
    }
}
