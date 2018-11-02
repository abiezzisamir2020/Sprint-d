public class Main {

    public static double Effort, Work, Capacity;

    public static void main(String[] args) {

        Effort = 100+50+20+360+80+160+500+240+40+40;

        Capacity(8,3,40);
        Capacity(9,3,40);
        Capacity(10,3,40);
        Capacity(11,3,40);
        Capacity(8,4,40);
        Capacity(8,5,40);
        Capacity(8,6,40);

        Capacity(8,3,35);
        Capacity(9,3,35);
       Capacity(10,3,35);
       Capacity(11,3,35);
        Capacity(8,4,35);
        Capacity(8,5,35);
       Capacity(8,6,35);

        Capacity(8,3,30);
       Capacity(9,3,30);
        Capacity(10,3,30);
        Capacity(11,3,30);
        Capacity(8,4,30);
        Capacity(8,5,30);
        Capacity(8,6,30);
    }


    public static void Capacity(int power, int numweek, int hours) {
        double capacity = Effort / (power * numweek * hours);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %d%% of capacity.\n",power,numweek,hours,(int)(capacity*100));
    }
}