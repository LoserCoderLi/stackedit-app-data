public class MulFor{

	public static void main(String[] args){
		int col = 9;
		int rel = 9;

		for(int i = 1;i <= col;i++){
			for(int j = 1;j <= i;j++){
				int k = i * j;
				System.out.print(j + "*" + i + "=" + k + "\t");
			}
			System.out.println("");
		}
	}
}