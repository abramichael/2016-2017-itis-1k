package repositories;

import db.DataBase;
import db.DataBaseConnection;
import entities.Continent;

import java.util.List;

/**
 * Created by ma on 23.03.2017.
 */
public class ContinentRepository {
    private DataBaseConnection dbConnection;
    public ContinentRepository(DataBaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    public List<Continent> getAll() {
        return dbConnection.getDBConnection().getAllContinents();
    }

    public Continent getById(int id) {
        return dbConnection.getDBConnection().getContinentById(id);
    }

    public Continent getByName(String name) {
        for (Continent continent : dbConnection.getDBConnection().getAllContinents()) {
            if (continent.getContinent().equals(name))
                return continent;
        }
        return null;
    }
}
