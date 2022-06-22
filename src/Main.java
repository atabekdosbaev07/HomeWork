import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Git");
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("калаган саат койун: ");
        int a = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.print("калаган мунот койун: ");
        int b = scanner.nextInt();
        System.out.print("калаган секунд койун: ");
        int c = scanner.nextInt();
        int d = (a * 3600) + (b * 60) + c;
        System.out.println("Ушунча секунд болот = " + d );*/

        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.printf(a+","+b+","+c);*/      // Жооп 1

        /*Random ran = new Random();
        int a1 = ran.nextInt(999);

        System.out.println(a1);
        int e = a1 %10 ;
        System.out.println(e);
        int d = a1 /10 %10;
        System.out.println(d);
        int y = a1/10 /10 %10;
        System.out.println(y);
        System.out.println(e+","+d+","+y);*/

      /*  Scanner s = new Scanner(System.in);
        System.out.println("rite: ");
        String string = s.nextLine();
        System.out.println("your:"+string);*/

        /*Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int ak1 = a %10; // 321 / 10 = 1
        int or2 = a /10 % 10; // 2
        int bi3 = a /10 /10 %10; // 3
        System.out.println(bi3 + ","+ or2 + "," + ak1);*/

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a == 1){
            System.out.println("Понедельник: "+"\nАнглис тили\nФизика\nТарых");
        } else if (a == 2 ){
            System.out.println("Вторник:"+"\nКыргыз тили\nАлгебра\nОрус тили");
        } else if (a == 3){
            System.out.println("Среда:"+"\nАдабьят\nТарых\nХимия");
        } else if (a == 4){
            System.out.println("Четверг:"+"\nФизика\nОрус тили\nГеометрия");
        } else if (a == 5){
            System.out.println("Пятница:"+"\nЧийуу\nТарых\nАлгебра");
        } else if (a == 6){
            System.out.println("Субота:"+"\nГеография\nМузыка\nКыргыз тили");
        }
         else if (a > 6 || a < 1) {
            System.out.println("Сабак жок");
        }

        //1 Жол


       /* int a1 = 3;
        switch (a1){
            case 1:
                System.out.println("Понедельник: "+"\nАнглис тили\nФизика\nТарых");
                break;
            case 2:
                System.out.println("Вторник:"+"\nКыргыз тили\nАлгебра\nОрус тили");
                break;
            case 3:
                System.out.println("Среда:"+"\nАдабьят\nТарых\nХимия");
                break;
            case 4:
                System.out.println("Четверг:"+"\nФизика\nОрус тили\nГеометрия");
                break;
            case 5:
                System.out.println("Пятница:"+"\nЧийуу\nТарых\nАлгебра");
                break;
            case 6:
                System.out.println("Субота:"+"\nГеография\nМузыка\nКыргыз тили");
                break;
            default:
                System.out.println("Сабак жок");}*/

        //2 Жол





        /*int[] num = new int[] {1,9,6,7,8,2,4,5,3,0};

        for (int i = 0; i < num.length; i++){

            System.out.print(num[i]+" ");
        }
        System.out.println(" Массивтин Элементери");

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){

                System.out.print(num[i]+" ");
            }
        } System.out.println(" Жуп сандар");*/





        /* int[] num = new int[] {1,9,6,7,8,2,4,5,3,0};

        for (int i = 0; i < num.length; i++){

            System.out.print(num[i]+" ");
        }
        System.out.println(" Массивтин Элементери");

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){

                System.out.print(num[i]+" ");
            }
        } System.out.println(" Жуп сандар");*/



       /* int[] array = {2,17,4,9,8,5,5,6,13,15,3,1,4,3};
        int min = array[0];
        int max = array[0];
        int indexmin = 0;
        int indexmax = 0;

        for (int i = 0; i < array.length; i++ ){
             if(array[i] < min){
                min = array[i];
                indexmin = i;
            }

            if(array[i] > max){
                max = array[i];
                indexmax = i;
            }
        }
        int san = array[indexmin];
        array[indexmin] = array[indexmax];
        array[indexmax] = san;

        for (int i = 0; i < array.length; i++ ){
            System.out.print(array[i]+" ");
        }*/




       /* int[] array = {2, 17, 4, 9, 8, 5, 5, 6, 13, 15, 3, 1, 4, 3};
        int min = array[0];
        int max = array[0];
        int  indexmin = 0;
        int indexmax = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                indexmin = i;
            }
            if(array[i] > max){
                max = array[i];
                indexmax = i;
            }
        }
        if (indexmax < indexmin){
            for (int i = indexmax+1; i < indexmin; i++) {
                sum += array[i];
            }
        }
        System.out.println(" = " + sum);*/


        // min(new int[]{1,2,3,5,4,8,9,10});
        // max(new int[]{8,2,6,4,9,12,15});


       /* System.out.println("= " +num(300));

    }
        static int num(int a) {
            int sum = 0;
            for (int i = 1; i < a; i++) {

                if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {

                    sum += i;
                }

            }
            return sum;*/

        int[] arr2 = {3, 6, 9};
        int[] arr = {3, 5, 8, 6};
        print(num(arr2,arr));

    }

    static int[] num(int[]  a, int[] b){
        int[] main1 = new int[a.length + b.length];
        for (int i = 0; i < main1.length; i++) {
            if(i < a.length){
                main1[i] = a[i]; //
            }else{
                main1[i] = b[i- a.length];
            }
        }

        return main1 ;


    }

    static void print(int[] d1){
        for (int i = 0; i < d1.length; i++) {
            System.out.print(d1[i] + " ");
        }
    }



    }

   /* static void min(int[] min) {
        int mini = min[0];
        for (int i = 0; i < min.length; i++) {
            if(min[i] < mini)
                mini = min[i];

        }System.out.println("Минималдуу элемнт = "+mini);

    }
    static void max(int[] max) {
        int maxi = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] > maxi) {
                maxi = max[i];
            }
        }
        System.out.println("Максималдуу элемент = "+maxi);
    }*/

    /*int sum = 0;

        for(int i = 1; i < 300; i++){

        if(i % 3 == 0 && i % 4 == 0 && i % 5 == 0){
        sum+=i;
        }

        }
        System.out.println(" = "+sum);*/

