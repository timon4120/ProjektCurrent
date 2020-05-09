package Projekt;

public class Country implements Comparable<Country>
{

    private String nam;

    public Country(String nazwa) {
        nam=nazwa;
    }
    public String getName() {
        return nam;
    }

    public void setName(String name) {
        nam = name;
    }
    @Override
    public int compareTo(Country anotherCountry) {
        return this.nam.compareTo(anotherCountry.getName());
    }
}
