import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://jsonplaceholder.typicode.com/albums";
        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var httpclient = HttpClient.newBuilder().build();
        var httpResponse = httpclient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println((httpResponse.body()));
    }
}