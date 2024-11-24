package Classes;

public class Person {

    public String name;
    public int age;
    public String email;
    public static int totalPerson;

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
        updateTotal();
    }
    public Person (){
        this.name = null;
        this.age = 0;
        this.email = null;
        updateTotal();
    }

    public void updateTotal() {
        totalPerson += 1;
    }

    public static void printTotalPerson(){
        System.out.println("Total Person: "+ totalPerson);
    }

    public String getName(){
        return this.name;
    }


    public void setAll(String name, int age){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public void printAll(){
        System.out.println("Name: " +this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Email: "+ this.email);
        System.out.println();
    }




}
