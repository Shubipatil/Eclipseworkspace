package regularExpression;
	import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
	public class REGEX {

	public static void main(String[] args) {
	 
		Pattern p=Pattern.compile("[a,A].*");
		Matcher m =p.matcher("a");
		boolean ans=m.matches();
		System.out.println(ans);
		
	}

}
