package translator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import translator.Application;
import translator.client.TranslatorClientService;
import translator.domain.TranslatedText;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranslatorServiceTest {

  @Autowired
  TranslatorClientService client;

  @Test(expected = RuntimeException.class)
  public void translateTest() {
    String algo = client.send("algo");
    assertEquals("Respuesta incorrecta", "Hello ==> algo".equals("Hello ==> " + algo));
  }

}
