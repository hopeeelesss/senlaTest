package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleDividers {
    public static String findDividers(int num){
        int k = 2;
        String res="1";
        while(num > 1){
            while(num % k == 0){
                num/=k;
                res+=("*"+k);
            }
            if(k%2==0)k++;
            else k+=2;//если число нечетное, то пропускаем последущее четное, тк оно составное
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число:");
        int num;
        try {
            num=in.nextInt();
            System.out.println(num + "=" + findDividers(num));
        }catch(InputMismatchException e){
            System.err.println("Данные введены некорректно");
        }
    }
}
