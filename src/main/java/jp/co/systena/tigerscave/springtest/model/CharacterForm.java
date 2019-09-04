package jp.co.systena.tigerscave.springtest.model;

import javax.validation.constraints.Size;

public class CharacterForm {

  @Size(max=10)         // 入力最大長
  private String name;
  private String fightmessage;
  // 選択されたラジオボタン
  private String selectedCharacter;

  //職業の名前を取得
  public String getName() {
    return this.name;
  }

  //職業の名前を設定
  public void setName(String name) {
    this.name = name;
  }

  //職業を取得
  public String getSelectedCharacter() {
    return selectedCharacter;
   }

  //職業を設定
  public void setSelectedCharacter(String selectedCharacter) {
    this.selectedCharacter = selectedCharacter;
   }

  public String getFightmessage() {
    return fightmessage;
  }

  public void setFightmessage(String fightmessage) {
    this.fightmessage = fightmessage;
  }

}
