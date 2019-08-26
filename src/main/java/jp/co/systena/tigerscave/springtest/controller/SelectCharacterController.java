package jp.co.systena.tigerscave.springtest.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import jp.co.systena.tigerscave.springtest.model.CharacterForm;

@Controller
public class SelectCharacterController{

  //トップページ
  @RequestMapping(value="/selectCharacter")
  public String index(Model model) {

      // ラジオボタンの選択肢
      Map<String, String> characterMap = new LinkedHashMap<String, String>();
      characterMap.put("key_warrior", "戦士");
      characterMap.put("key_witch", "魔法使い");

      model.addAttribute("characterMapItems",characterMap);

      // ビューの表示時にインスタンスを渡さないとエラーが出るので、その対策
      model.addAttribute("characterForm", new CharacterForm());
      return "index";
  }

  // 確認ページ
  /*@RequestMapping(value = "/confirm", method = RequestMethod.GET)
  public String confirm(@ModelAttribute CharacterForm characterForm, Model model) {
      return "confirm";
  }*/
  /*private String hello(){
    return "/SelectCharacter.html";
  }*/


}