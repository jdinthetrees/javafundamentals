import java.util.Set;
import java.util.HashMap;

public class HashMatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("We Don't Deserve Love", "Arcade Fire");
        trackList.put("Mourning Dove", "Jon McKiel");
        trackList.put("Land(feat. Justin Vernon", "CARM, Justin Vernon");
        trackList.put("Bird and Flag", "The Sea and Cake");
        //grab a song from title
        String getSong = trackList.get("Bird and Flag");
        System.out.println(getSong);
        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
            // System.out.println(trackList.get(key));    
        }
    }
}
