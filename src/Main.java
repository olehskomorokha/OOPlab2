import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Друк та зчитування матриць
        Scanner in = new Scanner(System.in);
        System.out.println("Start laba2");
        System.out.print("Введіть n: ");
        int n = in.nextInt();
        System.out.print("Введіть m: ");
        int m = in.nextInt();
        float [][] a = new  float [n][m];
        System.out.println("Введіть елементи 1-го массива: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a [i][j] = scan.nextFloat();
            }
        }
        float [][] b = new  float [n][m];
        System.out.println("Введіть елементи 2-го массива: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b [i][j] = scan.nextFloat();
            }
        }
        System.out.println("Матриця 1: ");
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Матриця 2: ");
        for(int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        // Додавання матриць ___________________________________________________________

        float [][] c = new float[n][m];
        System.out.println("Сума матриць а та b: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        //____________________________________________________________________________________
        //Обчислити суму найбільших елементів в рядках матриці з непарними номерами
        // та найменших елементів в рядках матриці з парними номерами
        float max = 0;
        float SumMax = 0;
        float min = 0;
        float SumMin = 0;
        for (int i = 0; i < c.length; i++) {
            if((i+1)%2 == 0) {
                max = c[i][0];
                for (int j = 0; j < c[i].length; j++) {

                    if (c[i][j] > max) {
                        max = c[i][j];
                    }
                }
                SumMax += max;
                System.out.println("Найбільший елемент ["+(i + 1)+"]: " + max);
            }
            else{
                min = c[i][0];
                for (int j = 0; j < c[i].length; j++) {
                    if (c[i][j] < min) {
                        min = c[i][j];
                    }
                }
                SumMin += min;
                System.out.println("Найменший елемент ["+(i + 1)+"]: " + min);
            }

        }


        System.out.println("Сума найбільших елементів матриці: " + SumMax);
        System.out.println("Сума найменших елементів матриці: " + SumMin);
    }
}