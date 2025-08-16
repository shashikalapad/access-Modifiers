//public class Main{
//     public static void main(String[] args) {
//         System.out.println("Hello world");

//     }

// }
// public class Main{
//     private String fname ="John";
//     private String lname="Doe...";
//     private String email ="john@doe.com";
// private int age=24;
// public static void main (String[] args){
//     Main myobj = new Main();
//     System.out.println("Name: " +myobj.fname +" "+myobj.lname);
//     System.out.println("Email: " +myobj.email);
//     System.out.println("Age: " +myobj.age);
// }
// } 
//  public class Main{
//     protected String fname ="John";
//     protected String lname="Doe...";
//     protected String email ="john@doe.com";
//     protected int age=24;
//  }
// //}
// class Student extends Main {
//   private int graduationYear = 2018;

// public static void main (String[] args){
//     Student myobj = new Student();
//     System.out.println("Name: " +myobj.fname +" "+myobj.lname);
//     System.out.println("Email: " +myobj.email);
//     System.out.println("Age: " +myobj.age);
//     System.out.println("Graduation Year: " +myobj.graduationYear);
// }
// } 
 class Animal { //super class
    public void AnimalSound(){
        System.out.println("Animal makes sound");
    }
 }
 class Pig extends Animal {
    public void PigSound(){
        System.out.println("Pig makes sound wee wee");
    }
 }
 class Dog extends Animal {
    public void DogSound(){
        System.out.println("Dog makes sound bow bow");
    }
 }

class Main {
    public static void main(String[] args){
        Animal myAnimal = new  Animal();
        Animal myPig = new Pig();
         Animal myDog = new Dog();
        myAnimal.AnimalSound();
        myPig.AnimalSound();
        myDog.AnimalSound();
    } 
}
