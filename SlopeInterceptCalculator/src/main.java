import java.util.Scanner;
public class main {
	public static void main(String args[]) {
		Scanner input1 = new Scanner(System.in);
		float xvalue, yvalue, answer, intercept;
		System.out.print("X: ");
		xvalue = input1.nextFloat();
		System.out.print("Y: ");
		yvalue = input1.nextFloat();
		answer = xvalue / yvalue;
		intercept = answer + xvalue;
		System.out.println(xvalue + "=" + answer + "(" + xvalue + ")" + "+" + "-" + intercept); //The negative is a lie
		
	}
}		