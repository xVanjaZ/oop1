public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris inventaris = new BedrijfsInventaris("Twan solutions", 35000);

        Computer computer1 = new Computer("Dell", "MAC1", 1200, 2021);
        Computer computer2 = new Computer("Dell", "MAC1", 1200, 2021);

        Fiets fiets1 = new Fiets("Gazelle", 750, 2020, 8177123);
        Fiets fiets2 = new Fiets("Gazelle", 750, 2020, 8177123);

        Auto auto1 = new Auto("Volvo", 21000, 2015, "2-STE-31");
        Auto auto2 = new Auto("Volvo", 21000, 2015, "2-STE-31");

        inventaris.schafAan(computer1);
        inventaris.schafAan(computer2);

        inventaris.schafAan(fiets1);
        inventaris.schafAan(fiets2);

        inventaris.schafAan(auto1);
        inventaris.schafAan(auto2);

        Computer computer3 = new Computer("Acer", "MAC2", 600, 2018);
        Fiets fiets3 = new Fiets("Quantumbike", 1500, 2019, 1298378);
        Auto auto3 = new Auto("Tesla", 50000, 2021, "9-HEU-187");

        inventaris.schafAan(computer3);
        inventaris.schafAan(fiets3);
        inventaris.schafAan(auto3);

        System.out.println(inventaris);
    }
}
