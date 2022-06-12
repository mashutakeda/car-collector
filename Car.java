public class Car {
    private int year;
    private String make;
    private String model;
    private String color;
    private int conditionCategory;
    private boolean isRestored;
    private String conditionString;



    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getConditionCategory() {
        return conditionCategory;
    }

    public void setConditionCategory(int conditionCategory) {
        if (conditionCategory > 100 || conditionCategory < 40) {
            this.conditionCategory = 80;
        } else {
            this.conditionCategory = conditionCategory;
        }
        if (conditionCategory >= 90) {
            isRestored = true;
        }
    }

    public Car(int year, String make, String model, String color, int conditionCategory) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.conditionCategory = conditionCategory;

        if (this.conditionCategory >= 90 && this.conditionCategory <= 100) {
            System.out.println("Perfect");
            this.isRestored = true;
        } else if (this.conditionCategory >= 80 && this.conditionCategory < 90) {
            System.out.println("Excellent");
        } else if (this.conditionCategory >= 70 && this.conditionCategory < 80) {
            System.out.println("Fine");
        } else if (this.conditionCategory >= 60 && this.conditionCategory < 70) {
            System.out.println("Very Good");
        } else if (this.conditionCategory >= 50 && this.conditionCategory < 60) {
            System.out.println("Good");
        } else if (this.conditionCategory >= 40 && this.conditionCategory < 50) {
            System.out.println("Driver");
        } else {
            this.conditionCategory = 80;
            System.out.println("Excellent");
        }
    }

    public Car(int year, String make, String model) {
        this(year, make, model, "blue", 80);
    }

    public Car() {
        this(1960, "Jaguar", "E-Type", "silver", 89);
    }
}


