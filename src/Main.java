import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer>oddNumber=new ArrayList<Integer>();
        ArrayList<Integer>evenNumber=new ArrayList<Integer>();
        for (int i = 0; i <50 ; i++) {
            int array= random.nextInt(100);
            number.add(array);
                if(array%2==0){
                oddNumber.add(array);
            }else{
                evenNumber.add(array);
            }
        }
            System.out.println("There are all number: "+number);
            System.out.println("There are odd number: "+oddNumber);
            System.out.println("There are even number: "+evenNumber);


        }
    }

