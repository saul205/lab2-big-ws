package translator.client;

import translator.client.TranslatorClientService;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Cliente{
    public static void main(){

        ManagedChannel ch = ManagedChannelBuilder.forTarget("localhost:9090").build();
        TranslatorClientService service = new TranslatorClientService();
        service.setChannel(ch);

        System.out.println(service.send("Saul"));

        System.out.println("hola");
    }
}