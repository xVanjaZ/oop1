import java.util.ArrayList;

public class Persoon {
    private final String naam;
    private double budget;
    private final ArrayList<Game> games = new ArrayList<>();

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game game) {
        double verschil = budget - game.huidigeWaarde();

        if (verschil >= 0 && !games.contains(game)) {
            games.add(game);
            budget = budget - game.huidigeWaarde();

            return true;
        }

        return false;
    }

    public boolean verkoop(Game game, Persoon koper) {
        if (games.contains(game)) {
            if (koper.koop(game)) {
                games.remove(game);
                budget += game.huidigeWaarde();

                return true;
            }
        }

        return false;
    }

    public Game zoekGameOpNaam(String naam){
        for (Game game : games){
            if (game.getNaam().equals(naam)) {
                return game;
            }
        }

        return null;
    }

    public ArrayList<Game> gamesNietInBezit(ArrayList<Game> games){
        ArrayList<Game> nietInBezit = new ArrayList<>();

        for (Game game : games){
            if (!this.games.contains(game)){
                nietInBezit.add(game);
            }
        }

        return nietInBezit;
    }

    public String toString() {
        String s = naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        for (Game g : games) {
            s += "\n" + g;
        }
        return s;
    }
}
