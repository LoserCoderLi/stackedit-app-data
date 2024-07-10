import java.util.Scanner;
class HW01{

	public static void main(String[] args){
		// 初始化
		int[] arr = {10, 12, 45, 90};
		int[] newArr; 

		// 输入元素，判断是否继续的变量初始化
		int elem = 0;
		char isGo;

		Scanner myScanner = new Scanner(System.in);

		whileTop:
		while(true){

			while(true){
				// 提示是否要插入字符
				System.out.println("是否要插入一个数字(y/n)");
				isGo = myScanner.next().charAt(0);

				if(isGo == 'y'){
					break;
				}
				else if (isGo == 'n') {
					break whileTop;
				}
				else{
					System.out.println("输入不符合规范，重新输入");
				}
			}

			System.out.println("请输入一个数字：");
			elem = myScanner.nextInt();
			newArr = new int[arr.length+1];

			// 数组扩增
			for(int i = 0; i<arr.length; i++){
				newArr[i] = arr[i];
			}

			// 加入新数据
			newArr[newArr.length-1] = elem;


			// 冒泡排序
			for(int i = 0;i<newArr.length;i++){
				for(int j = 0;j<newArr.length - i -1;j++){
					if(newArr[j] > newArr[j+1]){
						int temp = newArr[j];
						newArr[j] = newArr[j+1];
						newArr[j+1] = temp;
					}

				}

			}

			// arr指向扩增的数组
			arr = newArr;

			//显示
			System.out.println("添加成功，显示如下：");
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println("");


		}
		

	}
}

class HW02{
	public static void main(String[] args){

		// 初始化
		int arr[] = new int[10];
		// 随机生成数据 (int)(Math.random() * 100 + 1) [1 , 100]
		for(int i = 0;i<arr.length;i++){
			arr[i] = (int)(Math.random() * 100 + 1);
		}

		// 显示
		System.out.println("随机生成的数组成功，显示如下：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");

		// 最大数、最大数指标、平均值、总和初始化
		int max_id = 0;
		int max = 0;
		int are = 0;
		int sum = 0;

		// 找最大的数、下标和求和
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > arr[max_id]){
				max_id = i;
				max = arr[i];
			}

			sum += arr[i];
		}

		// 计算平均值
		are = sum / arr.length;

		// 显示
		System.out.println("最大值：" + max + "对应的下标：" + max_id + "平均值：" + are);
	}
}