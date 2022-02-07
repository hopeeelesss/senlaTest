package Task1;

import java.util.Scanner;

public class SumOfDigitsInString {
    public static int getSum(String line){
        int sum=0;
        char[] charArray=line.toCharArray();
        for (int i=0;i<line.length();i++){
            if(charArray[i]<=57 && charArray[i]>=48)//коды 0 и 9 в аскии
                sum+=charArray[i] - 48;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите произвольную строку:");
        int sum=getSum(in.nextLine());
        System.out.println("Сумма цифр в строке:"+ sum);
    }
}
