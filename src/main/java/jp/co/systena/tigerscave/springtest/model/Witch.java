package jp.co.systena.tigerscave.springtest.model;

public class Witch extends Profession {

  private String name;

  @Override
  public String fight() {
    // TODO 自動生成されたメソッド・スタブ
      return "は魔法で攻撃した";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
