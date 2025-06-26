import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        try {
            URL Url = new URL ( "https://rickandmortyapi.com/api/character/1" );

            HttpURLConnection conn = (HttpURLConnection) Url.openConnection ();
            conn.setRequestMethod ( "GET" );

            Scanner sc = new Scanner ( Url.openStream () );
            while (sc.hasNext (  )) {
                System.out.println (sc.nextLine () );
            }


        } catch (Exception e) {
            throw new RuntimeException ( e );
        }
    }
}