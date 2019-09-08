package jp.co.systena.tigerscave.springtest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.model.Character;
import jp.co.systena.tigerscave.springtest.model.CharacterForm;
import jp.co.systena.tigerscave.springtest.model.Fighter;
import jp.co.systena.tigerscave.springtest.model.Warrior;
import jp.co.systena.tigerscave.springtest.model.Witch;

@Controller
public class SelectCharacterController{

  @Autowired
  HttpSession session;

  /*public Map<String, String> characterMap = new LinkedHashMap<String, String>();
  //public Map<String, String> characterMap = new LinkedHashMap<String, String>();
  public Warrior warrior = new Warrior();
  public Witch witch = new Witch();
  public Fighter fighter = new Fighter();*/

  //トップページ
  @RequestMapping(value="/selectCharacter")
  public ModelAndView index(ModelAndView model) {
      /*Map<String, String> characterMap = new LinkedHashMap<String, String>();
      /*Warrior warrior = new Warrior();
      Witch witch = new Witch();
      Fighter fighter = new Fighter();
      warrior.setName("戦士");
      witch.setName("魔法使い");
      fighter.setName("武闘家");*/

      /*characterMap.put("戦士", "戦士");
      characterMap.put("魔法使い", "魔法使い");
      characterMap.put("武闘家", "武闘家");

      model.addAttribute("characterMapItems",characterMap);
      //session.setAttribute("characterMapItems",characterMap);
      //model.addAttribute("message", new Message());

      // ビューの表示時にインスタンスを渡さないとエラーが出るので、その対策
      model.addAttribute("characterForm", new CharacterForm());
      session.setAttribute("characterForm", new CharacterForm());*/


      //new
      Map<Integer, Character> charactertMap = getCharacterMap();
      model.addObject("List", charactertMap);

      model.setViewName("selectCharacter");

      return model;

      //return "selectCharacter";
  }

  // 確認ページ
  @RequestMapping(value = "/confirm", method = RequestMethod.GET)
  public String confirm(@ModelAttribute CharacterForm characterForm, Model model) {

      //Profession profession = new  Warrior();
      /*String name = characterForm.getSelectedCharacter();
      Profession profession = null;
      if(name.equals("戦士") ) {
        profession = new Warrior();
      }
      else if(name.equals("魔法使い") ) {
        profession = new Warrior();
      }
      else if(name.equals("武闘家") ) {
        profession = new Warrior();
      }*/





      /*String name = characterForm.getSelectedCharacter();
      //職業によって攻撃するメッセージを設定する。
      //戦士の場合
      if(name.equals(warrior.getName() ) ) {
        characterForm.setFightmessage(warrior.fight());
        characterForm.setRecoverymessage(warrior.recovery());
      }
      //魔法使いの場合
      else if(name.equals(witch.getName() ) ) {
        characterForm.setFightmessage(witch.fight());
        characterForm.setRecoverymessage(witch.recovery());
      }
      //武闘家の場合
      else if(name.equals(fighter.getName() ) ) {
        characterForm.setFightmessage(fighter.fight());
        characterForm.setRecoverymessage(fighter.recovery());
      }*/

      //ビューの設定
      model.addAttribute("characterForm",characterForm);
      session.setAttribute("characterForm", characterForm);

      return "confirm";
  }

  //結果ページ(戦う)
  @RequestMapping(value = "/result",params="fight",method = RequestMethod.GET)
  public String fight(@ModelAttribute CharacterForm characterForm, Model model) {
     //ビューの設定
     model.addAttribute("characterForm",characterForm);
     return "result";
 }

  //結果ページ(回復)
  @RequestMapping(value = "/result",params="recovery",method = RequestMethod.GET)
  public String recovery(@ModelAttribute CharacterForm characterForm, Model model) {
     //ビューの設定
     model.addAttribute("characterForm",characterForm);
     return "result";
 }

  //結果ページ(回復)
  /*@RequestMapping(value = "/result",params="recovery", method = RequestMethod.GET)
  public String result1(@ModelAttribute CharacterForm characterForm, Model model) {
     //ビューの設定
     //model.addAttribute("characterForm",characterForm);
     return "result";
 }*/

  private Map<Integer, Character> getCharacterMap() {
    List<Character> characterList = new ArrayList<Character>();
    Warrior warrior = new Warrior();
    Witch witch = new Witch();
    Fighter fighter = new Fighter();


    Character character1 = new Character();
    character1.setCharacterId(1);
    character1.setName("戦士");
    character1.setFightmessage(warrior.fight());
    character1.setFightmessage(warrior.recovery());
    characterList.add(character1);

    Character character2 = new Character();
    character2.setCharacterId(2);
    character2.setName("魔法使い");
    character2.setFightmessage(witch.fight());
    character2.setFightmessage(witch.recovery());
    characterList.add(character2);

    Character character3 = new Character();
    character2.setCharacterId(3);
    character3.setName("武闘家");
    character3.setFightmessage(fighter.fight());
    character3.setFightmessage(fighter.recovery());
    characterList.add(character3);

    Map<Integer, Character> characterMap = new HashMap<Integer, Character>();
    for(Character character : characterList) {
      characterMap.put(character.getCharacterId(), character);
    }

    return characterMap;
  }


}