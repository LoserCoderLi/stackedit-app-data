class Test{
	public static void main(String[] args){

		Method myMethod = new Method();
		// System.out.println(myMethod.sum(0.5, 1, 2, 3, 4));
		
		// int a[] = {1, 2, 3, 4};
		// System.out.println(myMethod.sum(0.5, a));

		Person jack = new Person();
		Person mick = new Person();
		Person kelie = new Person();

		jack = myMethod.showScore("jack", 98);
		mick = myMethod.showScore("mick", 99, 100);
		kelie = myMethod.showScore("kelie", 100, 100, 100);

		jack.show();
		mick.show();
		kelie.show();


	}
}

class Person{
	String name;
	int score;

	public void show(){
		System.out.println("姓名：" + this.name + "\t" + "分总数：" + this.score);
	}
}

class Method{
	// 可变参数
	// 使用可变参数时，可以当作**数组操作**
	public double sum(double lv , int... nums){
		System.out.println("输入参数的个数：" + nums.length);

		int sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
		}

		return lv * sum;
	}

	public Person showScore(String name, int... scores){
		
		int sum = 0;
		Person personTemp = new Person();
		for(int i = 0;i<scores.length;i++){
			sum += scores[i];
		}

		personTemp.name = name;
		personTemp.score = sum;

		return personTemp;

	}

}