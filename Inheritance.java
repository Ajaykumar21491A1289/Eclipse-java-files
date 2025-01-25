package StudyHour;
import java.util.*;
class Animal{
	String name;
Animal(String name){
	this.name=name;
}
public void display(){
	System.out.println("Then Animal Name is : "+name);
}
}
class Dog extends Animal{
	
	Dog(String name){
	   super(name);
	   super.display();
	}
	
}
class Cat extends Animal{
	Cat(String name){
		super(name);
		super.display();
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c =new Cat("Meow");
Dog d = new Dog("Oxy");
	}

}
