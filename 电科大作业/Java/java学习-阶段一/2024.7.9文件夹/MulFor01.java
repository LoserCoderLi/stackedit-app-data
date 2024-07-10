import java.util.Scanner;

public class MulFor01{

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		System.out.println("输入金字塔的层数：");
		// 金字塔的层数
		int totalLevel = myScanner.nextInt();

		// 基础版本 totalLevel
		System.out.println("基础版本");

		for(int col = 1;col <= totalLevel;col++){
			for(int rel = 1;rel <= col;rel++){
				System.out.print("*");
			}
			System.out.println("");
		}


		System.out.println("进阶一版本");

		// 进阶一 2 * totalLevel - 1
		for(int col = 1;col <= totalLevel;col++){
			for(int rel = 1;rel <= (totalLevel + col - 1); rel++){
				if(rel <= totalLevel - col){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}


		System.out.println("进阶二版本");

		// 进阶3 
		for(int col = 1;col <= totalLevel;col++){
			for(int rel = 1;rel <= (totalLevel + col - 1); rel++){

				// 判断是不是最后一行
				if(col != totalLevel){

					if(Math.abs(totalLevel - rel) == (col - 1)){
					System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				else{
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}

	}
}