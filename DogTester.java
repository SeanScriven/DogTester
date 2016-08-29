public class DogTester {
	public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        
        d1.bark();
        d2.bark();
        
        d1.setName("Charles");
        d2.setName("Colin");
        
        d1.setAge(2);
        d2.setAge(7);
        
        d1.setBreed("Charlywawa");
        d2.setBreed("Colombian Drug Lord");
        
        //Dog d1 = new Dog("Charles", 2, "Charlywawa");
        
        int age_of_d1 = d1.getAge();
        System.out.println(age_of_d1);
        
        System.out.println(d1.getAge());
        
        System.out.println(d2.getName() + " is a " + d2.getAge() + " year old " + d2.getBreed());
        
        System.out.println(d1.toString());
        
        System.out.println(d1);
    }		

}
