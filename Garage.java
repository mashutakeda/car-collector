public class Garage {
    private GarageOwner theOwner;
    private Car[] carCatalogue;


    public Garage(GarageOwner theOwner, Car[] carCatalogue) {
        this.theOwner = theOwner;
        this.carCatalogue = carCatalogue;

    }

    public Garage() {
        this.theOwner = new GarageOwner("Enzo Ferrari", 35);
        this.carCatalogue = new Car[4];
    }


    //--------------methods---------------
    public Car addCar(int index, Car car) {
        if (index > 0 && index < carCatalogue.length) {
            //1.
            if (carCatalogue[index] != null) {
                Car old = carCatalogue[index];
                carCatalogue[index] = car;
                System.out.printf("There was a %s %d %s %s here before.\n",
                        old.getColor(), old.getYear(), old.getMake(), old.getModel());
                return old;
            } else {
                System.out.printf("A %s %d %s %s was just parked here.\n",
                        car.getColor(), car.getYear(), car.getMake(), car.getModel());
                carCatalogue[index] = car;
                theOwner.setCarsOwned(theOwner.getCarsOwned() + 1);
                return null;
            }
        } else {
            System.out.println("Cannot add a car to this spot.");
            return null;

        }
    }

    public Car sellCar(int index) {
        if (index > 0  && index < carCatalogue.length) {
            Car sold = carCatalogue[index];
            System.out.printf("%s just sold a %s %d %s %s.\n",
                    theOwner.getName(), sold.getColor(), sold.getYear(), sold.getMake(), sold.getModel());
            carCatalogue[index] = null;
            theOwner.setCarsOwned(theOwner.getCarsOwned() - 1);
            return sold;
        } else {
            System.out.println("There was no car to sell!");
            return null;
        }
    }


    public void showCertainCars(int conditionCategory) {

        for (int j = 0; j < carCatalogue.length; j++) {
            Car each = carCatalogue[j];
            if (each != null) {
                if ((each.getConditionCategory()) >= (conditionCategory + 10)) {
                    System.out.println(each.getConditionCategory());
                    System.out.printf("A %s %d %s %s with a condition category of %d.\n",
                            each.getColor(), each.getYear(), each.getMake(),
                            each.getModel(), each.getConditionCategory());
                }
            }


        }
    }
}