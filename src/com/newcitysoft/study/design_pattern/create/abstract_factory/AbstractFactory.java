package com.newcitysoft.study.design_pattern.create.abstract_factory;
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}