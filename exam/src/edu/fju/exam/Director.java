package edu.fju.exam;

public class Director extends Manager{
	int bonusmoney;
	public Director (int wage){
		super(wage);
		super.bonus = wage +5000;
		
	}
@Override
public Director(String name , int wage , int bonusmoney){
	  this.name = name;
	  this.wage = wage;
	  this.bonusmoney;
}
}
