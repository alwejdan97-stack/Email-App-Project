package EmailApp.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		String currentEmailAddress="wejdan@gmail.com";
		String newEmailAddress="ali@gmail.com";
		boolean status=false;

		System.out.println("The current Email is: "+currentEmailAddress);

		if(!currentEmailAddress.equalsIgnoreCase(newEmailAddress)){
			currentEmailAddress=newEmailAddress;
			status=true;
			System.out.println("Email Address Updated SUCCESSFULLY...");
		}else{
			System.out.println("NEW Email Address Updated SUCCESSFULLY...");
		}
	}

}
