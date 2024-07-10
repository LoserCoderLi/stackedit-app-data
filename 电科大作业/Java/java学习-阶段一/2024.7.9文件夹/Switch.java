import java.util.Scanner;
public class Switch{

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a~c）：");

		String aStr = myScanner.next();
		char aChar = aStr.charAt(0);

		switch(aChar){
			case 'a':
				System.out.println("今天星期1");
				break;
			case 'b':
				System.out.println("今天星期2");
				break;
			case 'c':
				System.out.println("今天星期3");
				break;

			default:
				System.out.println("你输入的不符合规定");

		}
		

	}
}