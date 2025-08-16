import java.util.Arrays;

public class wordsorting {
    public static void main(String[] args) {
        String name="shruti";
        char [] arr1=name.toCharArray();
        Arrays.sort(arr1);
        String alphaname=new String(arr1);
        System.out.println("sorted name is "+alphaname);
    }
}
