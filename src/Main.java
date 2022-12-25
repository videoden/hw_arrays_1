import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        System.out.println("Задача 1");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] fract = {1.57, 7.654, 9.986};

        short[] mass = {1, 3, 5, 56, 567, 6};
        System.out.println();


    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] fract = {1.57, 7.654, 9.986};
        short[] mass = {1, 3, 5, 56, 567, 6};

        for (int a = 0; a < arr.length; a++) {
            if (a == arr.length - 1){
                System.out.print(arr[a]);
                break;
            }
            System.out.print(arr[a] + ", ");

        }
        System.out.println();



        for (int i = 0; i < fract.length; i++) {
            if (i == mass.length - 1){
                System.out.println(fract[i]);
                break;
            }
            System.out.print(fract[i] + ", ");
        }
        System.out.println();



        for (int i = 0; i < mass.length; i++) {
            if (i == mass.length - 1){
                System.out.println(mass[i]);
                break;
            }
            System.out.print(mass[i] + ", ");
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] fract = {1.57, 7.654, 9.986};

        short[] mass = {1, 3, 5, 56, 567, 6};

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        for (int i = fract.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(fract[i]);
                break;
            }
            System.out.print(fract[i] + ", ");
        }

        for (int i = mass.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(mass[i]);
                break;
            }
            System.out.print(mass[i] + ", ");
        }

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
         for (int i=0; i<arr.length; i++){
             if (arr[i] % 2 != 0) {
                 arr[i] = arr[i] + 1;
             }
         }
        System.out.println(Arrays.toString(arr));
    }


}