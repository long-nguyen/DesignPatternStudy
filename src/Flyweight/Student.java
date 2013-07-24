package Flyweight;

public class Student {
	private String name;
	private int id;
	private int score;
	private double averageScore;
	
	public Student(double a){
		averageScore=a;
	}
	
	public void setName(String n){
		name=n;
	}
	
	public void setId(int i){
		id=i;
	}
	
	public void setScore(int s){
		score=s;
	}
	
	public String getName(){
		return name;
	}
	
	public int getScore(){
		return score;
	}
	
	public int getId(){
		return id;
	}
	
	public double getStanding(){
		return (score/averageScore -1.0)*100;
	}
}
