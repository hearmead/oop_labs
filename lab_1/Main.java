public class Main {
    public static void main(String[] args) {
        Pistol glock = new Pistol(
                "Глок", "пистолет", "Glock 17", "Австрия",
                "9x19", 17, "одиночный",
                114, "двойного действия", "открытые"
        );

        Pistol makarov = new Pistol(
                "Макаров", "пистолет", "ПМ", "СССР",
                "9x18", 8, "одиночный",
                93, "двойного действия", "открытые"
        );

        // SIG Sauer P320 — с коллиматором
        Pistol sig = new Pistol(
                "SIG Sauer", "пистолет", "P320", "США",
                "9x19", 17, "одиночный",
                119, "одинарного действия", "оптические"
        );

        System.out.println("Методы класса Weapon");
        System.out.println(glock.getInfo());
        System.out.println("Glock и ПМ — одно семейство? " + glock.isSameFamily(makarov));
        System.out.println("Glock и SIG — одно семейство? " + glock.isSameFamily(sig));

        System.out.println("\nМетоды класса Firearm");
        System.out.println(glock.getBallisticInfo());
        System.out.println("Glock автоматический? " + glock.isAutomatic());
        System.out.println("Выстрелов до перезарядки: " + glock.shotsBeforeReload());

        System.out.println("\nМетоды класса Pistol");
        System.out.println("Glock компактный? " + glock.isCompact());
        System.out.println("ПМ компактный? " + makarov.isCompact());

        System.out.println("У Glock оптика? " + glock.hasOpticalSights());
        System.out.println("У SIG оптика? " + sig.hasOpticalSights());

        System.out.println("Glock для скрытого ношения? " + glock.isConcealable());
        System.out.println("ПМ для скрытого ношения? " + makarov.isConcealable());
        System.out.println("SIG для скрытого ношения? " + sig.isConcealable());

        System.out.println("Glock: " + glock.getRecommendation());
        System.out.println("ПМ: " + makarov.getRecommendation());
        System.out.println("SIG: " + sig.getRecommendation());
    }
}
