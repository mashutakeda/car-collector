public class Driver {
    public static void main(String[] args) {

        GarageOwner go1 = new GarageOwner("Mashu Takeda", 22);

        Car[] carCatalogue = new Car[3];
        Garage g1 = new Garage(go1, carCatalogue);

        Car c1 = new Car(2022, "Audi", "A7", "red", 40);
//        Car c2 = new Car(1978, "Toyota", "Corolla");
//        Car c3 = new Car();

        g1.addCar(1, c1);
//        g1.addCar(1, c2);
//        g1.addCar(2, c2);
//        g1.sellCar(1);

        //won't print out right conditionCategory without set
//        c1.setConditionCategory();
//        System.out.println(c1.setConditionCategory());
        g1.showCertainCars(30);

    }
}