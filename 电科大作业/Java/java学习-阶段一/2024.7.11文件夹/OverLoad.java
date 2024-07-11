class Test{

	public static void main(String[] args){
		MyCalculator mc = new MyCalculator();

		System.out.println(mc.calculator(1, 2));
		System.out.println(mc.calculator(1.1, 2));
		System.out.println(mc.calculator(1, 2.1));
		System.out.println(mc.calculator(1.1, 2.1));

		Methods method = new Methods();
		System.out.println(method.max(1.2, 2.1, 1.0));

	}
}


//计算重载
class MyCalculator{
	public int calculator(int n1, int n2){
		return n1 + n2;
	}
	public double calculator(int n1, double n2){
		return n1 + n2;
	}
	public double calculator(double n1, int n2){
		return n1 + n2;
	}
	public double calculator(double n1, double n2){
		return n1 + n2;
	}
}


//
class Methods{
	// m 重载
	public int m(int num){
		System.out.println("public int m(int num)结果：" + num*num);

		return num * num;
	}
	public int m(int num1, int num2){
		System.out.println("public int m(int num1, int num2)结果：" + num1 * num2);

		return num1 * num2;
		
	}
	public void m(String string){
		System.out.println("public void m(String string)结果：" + string);
		
	}

	// max重载
	public int max(int num1, int num2){

		return num1>num2? num1 : num2;

	}
	public double max(double num1, double num2){
		return num1>num2? num1 : num2;
		
	}
	public double max(double num1, double num2, double num3){
		double max = num1>num2? num1 : num2;

		return max > num3? max : num3;
	}
}