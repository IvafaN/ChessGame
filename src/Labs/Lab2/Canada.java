package Labs.Lab2;

public class Canada {
    // Class Canada has one instance variable: // DONE
    private Province[] provinces;
    Province pr = new Province();
    // The Canada class has one constructor, a default constructor,                         // DONE
    // which simply creates an array of ten Province objects, to match Canada’s provinces.  // DONE
    public Canada(){
        this.provinces = new Province[]{new Province("Alberta", "Edmonton", 4067175),
                                        new Province("British Columbia", "Victoria", 4648055),
                                        new Province("Manitoba", "Winnipeg", 1278365),
                                        new Province("New Brunswick", "Fredericton", 747101),
                                        new Province("Newfoundland and Labrador", "St. John's", 519716),
                                        new Province("Nova Scotia", "Halifax", 971395),
                                        new Province("Ontario", "Toronto", 13448494),
                                        new Province("Prince Edward Island", "Charlottetown", 142907),
                                        new Province("Quebec", "Quebec City", 8164361),
                                        new Province("Saskatchewan","Regina",1098352)};
        
        for(int i=0; i<pr.provinceName.length;i++)
        {
            this.provinces = new Province[]{new Province(pr.provinceName[i], pr.cityName[i], pr.populationNumber[i])};
        }
    }
    // Add the following methods to the Canada class:  public void displayAllProvinces()                                // DONE
    // which loops through the array and prints each Province object’s getDetails() method. Note: Use for-each loop.    // DONE
    public void displayAllProvinces(){
        for (Province item: this.provinces) { System.out.println(item.getDetails()); }
    }

    // public int getNumOfProvincesBetween(int min, int max)                    // DONE
    // which takes the population in millions (e.g. 4, 6)                       // DONE
    // and returns the number of Provinces with the populations in that range   // DONE
    // (e.g. 4-6 million, inclusive). Note: Use for-each loop.                  // DONE
    public int getNumOfProvincesBetween(int min, int max){
        int numOfProvinces = 0;
        for (Province item : this.provinces) { if (item.getPopulation() >= min * 100000 && item.getPopulation() <= max * 100000) numOfProvinces++; }
        return numOfProvinces;
    }
}