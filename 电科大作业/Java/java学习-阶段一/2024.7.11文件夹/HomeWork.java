class A01{
	public double max(double[] arr){
		double maxCount = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(maxCount < arr[i]){
				maxCount = arr[i];
			}

		}

		return maxCount;
	}
}


class A02{
	public int find(String[] arr, String string){
		int id = -1;
		for(int i = 0;i<arr.length;i++){
			if(string.equals(arr[i])){
				id = i;
				break;
			}

		}

		return id;

	}
}


class Book{
	double price;

	void updatePrice(Book book){

		if(book.price > 150){
			book.price = 150;
		}
		else if (book.price > 100) {
			book.price = 100;
		}
		else{
			// 不变
		}

	}
}


class A03{
	public String[] copyArr(String[] string){
		String[] arr = new String[string.length];
		for(int i = 0;i<string.length;i++){
			arr[i] = string[i];
		}

		return arr;
	}

	public int[] copyArr(int[] string){
		int[] arr = new int[string.length];
		for(int i = 0;i<string.length;i++){
			arr[i] = string[i];
		}

		return arr;
	}

	public char[] copyArr(char[] string){
		char[] arr = new char[string.length];
		for(int i = 0;i<string.length;i++){
			arr[i] = string[i];
		}

		return arr;
	}
}


class Circle{
	double r;
	double pi = 3.1415926;

	public void showS(){
		System.out.println("该圆的周长是：" + 2 * pi * r);
	}

	public void showC(){
		System.out.println("该圆的面积是：" + pi * r * r);
	}

}


class Cale{
	double op1;
	double op2;

	public Cale(op1, op2){
		this.op1 = op1;
		this.op2 = op2;
	}

	public double sun(){
		return this.op1 + this.op2;
	}

	public double sub(){
		return this.op1 - this.op2;
	}

	public double div(){
		if (op2 == 0) {
			System.out.println("除数为0，请重新赋值");
		}
		else{
			return op1 / op2;
		}
	}

}


class Dog{
	String name;
	String color;
	int age;

	public Dog(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(){
		System.out.println("该狗的名字：" + name + "颜色：" + color + "年龄：" + age); 
	}

}


class Music{
	String name;
	double times;

	public void play(){
		System.out.println("音乐开始播放");
	}

	public void getInfo(){
		System.out.println("该音乐名称为：" + this.name + "播放时长为：" + this.times);
	}

}


class Test{
	public double method(double num1, double num2){

	}

}


class Emploee{
	String name;
	String gender;
	int age;
	String job;
	double sal;

	public Emploee(String name, String gender, int age, String job, double sal){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.job = job;
		this.sal = sal;
	}

	public Emploee(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Emploee(String job, double sal){
		this.job = job;
		this.sal = sal;
	}

}