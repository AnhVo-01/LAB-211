public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }
    
    @Override
    public void display() {
         System.out.printf("%-10s%-25s%-20.1f%-25s\n", this.countryCode,
                this.countryName, this.totalArea, this.countryTerrain);
    }   
    
    public String Compare(){
        return this.countryName.toUpperCase();
    }
}
