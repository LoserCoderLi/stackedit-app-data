public class For{

	public static void main(String[] args){
		// 最大值
		int max = 100;
		// 保存和
		int sum = 0;
		// 个数
		int count = 0;
		// 除数
		int elem = 9;

		// 循环开始
		for(int i = 1;i<=max;i++){

			// 判断需求：9的倍数
			if(i % elem == 0){
				System.out.println(i + "是9的倍数");
				count += 1;
				sum += i;
			}

		}
		System.out.println("总和：" + sum + "个数：" + count);
	}
}