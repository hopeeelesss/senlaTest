package Task5;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число объектов, емкость сейфа и параметры объектов(сначала объем, потом ценность)");
        int size=in.nextInt();
        Safe safe=new Safe(in.nextInt());
        Subject[] subject=new Subject[size];
        for (int i=0;i<size;i++) {
            subject[i]=new Subject(in.nextInt(),in.nextInt());
        }
        safe.SortByValue(subject,0,size - 1);
        System.out.println("Максимальная ценность в сейфе: "+ safe.fullfillSafe(subject));
    }
}
