import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Задача1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] price = {1.57, 7.654, 9.986};
        int[] train = {2, 8, 35, 79, 12, 123, 145, 23, 12};
        //Task2
        System.out.println("Задача2");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = 0; i < price.length; i++) {
            if (i == price.length - 1) {
                System.out.println(price[i]);
                break;
            }
            System.out.print(price[i] + ", ");
        }
        for (int i = 0; i < train.length; i++) {
            if (i == train.length - 1) {
                System.out.println(train[i]);
                break;
            }
            System.out.print(train[i] + ", ");
        }
        //Task3
        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = price.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(price[i]);
                break;
            }
            System.out.print(price[i] + ", ");
        }
        for (int i = train.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(train[i]);
                break;
            }
            System.out.print(train[i] + ", ");
        }
        //Task4
        System.out.println("Задача 4");
        //int[] numbers = new int[3];
        //        numbers[0] = 1;
        //        numbers[1] = 2;
        //        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
