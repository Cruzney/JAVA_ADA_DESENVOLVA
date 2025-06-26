import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ViaCEPApp {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://viacep.com.br/ws/01001000/json/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            Scanner verboIn = new Scanner(System.in);
            System.out.println ("Informe o Verbo para chamar a API:" );
            String verbo = verboIn.nextLine ();
            String verboUpper = verbo.toUpperCase ();
            conn.setRequestMethod(verboUpper);

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            verboIn.close ();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
