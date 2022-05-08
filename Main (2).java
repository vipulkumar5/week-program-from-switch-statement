
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int day= sc.nextInt();
		switch(day){
		    case 1:
		        System.out.println("Monday");
		       break;
		      case 2:
		          System.out.println("tuesday");
		          break;
		          case 3:
		          System.out.println("wednesday");
		          break;
		          case 4:
		          System.out.println("thuersday");
		          break;
		          case 5:
		          System.out.println("FRIDAY");
		          break;
		          case 6:
		          System.out.println("saturday");
		          default:
		          System.out.println("sunday");
		          break;
		}
	}
}
