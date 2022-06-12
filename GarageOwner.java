public class GarageOwner {
    private String name;
    private int age;
    private int carsOwned = 0;

    public int getCarsOwned() {
        return carsOwned;
    }

    public void setCarsOwned(int carsOwned) {
        this.carsOwned = carsOwned;
    }


    public GarageOwner(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

}