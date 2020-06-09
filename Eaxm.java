package eaxm;

import java.util.Arrays;
import java.util.ArrayList;

public class Eaxm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] an= {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		
		System.out.println(Arrays.toString(solution(an)));
		
		
	}
	
	
	public static int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
		int count1=0,count2=0,count3=0;
		
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==a[i%5]) {
				count1++;		
			}
			
			if(answers[i]==b[i%8]) {
				count2++;		
			}
			
			if(answers[i]==c[i%10]) {
				count3++;		
			}
		}
		
		int max = Math.max(count1, count2);
		max = Math.max(max, count3);
		
		ArrayList<Integer> answer1 = new ArrayList<Integer>();
		
		if(count1==max) {
			answer1.add(1);
		}
		
		if(count2==max) {
			answer1.add(2);
		}
		
		if(count3==max) {
			answer1.add(3);
		}
		
	    int[] answer = new int[answer1.size()];
	    for (int i=0; i < answer.length; i++)
	    {
	    	answer[i] = answer1.get(i).intValue();
	    }

		return answer;
    
	}
}
//정확도 100%   arraylist > 배열로 바꾸기 기억*