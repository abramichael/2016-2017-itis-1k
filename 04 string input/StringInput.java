import java.util.Scanner;
public class StringInput {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		// #1
		/*
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(str + " % " + str2);
		*/
		
		// #2
		/*
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(str + " # " + str2);
		*/
		
		// #3
		String s = args[0].toLowerCase();
		System.out.println(s);
		System.out.println(s.charAt(i)); //s[i]
		
	}

}