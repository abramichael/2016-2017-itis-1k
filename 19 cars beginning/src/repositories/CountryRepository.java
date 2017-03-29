package repositories;

import db.DataBaseConnection;
import entities.Continent;
import entities.Country;

import java.util.List;

/**
 * Created by ma on 23.03.2017.
 */
public class CountryRepository {
    private DataBaseConnection dbConnection;

    public CountryRepository(DataBaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<Country> getAll() {
        return dbConnection.getDBConnection().getAllCountry();
    }
    public Country getByName(String name) {
        for (Country country: dbConnection.getDBConnection().getAllCountry()) {
            if (country.getCountryName().equals(name))
                return country;
        }
        return null;
    }
}
