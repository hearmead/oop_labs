public class Pistol extends Firearm{
    private double barrelLength;
    private String triggerType; //тип УСМ
    private String sightsType; //тип прицельных

    public Pistol(String name, String type, String model, String country, String caliber,
        int magazineCapacity, String fireMode, double barrelLength, String triggerType, String sightsType
    ){
        super(name, type, model, country, caliber, magazineCapacity, fireMode);
        this.barrelLength = barrelLength;
        this.triggerType = triggerType;
        this.sightsType = sightsType;
    }

    //ствол короче 100мм?
    public boolean isCompact(){
        return barrelLength < 100;
    }

    public boolean hasOpticalSights(){
        return sightsType.equalsIgnoreCase("оптические") || sightsType.equalsIgnoreCase("коллиматорные");

    }

    //годится ли для скрытого ношения
    public boolean isConcealable(){
        return isCompact() && !hasOpticalSights();
    }

    public String getRecommendation() {
        if (hasOpticalSights() && !isCompact()) {
            return "Для тактического применения и точной стрельбы";
        }
        if (isCompact() && !hasOpticalSights()) {
            return "Для скрытого ношения и самообороны";
        }
        return "Универсальное использование";
    }

    public double getBarrelLength() { return barrelLength; }
    public void setBarrelLength(double barrelLength) { this.barrelLength = barrelLength; }

    public String getTriggerType() { return triggerType; }
    public void setTriggerType(String triggerType) { this.triggerType = triggerType; }

    public String getSightsType() { return sightsType; }
    public void setSightsType(String sightsType) { this.sightsType = sightsType; }

    @Override
    public String toString() {
        return "Pistol{" + super.toString() +
               ", barrel=" + barrelLength + "мм" +
               ", trigger='" + triggerType + "'" +
               ", sights='" + sightsType + "'}";
    }

}