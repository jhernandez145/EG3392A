
/*
 * Jesus Hernandez 614019
 * 10-06-16
 * Assignment 6 Question 2
 */
import java.util.ArrayList;
public class Score {
	ArrayList<Integer> scoreArrayList = new ArrayList<Integer>();
	
	public Score(ArrayList<Integer> scoreArrayList){
		this.scoreArrayList = scoreArrayList;
	}
	
	public void checkValues(){
		int index = 0;
		while(index < scoreArrayList.size()){
			if(scoreArrayList.get(index) > 100 || scoreArrayList.get(index) < 0){
				throw new IllegalArgumentException("Score too high or low, you entered: " + scoreArrayList.get(index) + " for grade number " + (index + 1));
			}
			index++;
		}
	}
	
	public double getAverage(){
		double average = 0;
		
		for(int score : scoreArrayList){
			average += score;
		}
		
		average /= scoreArrayList.size();
		
		return average;
	}
	
	public void printScores(){
		scoreArrayList.forEach((number) ->{
			System.out.println(number);
		});
	}

}
