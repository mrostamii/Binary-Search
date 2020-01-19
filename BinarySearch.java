
import java.util.*;
import static java.util.Collections.list;

public class BinarySearch {

    public static void main(String[] args) {
        //static {
        /*------ Method 01 - Failed ------ */
//        int CountNum = 100;//number of integer that is gonna set in array list
//        ArrayList<Integer> myArraylist = new ArrayList<>();//creating array list
//        for (int i = 0; i <= CountNum; i++) {//to adding CountNum numbers to array list
//            myArraylist.add(i);
//        }
//        int myArraySize = myArraylist.size();//to define end state for the for
//        //Scanner myInput = new Scanner(System.in);//input the value
//        //int Value = myInput.nextInt();
//        int Value = 25;//the number for search
//        
//        final long startTime = System.nanoTime();//to define start timer
//        //boolean theNumberIsHere = false;
//        int mySearchFirstSize = myArraylist.size() / 2;
//        System.out.println("1="+myArraylist.get(mySearchFirstSize));
//        //for (int i = 0; i < mySearchFirstSize; i++) {//start searching
//            if (myArraylist.get(mySearchFirstSize) > Value) {
//                System.out.println("The number is here.");
//                //theNumberIsHere = true;
//            } 
////            if (myArraylist.get(mySearchFirstSize) > Value) {
////                System.out.println("The number is here.");
////                mySearchFirstSize = mySearchFirstSize / 2;
////                System.out.println("2="+myArraylist.get(mySearchFirstSize));
////                //theNumberIsHere = true;
////            
////            if (myArraylist.get(mySearchFirstSize) < Value) {
////                mySearchFirstSize = mySearchFirstSize / 2;
////                System.out.println("3="+myArraylist.get(mySearchFirstSize));
////                //theNumberIsHere = true;
////            }
//
//        //}
//        /*if (theNumberIsHere == true) {
//            System.out.println("The number is here.");
//        }*/
//        final long endTime = System.nanoTime();//to define stop timer
//        System.out.println("Total execution time: " + (endTime - startTime));

        /*------ Method 02 - Failed ------ */
//        int[] list = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int number = 10;
//        Arrays.sort(list);
////        System.out.println(Arrays.toString(list));
//
//        int begin = 0;
//        int last = list.length - 1;
//        int middle = (begin + last) / 2;
//        boolean status = false;
//
//        while (begin <= last) {
////            middle = (begin + last) / 2;
////            status = true;
//            if (list[middle] < number) {
//                begin = middle + 1;
//                status = true;
//            } else if (list[middle] == number) {
//                status = true;
//                break;
//            } else {
//                last = middle - 1;
//                status = false;
//            }
//        }
//        if (status = true){
//        System.out.println("The number is here.");}
//}

        /*------ Method 03 - Failed ------ */
//                int[] array = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int start = 0;
//        int end = array.length - 1;
//        boolean status = false;
//        int search = 40;
//
//        while (start <= end) {
//
//            int middle = (start + end) / 2;
//
//            if (search < array[middle]) {
//                end = middle - 1;
//            }
//
//            if (search > array[middle]) {
//                start = middle + 1;
//            }
//
//            if (search == array[middle]) {
//                status = true;
//                //break;
//            }
//        }
//        if (status = true) {
//            System.out.println("The number is here.");
//        } else {System.out.println("The number is NOThere.");}

        /*------ Method 04 - Success ------ */
        int CountNum = 1000;//number of integer that is gonna set in array list
        ArrayList<Integer> myArraylist = new ArrayList<>();//creating array list
        for (int i = 0; i <= CountNum; i++) {//to adding CountNum numbers to array list
            myArraylist.add(i);
        }

//            myArraylist.add(1);
//            myArraylist.add(80);
//            myArraylist.add(90);
//            myArraylist.add(101);
//            myArraylist.add(145);
//            myArraylist.add(189);
//            myArraylist.add(190);
//            myArraylist.add(199);
//            myArraylist.add(221);
//            myArraylist.add(251);
//            myArraylist.add(522);
//            myArraylist.add(1013);
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
