import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class WriteURL {
    static void main(String[] args) {
        try {
// dirección del recurso
            URL url = new URL("https://httpbin.org/post");
// creamos una conexión

            HttpsURLConnection httpClient = (HttpsURLConnection) url.openConnection();
// establecemos el método de la petición
            httpClient.setRequestMethod("POST");
//creamos una cadena con los parámetros de la petición
            String urlParameters = "custname=Juan Carlos"
                    + "&custemail=c@c.com"
                    + "&custtel=978978978"
                    + "&delivery=22:30"
                    + "&size=mediana"
                    + "&topping=extra de queso&topping=cebolla"
                    + "&comments=Traer bien caliente";
// enviamos la petición POST
            httpClient.setDoOutput(true);
            try (PrintWriter wr = new PrintWriter(httpClient.getOutputStream())) {
                wr.write(urlParameters);
                wr.close();
            }
// obtenemos la respuesta del servidor
            int responseCode = httpClient.getResponseCode();
            System.out.println("Sending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);
            System.out.println("Response:");
// imprimimos la respuesta
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(httpClient.getInputStream()))) {
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            }
            httpClient.disconnect();
        } catch (MalformedURLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}