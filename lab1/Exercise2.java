/**
 *Write a java program that simulates a traffic light. 
 *The program lets the user select one of three lights: red, yellow, or green
 *with radio buttons. On entering the choice, an appropriate message with “stop” or 
 *“ready” or “go” should appear in the console .Initially there is no message shown.
 * @author ANJUM
 *
 */
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String color=sc.nextLine();
	if(color.equals("red"))
	{
		System.out.println("stop");
	}
	if(color.equals("green"))
	{
		System.out.println("go");
	}
	if(color.equals("yellow"))
	{
		System.out.println("ready");
	}

	}

}
