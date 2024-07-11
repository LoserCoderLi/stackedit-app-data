import java.util.Scanner;
public class Recursion{

	public static void main(String[] args){
		// 测试递归
		// Test myTest = new Test01();
		// myTest.testRec(6);

		RecursionExercise myRE = new RecursionExercise();
		Scanner myScanner = new Scanner(System.in);
		
		// System.out.println("测试斐波那契数列函数(testF)，请输入一个正整数：");
		// int n = myScanner.nextInt();
		// int resF = myRE.testF(n);
		// System.out.println("测试斐波那契数列函数(testF)，输入为" + n + "时：得结果" + resF);


		System.out.println("测试半衰期函数(testPich)，请输入当前还剩多少个桃子：");
		int nPich = myScanner.nextInt();
		System.out.println("测试半衰期函数(testPich)，请输入当前还剩" + nPich + "个桃子时的天数：");
		int day = myScanner.nextInt();

		int resP = myRE.testPich(day, nPich);
		System.out.println("测试半衰期函数(testPich)，输入为" + day + "天还剩" + nPich + "个桃子时：原来有" + resP + "个桃子");




	}
}

class Test01{

	public void testRec(int n){

		if(n>2){
			System.out.println("进入递归" + n);
			testRec(n-1);
			System.out.println("退出递归" + n);
		}
		System.out.println("n = " + n);

	}
}

class RecursionExercise{
	public int testF(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		else{
			return testF(n - 1) + testF(n - 2);
			
		}
	}

	public int testPich(int day, int number){

		if(day>1){

			return testPich(day-1, (number+1)*2);
		}
		else{
			return number;
		}

	}
}