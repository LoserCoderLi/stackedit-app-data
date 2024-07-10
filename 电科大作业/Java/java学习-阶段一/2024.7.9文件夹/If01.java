import java.util.Scanner;
public class If01{

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("输入你的年龄：");
		int age = myScanner.nextInt();

		if(age > 18){
			System.out.println("你的年龄大于18，应当为你的行为负责");
		}

		System.out.println("判断结束。");
	}
}