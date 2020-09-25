package lab_4;

import java.util.ArrayList;

public class dog {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void Setname(String name){
        this.name = name;
    }
    String GetName(){
        return name;
    }
    int ageHuman(){
        return age * 7;
    }
    public String toString(){
        return "Name= " + name + ", age =" + age;
    }
}

class Dog_Kennel{
    static ArrayList<dog> dogs = new ArrayList<>();
    public static void main(String[] args) {
        dogs.add(new dog("Jack", 5));
        dogs.add(new dog ("Kek", 8));
        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));

    }
}
