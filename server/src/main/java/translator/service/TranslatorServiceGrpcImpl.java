
package translator.service;

import translator.lib.TranslatorServiceGrpc;
import translator.lib.TranslatorProto.TranslationRequest;
import translator.lib.TranslatorProto.TranslationReply;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TranslatorServiceGrpcImpl extends TranslatorServiceGrpc.TranslatorServiceImplBase {

    @Override
    public void translate(TranslationRequest request, StreamObserver<TranslationReply> responseObserver) {
        TranslationReply reply = TranslationReply.newBuilder()
                .setMessage("Hello ==> " + request.getText())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}