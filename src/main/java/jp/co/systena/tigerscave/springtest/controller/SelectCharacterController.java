package jp.co.systena.tigerscave.springtest.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp.co.systena.tigerscave.springtest.model.CharacterForm;
import jp.co.systena.tigerscave.springtest.model.Warrior;
import jp.co.systena.tigerscave.springtest.model.Witch;

@Controller
public class SelectCharacterController{

  public Map<String, String> characterMap = new LinkedHashMap<String, String>();
  public Warrior warrior = new Warrior();
  public Witch witch = new Witch();


  //トップページ
  @RequestMapping(value="/selectCharacter")
  public String index(Model model) {
      warrior.setName("戦士");
      witch.setName("魔法使い");
      characterMap.put(warrior.getName(), "戦士");
      characterMap.put(witch.getName(), "魔法使い");

      model.addAttribute("characterMapItems",characterMap);
      //model.addAttribute("message", new Message());

      // ビューの表示時にインスタンスを渡さないとエラーが出るので、その対策
      model.addAttribute("characterForm", new CharacterForm());
      return "selectCharacter";
  }

  // 確認ページ
  @RequestMapping(value = "/confirm", method = RequestMethod.GET)
  public String confirm(@ModelAttribute CharacterForm characterForm, Model model) {

      //職業によって攻撃するメッセージを設定する。
      //戦士の場合
      if(warrior.getName() == characterForm.getSelectedCharacter()) {
        characterForm.setName(warrior.fight());
      }
      //魔法使いの場合
      else if(witch.getName() == characterForm.getSelectedCharacter()) {
        characterForm.setName(witch.fight());
      }

      //ビューの設定
      model.addAttribute("characterForm",characterForm);

      return "confirm";
  }

  //結果ページ
  @RequestMapping(value = "/result", method = RequestMethod.GET)
  public String result(@ModelAttribute CharacterForm characterForm, Model model) {
     //ビューの設定
     model.addAttribute("characterForm",characterForm);
     return "result";
 }


}