public class oddnuminarray {
    public static void main(String[] args) {
        int [] arr={2,2,2,5,5,5,6,6,6,2,5,6,7,7,7,7,8,8,8,8,9};
        int w=0;
        for(int i =0;i< arr.length;i++){
          w=w^arr[i];
        }
        System.out.println(w);
    }
}
