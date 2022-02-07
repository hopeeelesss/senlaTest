package Task4;

import java.util.Stack;

public class BigDigits {
    private int maxNum;
    private String[] drawNum;
    BigDigits(int value){
        maxNum=0;
        drawNum=new String[5];
        drawNum[0]=" ";
        drawNum[1]=" ";
        drawNum[2]=" ";
        drawNum[3]=" ";
        drawNum[4]=" ";
        Stack stack1=new Stack<Integer>();
        while (value > 0){
            int digit=value % 10;
            value/=10;
            if(digit>maxNum){
                setMaxNum(digit);
            }
            stack1.push(digit);
        }
        drawBigDigits(stack1);
    }

    public void drawBigDigits(Stack stack1){
        while (!stack1.empty()){
            switch ((Integer)(stack1.pop())){
                default -> {
                    break;
                }
                case 0 -> {
                    get0();
                    break;
                }
                case 1 -> {
                    get1();
                    break;
                }
                case 2 -> {
                    get2();
                    break;
                }
                case 3 -> {
                    get3();
                    break;
                }
                case 4 -> {
                    get4();
                    break;
                }
                case 5 -> {
                    get5();
                    break;
                }
                case 6 -> {
                    get6();
                    break;
                }
                case 7 -> {
                    get7();
                    break;
                }
                case 8 -> {
                    get8();
                    break;
                }
                case 9 -> {
                    get9();
                    break;
                }
            }
        }
        for (String i:drawNum) {
            System.out.println(i);
        }
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void get1(){
        if(maxNum==1){
            drawNum[0]+=("  1 ");
            drawNum[1]+=(" 11 ");
            drawNum[2]+=("1 1 ");
            drawNum[3]+=("  1 ");
            drawNum[4]+=("  1 ");
        }else{
            drawNum[0]+=("  * ");
            drawNum[1]+=(" ** ");
            drawNum[2]+=("* * ");
            drawNum[3]+=("  * ");
            drawNum[4]+=("  * ");
        }
    }

    public void get2(){
        if(maxNum==2){
            drawNum[0]+=("222 ");
            drawNum[1]+=("  2 ");
            drawNum[2]+=("222 ");
            drawNum[3]+=("2   ");
            drawNum[4]+=("222 ");
        }else{
            drawNum[0]+=("*** ");
            drawNum[1]+=("  * ");
            drawNum[2]+=("*** ");
            drawNum[3]+=("*   ");
            drawNum[4]+=("*** ");
        }
    }

    public void get3(){
        if(maxNum==3){
            drawNum[0]+=("333 ");
            drawNum[1]+=("  3 ");
            drawNum[2]+=("333 ");
            drawNum[3]+=("  3 ");
            drawNum[4]+=("333 ");
        }else{
            drawNum[0]+=("*** ");
            drawNum[1]+=("  * ");
            drawNum[2]+=("*** ");
            drawNum[3]+=("  * ");
            drawNum[4]+=("*** ");
        }
    }

    public void get4(){
        if(maxNum==4){
            drawNum[0]+=("4 4 ");
            drawNum[1]+=("4 4 ");
            drawNum[2]+=("444 ");
            drawNum[3]+=("  4 ");
            drawNum[4]+=("  4 ");
        }else{
            drawNum[0]+=("* * ");
            drawNum[1]+=("* * ");
            drawNum[2]+=("*** ");
            drawNum[3]+=("  * ");
            drawNum[4]+=("  * ");
        }
    }

    public void get5(){
        if(maxNum==5){
            drawNum[0]+=("555 ");
            drawNum[1]+=("5   ");
            drawNum[2]+=("555 ");
            drawNum[3]+=("  5 ");
            drawNum[4]+=("555 ");
        }else{
            drawNum[0]+=("*** ");
            drawNum[1]+=("*   ");
            drawNum[2]+=("*** ");
            drawNum[3]+=("  * ");
            drawNum[4]+=("*** ");
        }
    }

    public void get6(){
        if(maxNum==6){
            drawNum[0]+=("666 ");
            drawNum[1]+=("6   ");
            drawNum[2]+=("666 ");
            drawNum[3]+=("6 6 ");
            drawNum[4]+=("666 ");
        }else{
            drawNum[0]+=("*** ");
            drawNum[1]+=("*   ");
            drawNum[2]+=("*** ");
            drawNum[3]+=("* * ");
            drawNum[4]+=("*** ");
        }
    }

    public void get7(){
        if(maxNum==7){
            drawNum[0]+=("777 ");
            drawNum[1]+=("  7 ");
            drawNum[2]+=(" 7  ");
            drawNum[3]+=(" 7  ");
            drawNum[4]+=(" 7  ");
        }else{
            drawNum[0]+=("*** ");
            drawNum[1]+=("  * ");
            drawNum[2]+=(" *  ");
            drawNum[3]+=(" *  ");
            drawNum[4]+=(" *  ");
        }
    }

    public void get8(){
        if(maxNum==8){
            drawNum[0]+=("888 ");
            drawNum[1]+=("8 8 ");
            drawNum[2]+=("888 ");
            drawNum[3]+=("8 8 ");
            drawNum[4]+=("888 ");
        }else{
            drawNum[0]+=("*** ");
            drawNum[1]+=("* * ");
            drawNum[2]+=("*** ");
            drawNum[3]+=("* * ");
            drawNum[4]+=("*** ");
        }
    }

    public void get9(){
        if(maxNum==9){
            drawNum[0]+=("999 ");
            drawNum[1]+=("9 9 ");
            drawNum[2]+=("999 ");
            drawNum[3]+=("  9 ");
            drawNum[4]+=("999 ");
        }
    }

    public void get0(){
        if(maxNum==0){
            drawNum[0]+=("000 ");
            drawNum[1]+=("0 0 ");
            drawNum[2]+=("0 0 ");
            drawNum[3]+=("0 0 ");
            drawNum[4]+=("000 ");
        }else{
            drawNum[0]+=("*** ");
            drawNum[1]+=("* * ");
            drawNum[2]+=("* * ");
            drawNum[3]+=("* * ");
            drawNum[4]+=("*** ");
        }
    }

}
