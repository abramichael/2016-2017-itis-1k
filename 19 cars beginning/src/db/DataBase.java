package db;

import entities.Continent;
import entities.Country;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ma on 23.03.2017.
 */
public class DataBase {
    private List<Country> countries;
    private List<Continent> continents;

    public void init() {
        prepareContinents("datasets/continents.csv");
        prepareCountries("datasets/countries.csv");
    }

    private void prepareCountries(String filename) {
        countries = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            scanner.nextLine();
            while (scanner.hasNext()) {
                String[] strData = scanner.nextLine().split(",");
                Country country = new Country();
                country.setCountryId(Integer.parseInt(strData[0]));
                country.setCountryName(strData[1].substring(1, strData[1].length() - 1));
                country.setContinentId(Integer.parseInt(strData[2]));
                country.setContinent(getContinentById(country.getContinentId()));
                countries.add(country);
            }

        } catch (IOException e) {
            System.out.println("Sorry, file not found, collection is empty");
        }
    }

    private void prepareContinents(String filename) {
        continents = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            scanner.nextLine();
            while (scanner.hasNext()) {
                String[] strData = scanner.nextLine().split(",");
                Continent c = new Continent();
                c.setContId(Integer.parseInt(strData[0]));
                c.setContinent(strData[1].substring(1, strData[1].length() - 1));
                continents.add(c);
            }
            scanner.close();
            System.out.println("Continents Data was loaded.");
        } catch (IOException e) {
            System.out.println("Sorry, file not found, collection is empty");
        }
    }

    public List<Continent> getAllContinents() {
        return continents;
    }

    public Continent getContinentById(int id) {
        for (Continent continent : continents) {
            if (continent.getContId() == id)
                return continent;
        }
        return null;
    }

    public List<Country> getAllCountry() {
        return countries;
    }
}
