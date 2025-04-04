package vhm.Frases.Motivacionales.Spring.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vhm.Frases.Motivacionales.Spring.model.QuoteModel;
import vhm.Frases.Motivacionales.Spring.service.QuoteService;

@RestController
@RequestMapping("/quote")
@CrossOrigin(origins = "http://localhost:3000")
public class QuoteController {
  private final QuoteService quoteService;

  public QuoteController(QuoteService quoteService) {
    this.quoteService = quoteService;
  }

  @GetMapping
  public QuoteModel getQuote() {
    return quoteService.getRandomQuote();
  }
}
