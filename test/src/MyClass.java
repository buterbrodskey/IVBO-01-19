import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int[] arr = {25, 25, 25, 125, 33};
        int res = 0;

        for (int i = 0; i < arr.length; i++)            // подсчёт суммы элементов массива с помощью do while
        {
            res += arr[i];
        }
        System.out.println(res);

        int j = 0;
        res = 0;

        while (j != arr.length)          // подсчёт суммы элементов массива с помощью while
        {
            res += arr[j];
            j++;
        }
        System.out.println(res);

        j = 0;
        res = 0;

        do {            // подсчёт суммы элементов массива с помощью do while
            res += arr[j];
            j++;
        } while (j != arr.length);
        System.out.println(res);


        System.out.print("Enter the 5 num: ");
        for (int i = 0; i < 5; i++) { // предполагаю 5 чисел с клавиатуры
            res = inp.nextInt();
            System.out.print(res + " ");
        }
        System.out.println();
        // числа гармонического ряда
        float ans = 0f;
        for (float i = 1; i < 11; i++) {
            ans += 1 / i;
        }
        System.out.println(ans);

        // генерация массива случайных чисел
        for (int i = 0; i < 5; i++) { // беру 5 элементов
            arr[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " " );
        }

        // Arrays.sort(arr); // сортирую массив
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }


        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();


        System.out.println(fact(5));
    }

    public static int fact(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }
}
