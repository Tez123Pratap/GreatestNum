import java.util.Scanner;
public class GreatestNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FirstNum=0, SecondNum=0,ThirdNum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter The First Number:");
		FirstNum=sc.nextInt();
		System.out.print("Please enter The Second Number:");
		SecondNum=sc.nextInt();
		System.out.print("Please enter The Third Number:");
		ThirdNum=sc.nextInt();
		if(FirstNum>=SecondNum && FirstNum>=ThirdNum) {
			System.out.println("The Greatest Number is:"+FirstNum);
		}
		else {
			if(SecondNum>=FirstNum && SecondNum>=ThirdNum) {
				System.out.println("The Greatest Number is:"+SecondNum);
			}else {
				System.out.println("The Greatest Number is:"+ThirdNum);
			}
		}

	}

}
