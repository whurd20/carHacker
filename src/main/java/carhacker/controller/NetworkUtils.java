package carhacker.controller;


import carhacker.entity.Vehicle;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.*;

public class NetworkUtils {

    private static final String VIN_DECODER_URL = "https://vindecoder.p.rapidapi.com/v1.1/decode_vin?vin=KNAFW4A39A5125881";
    private static final String ACCESS_KEY = "x-rapidapi-key";

    public static URL generateURL() {
        String url = VIN_DECODER_URL;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://vindecoder.p.rapidapi.com/v1.1/decode_vin?vin=KNAFW4A39A5125881"))
                .header("x-rapidapi-key", "9d95cc3f90msh0746c51b3857b4bp10ff63jsnd492d474d43e")
                .header("x-rapidapi-host", "vindecoder.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());
        return null;
    }

    public static void getResponseFromURL() {

    }

    public static void parseJSONVehicle() {
        //Vehicle vehicle = new Vehicle;
    }
    //For testing
    public static void main(String[] args) {
//        System.out.println(generateURL("dsfdf"));

        URL url = NetworkUtils.generateURL();
        //String resultVehicle = NetworkUtils.getResponseFromURL(url);
        //Vehicle vehicle = parseJSONVehicle(resultVehicle);
        //System.out.println(vehicle);
    }
}
