public class Firearm extends Weapon{
    private String caliber;
    private int magazineCapacity;
    private String fireMode;

    public Firearm(String name, String type, String model, String country, String caliber, int magazineCapacity, String fireMode){
        super(name, type, model, country);
        this.caliber = caliber;
        this.magazineCapacity = magazineCapacity;
        this.fireMode = fireMode; 
    }

    public String getBallisticInfo(){
        return "Калибр: " + caliber + ", магазин: " + magazineCapacity + " патронов";
    }

    public boolean isAutomatic(){
        return fireMode.equalsIgnoreCase("автоматический");
    }

    public int shotsBeforeReload(){
        return magazineCapacity;
    }

    public String getCaliber() { return caliber; }
    public void setCaliber(String caliber) { this.caliber = caliber; }

    public int getMagazineCapacity() { return magazineCapacity; }
    public void setMagazineCapacity(int magazineCapacity) { this.magazineCapacity = magazineCapacity; }

    public String getFireMode() { return fireMode; }
    public void setFireMode(String fireMode) { this.fireMode = fireMode; }

    @Override
    public String toString() {
        return "Firearm{" + super.toString() +
               " -> caliber='" + caliber + "', magazine=" + magazineCapacity +
               ", mode='" + fireMode + "'}";
    }
}