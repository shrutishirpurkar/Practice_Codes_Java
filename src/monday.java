public class monday {
    public static void main(String[] args) {
        System.out.println("************* First problem ****************");
        String name="SHRUTHI";
        System.out.println(name.length());
        System.out.println("************* Second problem ****************");

        for(int i=0;i<name.length()/2;i++){

            System.out.println(name.charAt(i));
        }
        System.out.println("************* Third problem ****************");

        for(int i=name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));
        }
        System.out.println("************* Fourth problem ****************");
        System.out.println("PALLINDROME");
        String pall= "raj";
        int left=0;
        int right=pall.length()-1;
        while(left<right){
            if(pall.charAt(left)==pall.charAt(right)){
                System.out.println("its a pallindrome");
                break;
            }
            else {
                System.out.println("its not pallindrome");
                break;
            }
        }
    }
}
