package entities;


public class Country {
    private int countryId;
    private String countryName;

    public Country() {

    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getContinentId() {
        return continentId;
    }

    public void setContinentId(int continentId) {
        this.continentId = continentId;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Country(int countryId, String countryName, int continentId) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.continentId = continentId;
    }

    private int continentId;
    private Continent continent;

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", continentId=" + continentId +
                ", continent=" + continent.getContinent() +
                '}';
    }
}
