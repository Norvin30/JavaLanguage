public class array_2 {
    public static void main(String[] args){

        // Additional way for assigning elements to an array.

        String[] cars= new String[5];
        cars[0]="corvette";
        cars[1]="lambo";
        cars[2]="buggati";
        cars[3]="rolls-royce";
        cars[4]="swift";

        for (int i=0; i< cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
