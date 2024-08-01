package Function;

import java.util.function.Function;

public class Function7 {
	public static void main(String[] args) {

		Function<String, String> disply = email -> email.substring(email.indexOf('@') + 1);
		String email = "DilshadSiddiqui389@gmail.com";
		System.out.println("This is your Email: " + email + " is " + disply.apply(email));

		System.out.println("----------------------------------------------");

		Function<String, String> extractDomain = email1 -> email1.substring(email1.indexOf('@') + 1);
		String email1 = "dilshadtech999@gamil.com";
		System.out.println("Domain of the email " + email1 + " is: " + extractDomain.apply(email1));
        
	}
}
