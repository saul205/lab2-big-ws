package translator.client;

import translator.lib.TranslatorServiceGrpc;
import translator.lib.TranslatorProto.TranslationRequest;
import translator.lib.TranslatorProto.TranslationReply;
import io.grpc.stub.StreamObserver;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import org.springframework.stereotype.Service;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class TranslatorClientService {
    
    
    @GrpcClient("TranslatorService")
    private TranslatorServiceGrpc.TranslatorServiceBlockingStub myServiceStub;

    public void setChannel(Channel ch){
        myServiceStub = TranslatorServiceGrpc.newBlockingStub(ch);
    }

    public String send(String name) {
        TranslationRequest request = TranslationRequest.newBuilder()
                .setText(name)
                .build();
        return myServiceStub.translate(request).getMessage();
    }

}