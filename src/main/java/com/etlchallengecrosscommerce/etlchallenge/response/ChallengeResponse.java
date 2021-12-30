package com.etlchallengecrosscommerce.etlchallenge.response;
import java.util.ArrayList;

//dev: Suellen Azevedo

public class ChallengeResponse {
	
	private ArrayList<Double> numbers;

	//get and set
	public ArrayList<Double> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Double> numbers) {
		this.numbers = numbers;
	}
	
	//methods
	public ArrayList<Double> sortNumbers() {
		
		ArrayList<Double> n = this.getNumbers();
		
		
		 for (int i = 0; i < n.size() - 1; i++) {
	            for (int j = n.size() - 1; j > i; j--) {
	                if (n.get(j - 1) > n.get(j)) {
	                    
	                    Double tmp = n.get(j - 1);
	                    n.set(j -1, n.get(j));
	                    n.set(j, tmp);
	                }
	             }
	        }
		return n;
		
	}
}
