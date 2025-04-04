package vhm.Frases.Motivacionales.Spring.service;


import org.springframework.stereotype.Service;
import vhm.Frases.Motivacionales.Spring.config.QouteLoader;
import vhm.Frases.Motivacionales.Spring.model.QuoteModel;

import java.util.List;
import java.util.Random;

  @Service
  public class QuoteService {
    private final List<QuoteModel> quotes;
    private final Random random = new Random();

    public QuoteService(QouteLoader quoteLoader) {
      this.quotes = quoteLoader.getQuotes();
    }

    public QuoteModel getRandomQuote() {
      return quotes.get(random.nextInt(quotes.size()));
    }
  }
