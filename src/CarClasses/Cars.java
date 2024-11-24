package CarClasses;

public class Cars {
    public String name;
    public int mileage;
    public int cost;

    public Cars(String name, int mileage, int cost) {
        this.name = name;
        this.mileage = mileage;
        this.cost = cost;


    }
    public void getName() {
        System.out.println(name);
    }
    public void getMileage(){
        System.out.println(mileage);
    }
    public void getCost(){
        System.out.println(cost);
    }

    public void setAll(String name, int mileage, int cost) {
        this.name = name;
        this.mileage = mileage;
        this.cost = cost;
    }

}
