

public class Weapon{
    private String name;
    private String type;
    private String model;
    private String country;

    public Weapon(String name, String type, String model, String country){
        this.name = name;
        this.type = type;
        this.model = model;
        this.country = country;
    }

    public String getInfo(){
        return String.format("оружие: %s [%s %s] (%s)", name, type, model, country);
    }

    public boolean isFromCounty(String targerCountry){
        return country.equalsIgnoreCase(targerCountry);
    }

    public boolean isSameFamily(Weapon other){
        return this.type.equalsIgnoreCase(other.type);
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public String getType(){ return this.type; }
    public void setType(String type){ this.type = type; }

    public String getModel(){ return this.model; }
    public void setModel(String model){ this.model = model; }

    public String getCountry(){ return this.country; }
    public void setCountry(String country){ this.country = country; }

    @Override
    public String toString() {
        return "Weapon{name='" + name + "' type='" + type + "' model='" + model + "' country='" + country + "'}";
    }

}