package com.newcitysoft.study.design_pattern.create.abstract_factory;
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}