
 

 

import java.util.Scanner;

import org.json.JSONObject;
 
public class Main
{
    
    public static void main( String[] args ) {
        //JSONObject profile = JSONUtils.getJSONObjectFromFile("/assets/profile.json");
    	JSONObject profile = new JSONObject();
        
      
        
        remove r = new remove();
        add a = new add();
        write w = new write();
        char deleteProfile;
       
       Scanner s = new Scanner(System.in);
       
       //get information 
       System.out.println("Enter your first name: ");
       String firstName = s.next();
       a.addString(profile, "First", firstName);
       System.out.println("Enter your last name: ");
       String lastName = s.next();
       a.addString(profile, "Last", lastName);
       System.out.println("Enter your birthday\n");
       System.out.println("Month: ");
       a.addInt(profile, "Month", s.nextInt());
       System.out.println("Day: ");
       a.addInt(profile, "Day", s.nextInt());
       System.out.println("Year: ");
       a.addInt(profile, "Year", s.nextInt());
       System.out.println("\n\n\n");
       
       
      
       //ask to delete profile 
       System.out.println("Would you like to delete your profile? (y,n): ");
       
        deleteProfile = s.next().charAt(0);
        
        if(deleteProfile == 'y') {
        	r.removeString(profile, "First");
        	r.removeString(profile, "Last");
        	r.removeString(profile, "Birthday");
        	r.removeString(profile, "Month");
        	r.removeString(profile, "Day");
        	r.removeString(profile, "Year");
        }
        
        s.close();
        
        
        //write data to specific file
        String Name = firstName + lastName;
        w.writeToFile(profile, Name);
 
    }
}


