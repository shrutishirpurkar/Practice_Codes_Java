public class patanhi {
    public static void main(String[] args) {
        System.out.println("REMEMBER LIFE IS A JOURNEY AND WE ALL ARE PASSENGERS  \uD83C\uDFA1 \n SO TIGHTEN YOUR SEAT BELT AND ENJOY...............");
        System.out.println("LET THE JOURNEY BEGIN \uD83D\uDE97");
        int [] petrolbunkers={1,3,4,5,2,6,0,0,3,2};
        int position =0;
        int currentfuel=0;
        int totalTravelDistance= petrolbunkers.length;
        while(position<totalTravelDistance-1){
            currentfuel=currentfuel+petrolbunkers[position];//0+1=1
            System.out.println("current fuel is " +currentfuel);
            int maxreach=position+currentfuel;
            System.out.println("max reach is "+maxreach);
            if (maxreach>=totalTravelDistance-1){
                System.out.println("reached.........");

            }
            int nextstation=0;
            int maxfuelatnextstaation=0;
            for(int i=position+1;i<=maxreach && i<totalTravelDistance;i++){
                if (petrolbunkers[i]>maxfuelatnextstaation){
                    nextstation=i;
                    System.out.println( "next station is "+nextstation);
                    maxfuelatnextstaation=petrolbunkers[i];
                }
                if(nextstation==-1){
                    System.out.println("cant reach");
                }


            }
            currentfuel-=(nextstation-position);
            position=nextstation;


        }
        System.out.println("successfully reached destination");
    }
}
