import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateResponse {

    String result;
    double conversion_rate; // o el tipo que corresponda
    double conversion_result; // Para obtener el resultado de la conversión
    String target_code;
    String base_code;
    int amount;

    JsonObject conversion_rates;


public static void getExchangeRate(String baseCurrency, String targetCurrency, int amount) {
    try {
        // Set the URL for the API request
        String urlStr = "https://v6.exchangerate-api.com/v6/a27b80c4e55909a8bd396c91/pair/" + baseCurrency + "/" + targetCurrency + "/" + amount;

        // Create a URL object
        URL url = new URL(urlStr);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Use Gson to parse the JSON response
        Gson gson = new Gson();
        ExchangeRateResponse response = gson.fromJson(new InputStreamReader(request.getInputStream()), ExchangeRateResponse.class);


        System.out.println("Al convertir "+ baseCurrency + " a " +targetCurrency+ " obtenemos: " +   response.conversion_result + " " + targetCurrency);

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    }

