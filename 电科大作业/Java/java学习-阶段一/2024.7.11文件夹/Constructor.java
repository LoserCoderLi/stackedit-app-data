class Test{
	public static void main(String[] args){

		Person person01 = new Person(20, "jack");
		System.out.println("person01.age = " + person01.age + "\t" + "person01.name = " + person01.name);
		Person person02 = new Person(19, "mack");
		System.out.println("person02.age = " + person02.age + "\t" + "person02.name = " + person02.name);


		person01.compareTo(person02);
	}
}

class Person{
	int age;
	String name;

	public Person(){
		age = 18;
	}

	public Person(int age, String name){
		this.age = age;
		this.name = name;
		System.out.println("构造器成功发挥效果");
	}

	public void compareTo(Person person){
		if(this.age == person.age && this.name == person.name){
			System.out.println(this.name + "与" + person.name + "是相等的");
		}
		else{
			System.out.println(this.name + "与" + person.name + "是不相等的");

		}
	}
}