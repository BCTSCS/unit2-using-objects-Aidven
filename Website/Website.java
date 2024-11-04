
import java.io.*;
import java.net.*;

public class Website {


 // Put your code here
    private String domain;
    private String topLevelDomain;
    private long numUsers;
    private GeoLocation geoLocation;

//Default constructor
public Website(){
    domain = "google";
    topLevelDomain = "com";
    numUsers = 4300000000L;
    geoLocation = new GeoLocation(41.2219,95.8608);
    }

// Specify website URL
// Register a new website
public Website(String domainName, String topDomain){
    domain = domainName;
    topLevelDomain = topDomain;
    numUsers = 0;
    geoLocation = new GeoLocation(40.935,-74.1176);
}

// Specify website URL
// Register an old website
public Website(String domainName, String topDomain, long numPeople, GeoLocation g){
    domain = domainName;
    topLevelDomain = topDomain;
    numUsers = numPeople;
    geoLocation = g;
    }

public GeoLocation getLocation(){
    return geoLocation;
}
    // Method to fetch data 
    public void fetchData(String api)
 {
        String urlString=toString()+ "/"+api;

        try {
            // Create the URL from the provided string
         
            URL url = new URL(urlString);
            
            // Open a connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response and print each line
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            System.out.println("Response from the API:");

            // Print each line of the response directly
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   // String representation for printing
    // Do not modify this method
    public String toString()
    {
        
        String res =  "http://" + domain + "." + topLevelDomain;
       // res += " has " + numUsers + " users";
        
        return res;
    }

    // Main method to test the API call
    public static void main(String[] args) {

        //NEVER USE ACCESS MODIFIER INSIDE METHODS
        //HERE EVERY VARIABLE IS LOCAL
        //LOCAL VARIABLE USE TYPE ONLY 
        //REFERENCE VARIABLES CLASS TYPE
        Website website1 = new Website("ip-api", "com"); // Create an instance of Website
        website1.fetchData("json"); // Call the instance method
        
        Website google = new Website();
        System.out.println("My location to Google: " + google.getLocation().distanceFrom(website1.getLocation()) + " miles");
      
        Website aws = new Website("aws", "com", 1000000, new GeoLocation(38.9339,77.1773));

        Website microsoft = new Website("Microsoft Azure", "com", 100000000, new GeoLocation(36.6646, 78.3897));

        Website meta = new Website("Meta", "com", 320000000, new GeoLocation(44.2995, 120.8346));
        
        System.out.println("Google to aws: " + google.getLocation().distanceFrom(aws.getLocation()) + " miles");
        System.out.println("Google to Meta: " + google.getLocation().distanceFrom(meta.getLocation()) + " miles");
        System.out.println("Google to Microsoft: " + google.getLocation().distanceFrom(microsoft.getLocation()) + " miles");

        System.out.println("Meta to Microsoft Azure: " + meta.getLocation().distanceFrom(microsoft.getLocation()) + " miles");
        System.out.println("Meta to AWS: " + meta.getLocation().distanceFrom(aws.getLocation()) + " miles");

    }
}





