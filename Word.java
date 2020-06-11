package word;

import java.util.Arrays;

import sun.security.util.Length;

import java.util.ArrayList;

public class Word {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		System.out.println(solution(s));
		
	}
	
	
    public static String solution(String s) {
		// TODO Auto-generated method stub
	    String answer = "";	    
	    
	    /*if(s.length()%2==0) {
    		
    		answer = answer+s.charAt(s.length()/2-1)+s.charAt(s.length()/2);
  
    	}
	    
	    else {
	  		answer = answer+s.charAt(s.length()/2);
	    }*/
	    
	    answer= s.substring((s.length()-1)/2,s.length()/2+1);
	    
	    return answer;
	}
}

/*정확도 100% 효율0% s.substring>자르기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s		return
abcde	c
qwer	we
*/