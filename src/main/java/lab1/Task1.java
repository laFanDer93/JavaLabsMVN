package lab1;

// Найти наибольшую последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000.
//Если оно чётное, то делим его на 2,
// а если нечётное, то умножаем на 3 и прибавляем 1 (получаем 3n + 1).
public class Task1 {
    public static void main(String[] args) {
//        System.out.println(collatz(27));
        int maxCollatz = 0;
        int currentCollatz = 0;
        for (int i = 2; i < 1000000; i++) {
            currentCollatz = collatz(i);
            if (collatz(maxCollatz) < currentCollatz) {
                maxCollatz = i;
            }
        }
        System.out.println(maxCollatz + " --> " + collatz(maxCollatz));
    }

    public static int collatz(int num) {
        if (num == 1) {
            return 0;
        }
        if (num % 2 == 0 && num > 1) return 1 + collatz(num / 2);
        else return 1 + collatz((num * 3) + 1);

    }
}
