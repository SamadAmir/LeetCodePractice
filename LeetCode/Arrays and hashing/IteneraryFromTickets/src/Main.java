import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = null;

        //Check the values which is only present in key pair not value pair
        for (String key : tickets.keySet()) {
            if (!tickets.containsValue(key)) {
                start = key;
                break;
            }
        }


        if (start != null) {
            System.out.println("Starting point: " + start);
            System.out.println("Connected cities from " + start + ":");
            String currentCity = start;

            while (currentCity != null && tickets.containsKey(currentCity)) {
                System.out.print(currentCity + "->");// current city at 1st iteration will be mumbai
                currentCity = tickets.get(currentCity); // we will find its value(Delhi) then make it key and so on

            }
        } else {
            System.out.println("No starting point found.");
        }
    }
}
