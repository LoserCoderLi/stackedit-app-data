// import java.util.Scanner;
// public class Input{

// 	public static void main(String agrs[]){
// 		//演示接受用户的输入
// 		//步骤
// 		//Scanner类 表示 简单文本扫描 在java.util 包里
// 		//1.导入Scanner类所在包
// 		//2.创建 Scanner 对象，new 创建一个对象

// 		Scanner myScanner = new Scanner(System.in);
// 		//3.接受用户输入
// 		System.out.println("请输入名字：");
// 		String name = myScanner.next();
// 		System.out.println("请输入年龄：");
// 		int age = myScanner.nextInt();
// 		System.out.println("请输入薪水");
// 		double sal = myScanner.nextDouble();
// 		System.out.println("用户信息如下：");
// 		System.out.println("名字" + name);
// 		System.out.println("年龄" + age);
// 		System.out.println("薪水" + sal);



// 	}
// }

import java.util.Scanner;

public class Input{

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);

		System.out.print("name:");
		String name = myScanner.next();
		System.out.print("age:");
		int age = myScanner.nextInt();
		System.out.print("sal:");
		double sal = myScanner.nextDouble();
		System.out.println("个人信息：");
		System.out.println("name:" + name +"\t" + "age:" + age + "\t" + "sal:" + sal);
	}
}