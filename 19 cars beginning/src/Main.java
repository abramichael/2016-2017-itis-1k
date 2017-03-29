import db.DataBase;
import db.DataBaseConnection;
import entities.Continent;
import entities.Country;
import repositories.ContinentRepository;
import repositories.CountryRepository;


public class Main {
    private static ContinentRepository continentRepo;
    private static CountryRepository countryRepo;
    public static void init() {
        continentRepo = new ContinentRepository(
                new DataBaseConnection()
        );
        countryRepo = new CountryRepository(
                new DataBaseConnection()
        );

    }
    public static void main(String[] args) {
        init();
        System.out.println(continentRepo.getAll());
        System.out.println(countryRepo.getAll());
        Continent continent = continentRepo.getByName("africa");
        Country country = countryRepo.getByName("usa");
        country.setContinent(continent);
        System.out.println(country);
        //country.save()
    }
}
