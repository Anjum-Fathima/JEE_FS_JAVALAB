/**
 *  Create a class containing a method to create the mirror image of a String.
 *  The method should return the two Strings separated with a pipe(|) symbol .
 * @author ANJUM
 *
 */
import java.util.*;
public class Exercise2 {
        public static void main(String[] args) 
        {
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		StringBuilder result=getImage(string);
		System.out.println(string+"||"+result);

	    }
        public static StringBuilder getImage(String str)
        {
        	StringBuilder sb=new StringBuilder(str);
        	sb.reverse();
        	return sb;
        }

}
