public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    // Default constructor
    public Pet() {
        this.petType = "";
        this.petName = "";
        this.dogSpaces = 30;
        this.catSpaces = 12;
        this.petAge = 0;
        this.daysStay = 0;
        this.amountDue = 0.0;
    }

    // Constructor with Parameters
    public Pet(String petType, String petName, int petAge, int daysStay) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.dogSpaces = 30;
        this.catSpaces = 12;
        this.amountDue = 0.0; // Ensure amountDue is initialized
    }

    // Accessor methods (getters)
    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public double getAmountDue() {
        return amountDue;
    }

    // Mutator methods (setters)
    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}