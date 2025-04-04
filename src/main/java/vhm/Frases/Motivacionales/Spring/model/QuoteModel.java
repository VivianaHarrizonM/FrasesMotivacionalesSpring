package vhm.Frases.Motivacionales.Spring.model;

public class QuoteModel {
    private String texto;
    private String autor;

    public QuoteModel() {
    }

    public QuoteModel(String texto, String autor) {
      this.texto = texto;
      this.autor = autor;
    }

    public String getTexto() {
      return texto;
    }

    public String getAutor() {
      return autor;
    }
  }

