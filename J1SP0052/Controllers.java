
import java.util.ArrayList;
import java.util.Comparator;

public class Controllers {
    private ArrayList<EastAsiaCountries> eac = new ArrayList<>();
    private Country country = new Country();
    public void add(EastAsiaCountries c){
        eac.add(new EastAsiaCountries(c.getCountryCode(), c.getCountryName(), 
                                      c.getTotalArea(), c.getCountryTerrain()));
        country = eac.get(eac.size()-1);
    }
    public EastAsiaCountries findByCode(String code){
        for (EastAsiaCountries c : eac) {
            if (c.getCountryCode().equalsIgnoreCase(code)){
                return c;
            }
        }
        return null;
    }
    
    public Country DisplayCountry (){
        return country;
    }
    
    public ArrayList<EastAsiaCountries> Search (String Country){
        if ("".equals(Country)) {
            return eac;
        } else {
            ArrayList<EastAsiaCountries> ListSearch = new ArrayList<>();
            for (EastAsiaCountries countr : eac) {
                String cname = countr.getCountryName();
                String code = countr.getCountryCode();
                if (cname.toUpperCase().contains(Country.toUpperCase())) {
                    ListSearch.add(countr);
                }
                if (code.toUpperCase().contains(Country.toUpperCase())){
                    ListSearch.add(countr);
                }
            }
            return ListSearch;
        }
    }
    
    public ArrayList<EastAsiaCountries> sortByName() {
        eac.sort(Comparator.comparing(EastAsiaCountries::Compare));
        return eac;
    }
}
