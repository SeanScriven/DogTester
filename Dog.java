public class Dog {

	String name;
	String breed;
	int age;
	public void bark(){
		System.out.println("bark");
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setBreed(String b){
		breed = b;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public String toString(){
		return name;
	}
}
