package Labs.Lab2;

public class Province {
    // Class Province has three instance variables:             // DONE
    // private String name;         // e.g. “British Columbia”  // DONE
    // private String capital;  // e.g. “Victoria”              // DONE
    // private long population; // e.g. 2264823                 // DONE

    private String name;     // e.g. “British Columbia”
    private String capital;  // e.g. “Victoria”
    private long population; // e.g. 2264823

    public final long DEFAULT_POPULATION = 4648055;
    public final String DEFAULT_PROVINCE = "British Columbia";
    public final String DEFAULT_CAPITAL = "Victoria";

    // you must write which contains a local array of the 10 Canadian Province names                // DONE
    // you must write which contains a local array of the 10 Canadian Province Capital City names   // DONE
    public static final String[] provinceName = new String[]{"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan"};
    public static final String[] cityName = new String[]{"Edmonton", "Victoria", "Winnipeg", "Fredericton", "St. John's", "Halifax", "Toronto", "Charlottetown", "Quebec City", "Regina"};
    public static final long[] populationNumber = { 4067175, 4648055, 1278365, 747101, 519716, 971395, 13448494, 142907, 8164361, 1098352};

    // The constructor takes all three parameters and assigns them if they follow the rules:    // DONE
    // name = Must be one of the 10 Canadian Provinces                                          // DONE
    // capital = Must be the name of the capital city                                           // DONE
    // population = Must be between 30,000 and 15,000,000                                       // DONE
    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && isValidProvince(name) && isValidCapitalCity(capital)){
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            // if there is any error; create the default data, shown below
            // If an invalid province, capital, or population is input to the constructor,
            // set the data to British Columbia, Victoria, 4648055.         // DONE
            this.population = DEFAULT_POPULATION;   // 4,648,055            // DONE
            this.name = DEFAULT_PROVINCE;           // “British Columbia”   // DONE
            this.capital = DEFAULT_CAPITAL;         // “Victoria”           // DONE
        }
    }
    //  There is also a second (default) constructor that takes no parameters and simply sets the data to British Columbia, Victoria, 4648055. // DONE
    public Province(){
        this.population = DEFAULT_POPULATION;   // 4,648,055            // DONE
        this.name = DEFAULT_PROVINCE;           // “British Columbia”   // DONE
        this.capital = DEFAULT_CAPITAL;         // “Victoria”           // DONE
    }
    // isValidPopulation(int population) is a private method                                                           // DONE
    // you must write which returns true if the parameter is between 30,000 and 15,000,000 otherwise it returns false. // DONE
    private boolean isValidPopulation(long population){
        if (population >= 30000 && population <= 15000000)
            return true;
        else
            return false;
    }
    // isValidProvince(String province) is a private method                                         // DONE
    // and returns true if the String parameter exists in that array; otherwise it returns false.   // DONE
    private boolean isValidProvince(String province) {
        for (String nameProvince : provinceName) {
            if (nameProvince.equals(province)) {
                return true;
            }
        }
        return false;
    }
    // isValidCapitalCity(String capital) is a private method                                       // DONE
    // and returns true if the String parameter exists in that array; otherwise it returns false.   // DONE
    private boolean isValidCapitalCity(String capital){
        for (String city : cityName) {
            if (city.equals(capital)) {
                return true;
            }
        }
        return false;
    }

    // Then, add accessor(getter) and mutator(setter) methods for each instance variable.           // DONE
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCapital() { return capital; }
    public void setCapital(String capital){ this.capital = capital; }
    public long getPopulation() { return population; }
    public void setPopulation(long population) { this.population = population; }

    // Finally, add a method called public String getDetails() which returns a String in the format: // DONE
    public String getDetails(){
        return String.format("The capital of %s (population. %s) is %s.", getName(), getPopulation(), getCapital());
    }
}