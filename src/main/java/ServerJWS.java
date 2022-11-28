import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String adress_serveur="http://0.0.0.0:9191/";
        Endpoint.publish(adress_serveur,new BanqueService());
        System.out.println("web service deplpoyé sur http://0.0.0.0:9191/");
    }
}
