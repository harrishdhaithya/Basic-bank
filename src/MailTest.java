import controller.Otp;

public class MailTest {
    public static void main(String[] args) {
    	boolean val = Otp.evalOtp("harrishdhaithya@gmail.com");
    	System.out.println(val);
    }
}
