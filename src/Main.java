import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(100) + 1;
            arrayList.add(number);
           // System.out.print(" "+number);
        }
        List <Integer>oddNums=new ArrayList<>();
        List <Integer>evNums=new ArrayList<>();
        for (int num:arrayList) {
            if(num%2==0){
                evNums.add(num);
                System.out.println("Четное число: "+num);
            }
            else{
                oddNums.add(num);
                System.out.println("Нечетное число: "+num);
            }
        }
        

    }
}