package String;

public class Stringcomparingequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Welcome";
		System.out.println(s.contentEquals("Welcome"));
		System.out.println(s.contentEquals("Wel come"));
		System.out.println(s.contentEquals("We lco me"));

		System.out.println(s.equalsIgnoreCase("Welcome"));

	}

}
