package com.greatlearning.driver;
import com.greatlearning.service.*;
import java.util.Stack;

public class Main {
		 	  	
	    // Driver code
	    public static void main(String[] args) {
	          	
	    	String bracketExpression = "([{}])";
	        
	        Boolean result;
	        
	        result = checkBalancingBrackets.checkingBracketsBalanced(bracketExpression);
	        
	        if (result)
	            System.out.println("The entered string has Balanced Brackets");
	        else
	            System.out.println("The entered string do not contain Balanced Brackets");
	    }
}
