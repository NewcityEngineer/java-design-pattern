package com.newcitysoft.study.design_pattern.create.builder;

public abstract class Burger implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}