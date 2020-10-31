
package translator.service;

import org.springframework.beans.factory.annotation.Autowired;

import translator.domain.TranslatedText;
import translator.exception.TranslatorException;

import traductor.TranslatorServiceGrpc;
import traductor.TranslatorProto.TranslationRequest;
import traductor.TranslatorProto.TranslationReply;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TranslatorServiceGrpcImpl extends TranslatorServiceGrpc.TranslatorServiceImplBase {

    TranslatorService translatorService;

    @Autowired
    public TranslatorServiceGrpcImpl(TranslatorService translatorService) {
        this.translatorService = translatorService;
    }

    @Override
    public void translate(TranslationRequest request, StreamObserver<TranslationReply> responseObserver) {

        TranslationReply.Builder reply = TranslationReply.newBuilder();

        try {
            TranslatedText translatedText = translatorService.translate(request.getLangFrom(), request.getLangTo(),
                    request.getText());
            reply.setResultCode("ok");
            reply.setTranslation(translatedText.getTranslation());
        } catch (TranslatorException e) {
            reply.setResultCode("error");
            reply.setErrorMsg(e.getMessage());
        }

        TranslationReply response = reply.build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}