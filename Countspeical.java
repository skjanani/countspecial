package janani;

public class Countspeical {
	public static void mail(String[] args){
		String s="hello/.she is @good! girl,";
		System.out.println("enter the string");
		s=s.replaceAll("[^,!@#$%^&*()./]","");
		int l=s.length();
		System.out.print(l);
	}

}
