package EmailApp.Demo;

public class UserProfileController {
    public static void main(String[] args){
        UserProfile userProfile=new UserProfile("U1-01","98765432","Oman");

        System.out.println("*** Current Information ***");
        System.out.println("User ID: "+userProfile.getUserId());
        System.out.println("User Phone Number: "+userProfile.getPhoneNumber());
        System.out.println("User Address: "+userProfile.getAddress());

        System.out.println("*** Updating Phone Number AND Address ***");

    }
}
