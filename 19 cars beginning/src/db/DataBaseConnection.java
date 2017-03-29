package db;


public class DataBaseConnection {
    private static DataBase db;
    public static DataBase getDBConnection() {
        if (db == null) {
            db = new DataBase();
            db.init();
        }
        return db;
    }
}
