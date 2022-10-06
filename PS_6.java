import java.util.Scanner;

public class PS_6 {
    public static void main(String[] args) {

        //QUESTION 1
        float [] array = {12.5f, 10.3f, 11.1f, 09.5f, 5.5f};
        System.out.println(array.length);
        float sum = array [1]+ array [2]+ array [3]+ array [4]+ array [0];
        System.out.println(sum);

        //QUESTION 2

//        Scanner sc = new Scanner(System.in);
//        int [] array = {2,3,5,6,3,7};
//
//        System.out.println("Enter the element to find");
//        int num = sc.nextInt();
//
//        boolean isInArray = false;
//        for (int element:array) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The element is present in the array");
//        }
//        else {
//            System.out.println("The element is not present in the array");
//        }


        //QUESTION 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many inputs needed?");
//        int y = sc.nextInt();
//        System.out.println("Inputs please---- ");
//        int [] array = new int [y];
//        for (int i = 0; i< array.length; i++){
//            array[i] = sc.nextInt();
//        }
//        System.out.println(array.length);
//        float  sum =0;
//        float  avg;
//
//        for ( float element: array ) {
//            sum = sum + element;
//        }
//        System.out.println("Sum of total marks are ");
//        System.out.println(sum);
//        avg = sum / array.length;
//        System.out.println("Avg of total marks are ");
//        System.out.println(avg);


          //QUESTION 4
//        int mat1 [] [] = {{2,3,4},
//                            {5,6,7}};
//        int mat2 [] [] = {{2,3,4},
//                            {5,6,7}};
//        int result [] [] = {{0,0,0}, {0,0,0}};
//
//
//        for (int i= 0;i<mat1.length;i++){
//            for (int j=0; j< mat1[i].length;j++){
//                result [i] [j] = mat1 [i] [j] + mat2 [i] [j];
//                System.out.print(result[i] [j] + " ");
//            }
//            System.out.println(" ");





            //QUESTION 5

//            int array[] = {2,3,5,6,3,7};
//            int l = array.length;
//            int n=  (l/2);
//            System.out.println("The array is: ");
//            for (int element: array) {
//                System.out.print(element+ " ");
//
//            }
//        System.out.println("\n");
//            for (int i =0; i<n;i++){
//                int temp;
//                temp = array[i] ;
//                array [i] = array [l-1-i];
//                array [l-1-i] = temp;
//
//            }
//        System.out.println("The reversed array is: ");
//        for (int element: array) {
//            System.out.print(element+ " ");
//        }




        //QUESTION  *6 & 7*
//        int[] array = {2,3,5,6,9,7};
//        int max = 0;
//        int min = array[0];
//        for(int element: array){
//            if(element>max){
//                max = element;
//            }
//        }
//
//        for (int j : array) {
//            if(j < min)
//                min = j;
//        }System.out.println("MIN IS " + min);
//
//        System.out.println("MAX IS " + max);

        //QUESTION  8
//        int[] array = {2,3,5,6,9,7};
//        boolean IsSorted = true;
//        for (int i=0; i< array.length;i++){
//            if (array[i] > array[i+1]){
//                IsSorted = false;
//                break;
//            }
//        }
//        if (IsSorted){
//            System.out.println("ARRAY IS SORTED");
//        }
//        else {
//            System.out.println("ARRAY IS NOT SORTED");
//        }

    }


}


