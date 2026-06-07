public class UpdateEmailDemo {
    public static void main(String[] args){
        String currentEmailAddress="wejdan@gmail.com";
        String newEmailAddress="wejdan@gmail.com";
        boolean status=false;

        System.out.println("The current Email is: "+currentEmailAddress);

        if(!currentEmailAddress.equalsIgnoreCase(newEmailAddress)){
            currentEmailAddress=newEmailAddress;
            status=true;
            System.out.println("Email Address Updated SUCCESSFULLY...");
            System.out.println("Updated Email Address Is: "+currentEmailAddress);
            System.out.println("Updated Status "+status);
        }else{
            status=false;
            System.out.println("NO Update Required, NEW Email Address Matched Old Email...");
            System.out.println("Updated Email Address Is: "+currentEmailAddress);
            System.out.println("Updated Status "+status);
        }
    }
}
