public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(minutes + " min = " + minutes/525600 + " y and " + ((minutes%525600) / 1440)  + " d");
        }
    }
}
