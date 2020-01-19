import java.util.*;
import static java.util.Collections.list;

public class BinarySearch {

    public static void main(String[] args) {
        int CountNum = 1000;//number of integer that is gonna set in array list
        ArrayList<Integer> myArraylist = new ArrayList<>();//creating array list
        for (int i = 0; i <= CountNum; i++) {//to adding CountNum numbers to array list
            myArraylist.add(i);
        }
        //just for array's index
        int myArraySize = myArraylist.size();//to find out last index of array
        int first = 0;
        int last = myArraySize;
        int mid;

        System.out.println("Type the number:");
        Scanner myInput = new Scanner(System.in);//input the value
        int num = myInput.nextInt();
        System.out.println("");
        //int num = 100;//static number

        boolean state = false;
        int i = 0;//indexing
        System.out.println("Array numbers: " + myArraylist);
        System.out.println("Array size : " + last);
        System.out.println("");

        final long startTime = System.nanoTime();//to define start timer
        while (first <= last) {
            mid = (first + last) / 2;
            i++;
            System.out.println("Order number: " + i + ", Order value: " + mid);

            if (myArraylist.get(mid) == num) {
                state = true;
                break;
            }
            if (myArraylist.get(mid) > num) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        if (state == true) {
            System.out.println("");
            System.out.println(num + " is in the list.");
        } else {
            System.out.println(num + " is not in the list.");
        }
        final long endTime = System.nanoTime();//to define stop timer
        System.out.println("");
        System.out.println("Total execution time in nano: " + (endTime - startTime) / 1000);
    }
}
