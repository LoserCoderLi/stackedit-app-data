class AA{

	int b;

	public void printS(int col, int rel){
		for(int i = 0;i<col;i++){
			for(int j = 0;j<rel;j++){
				System.out.print("#");
			}
			System.out.println("");
		}

	}
	public void changeA(int a){
		a *= 3; 

	}
}

class BB{
	int a;

	public void changeB(AA myA){
		myA.b *= 2; 
		System.out.println("在方法中改变后b的值：" + myA.b);
	}
}

public class Method{

	public static void main(String[] args){
		AA myAA = new AA();
		myAA.b = 4;
		myAA.printS(4,5);

		BB myBB = new BB();
		myBB.a = 6;

		myBB.changeB(myAA);
		System.out.println("改变后b的值：" + myAA.b);
	}
}

class Person{
	int age;
	String name;

	public void copyPerson(Person personCopy){
		this.age = personCopy.age;
		this.name = personCopy.name;

	}
}

class Method01{

	public static void main(String[] args){
		Person myPersonNew = new Person();
		Person myPersonCopy = new Person();

		myPersonCopy.age = 20;
		myPersonCopy.name = "xiaoli";

		myPersonNew.copyPerson(myPersonCopy);

		System.out.println("复制完成，展示如下：");
		System.out.println("myPersonNew.age = " + myPersonNew.age + "\t" + "myPersonNew.name" + myPersonNew.name);

	}
}

