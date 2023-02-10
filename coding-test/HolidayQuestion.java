/** 
  
 example
 
 n  result 
 6   [1,2]
 7   [2,2]

**/

class HolidayQuestion {
    public static void main(String[] args) {
    	
    	int n = 7;
    	long[] answer = {0,0};
    	
    	// answer[0] 로직
    	int n_change = 0;
    	if(n < 6) {
    		answer[0] = 0;
    	} else if ((n+1)%7 == 0) {
			answer[0] = n - (((n+1)/7) * 5);		
    	} else {
    		n_change = n/7;
    		answer[0] = (n_change*7) - (((n_change*7)/7) * 5);
    	}
    	
    	// answer[1] 로직
    	n_change = 0; // 초기화
    	if(n <= 1) {
    		answer[1] = 1;
    	} else if(n <=7) {
    		answer[1] = 2;
    	} else if ((n-1)%7 == 0) {
			answer[1] = n - (((n-1)/7) * 5);		
    	} else {
    		n_change = n/7;
    		answer[1] = (n_change*7 + 2) - (((n_change*7)/7) * 5);
    	}
    	
    	System.out.println("answer : { " + answer[0] + ", " + answer[1] + " }");
    }
}