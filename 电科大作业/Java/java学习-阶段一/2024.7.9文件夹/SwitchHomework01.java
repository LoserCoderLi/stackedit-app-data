import java.util.Scanner;
public class Homework01{

	public static void main(String[] args){

		int moth;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入当前月份：");

		moth = myScanner.nextInt();

		switch(moth){
			case 3: case 4: case 5:
				System.out.println("春");
				break;
			case 6: case 7: case 8:
				System.out.println("夏");
				break;
			case 9: case 10: case 11:
				System.out.println("秋");
				break;
			case 12: case 1: case 2:
				System.out.println("冬");
				break;
			default:
				System.out.println("输入不符合规定");
		}
	}
}