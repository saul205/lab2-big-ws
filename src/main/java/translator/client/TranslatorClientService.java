package translator.client;

import traductor.TranslatorServiceGrpc;
import traductor.TranslatorProto.TranslationRequest;
import traductor.TranslatorProto.TranslationReply;
import traductor.TranslatorServiceGrpc.TranslatorServiceBlockingStub;
import io.grpc.stub.StreamObserver;

import org.springframework.stereotype.Service;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class TranslatorClientService {

    @GrpcClient("TranslatorService")
    private TranslatorServiceBlockingStub myServiceStub;

    public String send(String from, String to, String name) {
        TranslationRequest request = TranslationRequest.newBuilder()
                .setText(name)
                .setLangTo(to)
                .setLangFrom(from)
                .build();
        return myServiceStub.translate(request).getTranslation();
    }

}