package jp.co.systena.tigerscave.springtest.model;

public class Warrior extends Profession  {

  private String name;

  @Override
  public String fight() {
    // TODO 自動生成されたメソッド・スタブ
    return "は剣で攻撃した";

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
