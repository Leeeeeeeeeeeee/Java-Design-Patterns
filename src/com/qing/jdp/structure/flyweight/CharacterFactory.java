package com.qing.jdp.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

//享元工厂类
public class CharacterFactory {
 private Map<String, Character> characters = new HashMap<>();

 public Character getCharacter(char symbol, String font, int size, String color) {
     String key = symbol + font + size + color;
     if (!characters.containsKey(key)) {
         characters.put(key, new Character(symbol, font, size, color));
     }
     return characters.get(key);
 }
}