public class TernaryOperatorExercise{

	public static void main(String agrs[]){

		int i = 55;
		int j = 66;
		int k = 99;

		int max1;

		int max2 = ((max1 = (i > j)? i : j )> k)? max1 : k;

		System.out.println("三个数中最大的是:" + max2);
	}
}