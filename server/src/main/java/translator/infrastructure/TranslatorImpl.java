package translator.infrastructure;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import java.io.IOException;
import java.net.URLEncoder;

import translator.domain.LanguageSourceTarget;
import translator.domain.Translator;
import translator.exception.TranslatorException;

abstract class TranslatorImpl implements Translator {

  private static final String ENCODING_UTF_8 = "UTF-8";

  @Override
  @Async
  public AsyncResult<String> translate(LanguageSourceTarget languageSourceTarget, String text) {
    try {
      String encodedText = URLEncoder.encode(text, ENCODING_UTF_8);
      String from = languageSourceTarget.getSource().asStr();
      String to = languageSourceTarget.getTarget().asStr();
      return new AsyncResult<>(translateInternal(from, to, text, encodedText));
    } catch (IOException e) {
      log().error("Problems translating:" + e.getMessage(), e);
      throw new TranslatorException("Problems translating:" + e.getMessage(), e);
    }
  }

  abstract protected String translateInternal(String from, String to, String text, String encodedText);
}
