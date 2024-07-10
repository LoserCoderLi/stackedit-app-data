import java.util.Scanner;
public class If02{

	pubic static void main(String[] args){
		int moth;
		double price;
		int age;

		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入当前月份：");
		moth = myScanner.nextInt();

		if(4 < moth && moth > 10){
			System.out.println("请输入你的年龄：");
			age = myScanner.nextInt();
			if(60 < age){
				System.out.println("售价：" + 60 / 3)；
			}
			else if (age > 18) {
				System.out.println("售价：" + 60)；
			}
			else{
				System.out.println("售价：" + 30);
			}
		}
		else{
			System.out.println("请输入你的年龄：");
			age = myScanner.nextInt();
			if(age>18 && age<60){
				System.out.println("售价：" + 40)；
			}
			else{
				System.out.println("售价：" + 20)；

			}
		}

	}
}