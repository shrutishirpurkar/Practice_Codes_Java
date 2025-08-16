public class SnapCracle {
    public static void main(String[] args) {
//
        for (int i=1; i<=50; i++) {
            boolean ismultipleOf7 = (i % 7 == 0);
            boolean iscontain7 = Integer.toString(i).contains("7");
            if (ismultipleOf7 && iscontain7) {
                System.out.println("SnapCracle");
            } else if (iscontain7) {
                System.out.println("Cracle");
            } else if (ismultipleOf7) {
                System.out.println("Snap");

            }
            else {
                System.out.println(i);
            }
        }
    }
}
