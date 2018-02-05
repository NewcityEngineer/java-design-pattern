package com.newcitysoft.study.design_pattern.create.builder;

public class Bottle implements Packing {

   @Override
   public String pack() {
      return "Bottle";
   }
}