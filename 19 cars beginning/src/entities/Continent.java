package entities;

import java.util.List;

public class Continent {
    public Continent() {}

    public int getContId() {
        return contId;
    }

    public void setContId(int contId) {
        this.contId = contId;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Continent(int contId, String continent) {
        this.contId = contId;
        this.continent = continent;
    }

    private int contId;
    private String continent;

    @Override
    public String toString() {
        return "Continent{" +
                "contId=" + contId +
                ", continent='" + continent + '\'' +
                '}';
    }

}
