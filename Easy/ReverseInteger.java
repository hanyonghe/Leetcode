//Given a 32-bit signed integer, reverse digits of an integer.
//
//Example 1:
//
//Input: 123
//Output: 321

// this is my version, it works but performaces bad
package Easy;

public class ReverseInteger {
	public static void main(String[] args) {
		reverse(651313134);
		
	}	
	
	 static int reverse(int x) {
	       if (x==0) return 0;
	        int x2 = java. lang. Math. abs(x);
	        StringBuilder sb = new StringBuilder(x2+"");
	        sb.reverse();
	        for(int i= 0;i < sb.length(); i++){
	            if(sb.charAt(0)=='0'){
	                sb.deleteCharAt(0);
	            }
	        }
	        String s = sb+"";
	        try{long l = Long.parseLong(s);
	        if(l>Integer.MAX_VALUE) return 0;
	        if (x > 0) return (int)l;
	        else return - (int)l;}
	        catch(java.lang.NumberFormatException e){
	            return 0;
	        }
}
}
