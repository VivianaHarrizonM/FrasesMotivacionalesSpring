package vhm.Frases.Motivacionales.Spring.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import vhm.Frases.Motivacionales.Spring.model.QuoteModel;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

  @Component
  public class QouteLoader {
    private List<QuoteModel> quotes;

    public QouteLoader() {
      loadQuotes();
    }

    private void loadQuotes() {
      ObjectMapper mapper = new ObjectMapper();
      try {
        quotes = mapper.readValue(
                Paths.get("src/main/resources/quote.json").toFile(),
                new TypeReference<List<QuoteModel>>() {}
        );
      } catch (IOException e) {
        throw new RuntimeException("Error loading quotes", e);
      }
    }

    public List<QuoteModel> getQuotes() {
      return quotes;
    }

}
