import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main (String[] args) {
        int [] arr1={23,45,56,78};
        int [] arr2={23,45,56,78};


            int[] result=new int[arr1.length];
            for(int i=0;i< arr1.length;i++){
                result[i]=arr1[i]+arr2[i];
            }
            System.out.println(Arrays.toString(result));

            int[] maxxxxx={56,78,34,1,78,98,48};
            int largest=maxxxxx[0];
            for (int i=1;i<maxxxxx.length;i++){
                if(maxxxxx[i]>largest){
                    largest=maxxxxx[i];
                }

            }
        System.out.println(largest);

    }
}
