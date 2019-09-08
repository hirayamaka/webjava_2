package jp.co.systena.tigerscave.springtest.model;

import javax.validation.constraints.Size;

public class Character {


  private int characterId;
  @Size(max=10)         // 入力最大長
  private String name;
  private String fightmessage;
  private String recoverymessage;
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

  //戦闘メッセージを取得
  public String getFightmessage() {
    return fightmessage;
  }

  //戦闘メッセージを設定
  public void setFightmessage(String fightmessage) {
    this.fightmessage = fightmessage;
  }

 //回復メッセージを取得
  public String getRecoverymessage() {
    return recoverymessage;
  }

 //回復メッセージを設定
  public void setRecoverymessage(String recoverymessage) {
    this.recoverymessage = recoverymessage;
  }

  public int getCharacterId() {
    return characterId;
  }

  public void setCharacterId(int characterId) {
    this.characterId = characterId;
  }
}
