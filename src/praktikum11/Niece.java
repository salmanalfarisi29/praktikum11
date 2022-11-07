package praktikum11;

import java.util.*;

public class Niece implements Comparable<Niece> 
{
	private String name;
	private int birthday;
	private int birthmonth;
	Map<Uncle, String> presents = new HashMap<Uncle, String>();
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBirthday(int birthday)
	{
		this.birthday= birthday;
	}
	
	public void setBirthmonth(int birthmonth) 
	{
		this.birthmonth = birthmonth;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getBirthDay()
	{
		return this.birthday;
	}
	
	public int getBirthMonth()
	{
		return this.birthmonth;
	}
	
	public Map<Uncle, String> getPresents()
	{
		return this.presents;
	}
	
	public int clearPresents()
	{
		int totalPresent = presents.size();
		presents.clear();
		return totalPresent;
	}
	
	public void listPresents()
	{
		System.out.println("___________________________________________________");
		System.out.println("Hadiah untuk " + this.name + ":");
		for (Map.Entry<Uncle, String> entry : presents.entrySet())
		{
			System.out.println("");
			System.out.println(entry.getKey().getName());
			System.out.println((entry.getValue()==null ? "tidak memberinya hadiah" : "memberinya hadiah berupa  " + entry.getValue()));
		}
	}
	
	public String toString()
	{
		return "Name :" + name + "|Birth Day : " + birthday + "-" + birthmonth;
	}
	
	public boolean equals(Object other)
	{
		if(other == this) return true;
		if(other == null) return false;
		if(getClass() != other.getClass()) return false;
		return name.equals(((Niece)other).name);
	}
	
	public int hashCode()
	{
		return name.hashCode();
	}
	
	public int compareTo(Niece o) {
		if(this.birthmonth > o.birthmonth) {
			return 1;
		} else if(this.birthmonth == o.birthmonth) {
			return (this.birthday > o.birthday ? 1 : -1);
	    }
		return -1;
}
}
