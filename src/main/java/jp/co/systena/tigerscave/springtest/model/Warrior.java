package jp.co.systena.tigerscave.springtest.model;

public class Warrior extends Profession  {

  private String name;

  @Override
  public String fight() {
    // TODO 自動生成されたメソッド・スタブ
    return "は剣で攻撃した";

  }

  @Override
  public String recovery() {
    // TODO 自動生成されたメソッド・スタブ
    return "はやくそうで回復した！";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



}
