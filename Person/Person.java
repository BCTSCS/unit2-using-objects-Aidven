import greenfoot.*;

public class Person{
    private int x;
    private int y;
    private int speed;
    private String name;
    private boolean canTalk;
    
    public Person(){
        x = 450;
        y = 500;
        speed = 5;
        name = "Evan";
        canTalk = false;
    }
    
    public Person(String namePerson){
        x = 450;
        y = 500;
        speed = 5;
        name = namePerson;
        canTalk = false;
    }
    
    public Person(String namePerson, int speedPerson){
        x = 450;
        y = 500;
        speed = speedPerson;
        name = namePerson;
        canTalk = false;
    }
    
    public void walk(){
        x += speed;
        y += speed;
    }
    
    public String toString(){
        return "Person's name is " + name + " X: " + x + " Y: " + y + " Speed: " + speed + " canTalk: " + canTalk;
    }

    public static void main(String args[]){
        Person person1 = new Person();
        Person person2 = new Person("Rob");
        Person person3 = new Person("Jake", 10);
        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        
        person1.walk();
        person2.walk();
        person3.walk();
        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}