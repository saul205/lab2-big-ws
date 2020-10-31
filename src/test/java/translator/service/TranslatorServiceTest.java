package translator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import translator.Application;
import traductor.TranslatorProto.TranslationRequest;
import traductor.TranslatorProto.TranslationReply;
import translator.domain.TranslatedText;
import translator.infrastructure.DummyTranslator;

import io.grpc.testing.StreamRecorder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranslatorServiceTest {

  @Autowired
  private TranslatorServiceGrpcImpl server;

  @Test
  public void translateTest() {

    String from = "en";
    String to = "es";
    String text = "buenas";
    TranslationRequest req = TranslationRequest.newBuilder()
      .setText(text)
      .setLangTo(to)
      .setLangFrom(from)
      .build();

    StreamRecorder<TranslationReply> responseObserver = StreamRecorder.create();
    server.translate(req, responseObserver);
    assertNull(responseObserver.getError());
    List<TranslationReply> results = responseObserver.getValues();
        assertEquals(1, results.size());
    TranslationReply response = results.get(0);

    assertEquals(response.getTranslation(), "I don't know how to translate from "+from+" to "+ to + " the text '"+text+"'");
  }

}
