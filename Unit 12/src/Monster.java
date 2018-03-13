//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		
	}

	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		setHeight(ht);
	}

	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		setHeight(ht);
		setWeight(wt);
		
	}

	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht){
		this.myHeight=ht;
	}
	
	public void setWeight(int wt){
		this.myWeight=wt;
	}
	
	public void setAge(int age){
		this.myAge=age;
	}

	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return this.myHeight;
	}
	
	public int getWeight(){
		return this.myWeight;
	}
	
	public int getAge(){
		return this.myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(myHeight==rhs.getHeight()){
			if(myWeight==rhs.getWeight()){
				if(myAge==rhs.getAge()){
					return true;
				}
			}
		}
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(equals(rhs)){
			return 0;
		}
		if(myHeight>rhs.getHeight()){
			return 1;
		}
		if(myHeight<rhs.getHeight()){
			return -1;
		}
		if(myWeight>rhs.getWeight()){
			return 1;
		}
		if(myWeight<rhs.getWeight()){
			return -1;
		}
		if(myAge>rhs.getAge()){
			return 1;
		}
		return -1;
	}

	//write a toString() method
	public String toString(){
		return(getHeight() + " " + getHeight() + " " + getAge());
	}
	
	
}