package Task5;

public class Safe {
    int capacity;
    int maxvalue;
    public Safe(int capacity) {
        this.capacity = capacity;
        maxvalue=0;
    }
    public void SortByValue(Subject[] subject, int low, int high){//алгоритм быстрой сортировки
        if (subject.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = subject[middle].getValue();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (subject[i].getValue() < opora) {
                i++;
            }

            while (subject[j].getValue() > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                Subject temp = subject[i];
                subject[i]=subject[j];
                subject[j]=temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            SortByValue(subject, low, j);

        if (high > i)
            SortByValue(subject, i, high);
    }

    public int fullfillSafe(Subject[] subject){
        for (int i= subject.length - 1;i>=0;i--) {
            if(subject[i].getCapacity()<=capacity){
                maxvalue+=subject[i].getValue();
                capacity-=subject[i].getCapacity();
            }
        }
        return maxvalue;
    }
}
