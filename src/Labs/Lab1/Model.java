package Lab1;

public class Model {
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName, lastName;
    private int height;
    private double weight;
    private boolean canTravel, smokes;

    /**
     * Constructor 1
     *
     * @param
     */
    public Model(){

    }
    /**
     * Constructor 2
     *
     * @param firstName
     * @param lastName
     * @param heightInches
     * @param weightPounds
     * @param traveler
     * @param smoker
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes){
        this(firstName, lastName, height, weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }
    /**
     * Constructor 3
     *
     * @param firstName
     * @param lastName
     * @param heightInches
     * @param weightPounds
     */
    public Model(String firstName, String lastName, int height, double weight){
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
    }
    /**
     * get firstName
     * @param
     * @return the first name of the model
     */
    public String getFirstName() { return this.firstName = (firstName.length() >= 3 && firstName.length() <= 20)?firstName:""; }
    /**
     * get lastName
     * @param
     * @return the last name of the model
     */
    public String getLastName()  { return this.lastName = (lastName.length() >= 3 && lastName.length() <= 20)?lastName:"";  }
    /**
     * get height
     * @param
     * @return the height of the model
     */
    public int getHeightInches() { return this.height = (height >= 24 && height <= 84)?height:0; }
    /**
     * get weight
     * @param
     * @return the weight of the model
     */
    public double getWeightPounds() { return this.weight = (weight >= 80 && weight <= 280) ? weight : 0; }
    /**
     * get canTravel
     * @param
     * @return true or false if Travel
     */
    public boolean isCanTravel() { return canTravel; }
    /**
     * get smokes
     * @param
     * @return true or false if Smoke
     */
    public boolean isSmokes()    { return smokes;    }

    /**
     * set firstName
     * @param firstName
     * @return
     */
    public void setFirstName(String firstName)  { this.firstName = firstName; }
    /**
     * set lastName
     * @param lastName
     * @return
     */
    public void setLastName(String lastName)    { this.lastName = lastName; }
    /**
     * set height
     * @param height
     * @return
     */
    public void setHeight(int height)           { this.height = height; }
    /**
     * set height
     * @param height
     * @return
     */
    public void setHeight(int feet, int inches){
        setHeight((feet * INCHES_PER_FOOT) +  inches);
    }
    /**
     * set weight
     * @param weight
     * @return
     */
    public void setWeight(double weight)        { this.weight = weight; }
    /**
     * set canTravel
     * @param canTravel
     * @return
     */
    public void setCanTravel(boolean canTravel) { this.canTravel = canTravel; }
    /**
     * set smokes
     * @param smokes
     * @return
     */
    public void setSmokes(boolean smokes)       { this.smokes = smokes; }
    public String getMessageInch(int inch)          { return (inch>1)?"inches":"inch"; }
    public String getMessagePound(double pound)     { return (pound>1)?"pounds":"pound"; }
    public String getMessageTravel(boolean travel)  { return (travel==true)?"Does travel":"Doesn't travel"; }
    public String getMessageSmoke(boolean smoke)    { return (smoke==true)?"Does smoke":"Doesn't smoke"; }
    public String getHeightInFeetAndInches(){
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;
        return String.format("%d feet %d inches", feet, inches);
    }
    public long getWeightKg(double weight){
        double kg = weight / this.POUNDS_PER_KG;
        return Math.round(kg);
    }
    public void printDetails(){
        System.out.printf("Name: %s\n" +
                        "Height: %d %s\n" +
                        "Weight: %.1f %s\n" +
                        "%s\n" +
                        "%s\n",
                this.firstName + " " + this.lastName,
                this.height, getMessageInch(this.height),
                this.weight, getMessagePound(this.weight),
                getMessageTravel(this.canTravel),
                getMessageSmoke(this.smokes));
    }

    // Calculates a model's per-hour pay rate and returns the amount.                                       // DONE
    // Everyone receives the hourly BASE_RATE_DOLLARS_PER_HOUR.                                             // DONE
    // Tall, thin models (both tall and thin) receive an hourly bonus of TALL_THIN_BONUS_DOLLARS_PER_HOUR.  // DONE
    // Tall means TALL_INCHES inches or more, thin means less than THIN_POUNDS pounds.                      // DONE
    // Models who are willing to travel receive an extra TRAVEL_BONUS_DOLLARS_PER_HOUR per hour.            // DONE
    // However, models who smoke have SMOKER_DEDUCTION_DOLLARS_PER_HOUR per hour deducted from their pay.   // DONE
    public int calculatePayDollarsPerHour(){
        int sum = BASE_RATE_DOLLARS_PER_HOUR;
        sum = (this.height >= TALL_INCHES && this.weight < THIN_POUNDS)?sum+TALL_THIN_BONUS_DOLLARS_PER_HOUR:sum;
        sum = (isCanTravel() == true)?sum+TRAVEL_BONUS_DOLLARS_PER_HOUR:sum;
        sum = (isSmokes() == true)?sum-SMOKER_DEDUCTION_DOLLARS_PER_HOUR:sum;
        return sum;
    }

    public void displayModelDetails(){
        System.out.printf("Name: %s\n" +
                        "Height: %s\n" +
                        "Weight: %.1f %s\n" +
                        "%s\n" +
                        "%s\n" +
                        "Hourly rate: $%d",
                this.firstName + " " + this.lastName,
                this.getHeightInFeetAndInches(),
                this.weight, getMessagePound(this.weight),
                getMessageTravelNew(this.canTravel),
                getMessageSmokeNew(this.smokes),
                calculatePayDollarsPerHour());
    }
    public String getMessageTravelNew(boolean travel)  { return (travel==true)?"yep":"nope";}
    public String getMessageSmokeNew(boolean smoke)    { return (smoke==true)?"yep":"nope";}
}