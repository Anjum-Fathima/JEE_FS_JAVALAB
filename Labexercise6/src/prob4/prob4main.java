package prob4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class prob4main {

	public static void main(String[] args) {
		prob4serimpl p=new prob4serimpl();
		HashMap<Integer,Integer> student=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five student registration numbers and their marks");
        for(int i=0;i<5;i++)
        {
        	int regno=sc.nextInt();
        	int marks=sc.nextInt();
        	student.put(regno, marks);
        }
        HashMap returns=p.getStudent(student);
        System.out.println(returns);
	}
   
}
