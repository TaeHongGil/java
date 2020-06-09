package study;

import java.util.Arrays;
import java.util.ArrayList;

public class Study {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] par= {"mislav", "stanko", "mislav", "ana"};
		String[] com= {"stanko", "ana", "mislav"};
		
		System.out.println(solution(par,com));
		
	}
	
	
	public static String solution(String[] participant, String[] completion) {    	
		// TODO Auto-generated method stub
	    String answer = "";
	    
	    Arrays.sort(participant);
	    Arrays.sort(completion);
	    
	    
	    for(int i=0;i<participant.length;i++) {
	    	if(i == participant.length-1)
            {
                answer = participant[i];
                break;
            }

	    	else if(!participant[i].equals(completion[i])) {
	    		answer=participant[i];
	    		break;
	    	}
	    }
	    /*for(int i=0;i<participant.length;i++) {

	    	for(int j=0;j<completion.length;j++) {
	    		
	    		if(participant[i].equals(completion[j])) {
	    			participant[i]="";
	    			completion[j]="";
	                count++;
	    			break;
	    		}
	    	}
	    	
	    	if(count==0) {
	    		answer=participant[i];
	    	}
	    	count=0;
	    }*/
	    
		return answer;
	}
}

//Á¤´ä·ü 100% È¿À² 0%  
