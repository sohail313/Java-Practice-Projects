import Measurements.Time;

//package Measurements;
// import Measurements.Time;

public class Measure {
    public static void main(String[] args) {
        System.out.println("Measurements ::");

        /*
         * weight -> take all the possible weighing units and ask user to convert
         * length -> km/miles/m/cm/mm/
         * temp -> K,C
         * volumes -> L/ml
         * Time ->
        */
        Time t =  new Time();

        // Weight w;
        // Length l;
        // Volume v;
        // Temperature temp;

//         t.minuteToHour(30);
        t.secondsTominutes(120);
    }
}
