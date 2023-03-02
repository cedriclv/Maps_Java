import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        
        // creation of players
        Player djoko = new Player("djoko", 198,"Serbia");
        Player medvedev = new Player("medvedev", 215,"Russia");
        Player nadal = new Player("nadal", 195, "Spain");
        Player alcaraz = new Player("alcaraz", 197010807, "Spain");
        Player fils = new Player("fils", 210, "France");
        Player zverev = new Player("zverev", 220, "Germany");
        Player thiem = new Player("zverev", 205, "Austria");

        // Test with HashMap

        HashMap<Player, String> hashMapPlayers = new HashMap<>();

        hashMapPlayers.put(djoko, "goat");
        hashMapPlayers.put(medvedev, "medium");
        hashMapPlayers.put(nadal, "goat");
        hashMapPlayers.put(alcaraz, "nextGen");
        hashMapPlayers.put(fils, "nextGen");
        hashMapPlayers.put(zverev, "nextGen");
        hashMapPlayers.put(thiem, "medium");

        for (Player player : hashMapPlayers.keySet()) {
                System.out.println(player.getName());
        }

        for (Map.Entry<Player, String> entry : hashMapPlayers.entrySet()) {
            System.out.println(entry.getKey().getName() + " is in the category " + entry.getValue() );
        }
    }
}
