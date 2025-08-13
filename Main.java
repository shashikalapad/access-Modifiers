// public class Main{
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
 class Person{
    protected String fname ="John";
   protected String lname="Doe...";
   protected String email ="john@doe.com";
   protected int age=24;
 }
   class Student extends Person {
 int graduationYear = 2016;

public static void main (String[] args){
    Student myobj = new Student();
    System.out.println("Name: " +myobj.fname +" "+myobj.lname);
    System.out.println("Email: " +myobj.email);
    System.out.println("Age: " +myobj.age);
    System.out.println("Graduation Year: " +myobj.graduationYear);
}
} 
 
