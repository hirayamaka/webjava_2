package jp.co.systena.tigerscave.springtest.model;

import java.io.Serializable;

public class Message implements Serializable {

  private String text;

  public String getText() {
      return text;
  }

  public void setText(String text) {
      this.text = text;
  }

}
