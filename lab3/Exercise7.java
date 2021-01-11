
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 * Create a method to accept date and print the duration in days,
 * months and years with regards to current system date.
 * @author ANJUM
 *
 */
public class Exercise7 
{

	public static void main(String[] args) 
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
	    Date dateobj = new Date();
	    String ch=df.format(dateobj);
	    System.out.println(ch);
	    currGivenDateDiff(ch);

	}

	private static void currGivenDateDiff(String ch) 
	{
		
		
	}
 
}
