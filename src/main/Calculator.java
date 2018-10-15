package main;

import utils.UIUtils;


public class Calculator {
	
	public String readOperation(String message){
		
		String operation="";
		boolean isValid = false;
		
		do {
		
			operation=UIUtils.readString(message);
			if (operation.equalsIgnoreCase("+")||operation.equalsIgnoreCase("-")||operation.equalsIgnoreCase("*")||operation.equalsIgnoreCase("/")||operation.equalsIgnoreCase("c")||operation.equalsIgnoreCase("q")){
				isValid=true;	

			} else {
				System.out.println("Please enter valid operation");
			}
			
	    } while(!isValid);
		
		return operation;
		
	}
	
	public int calculate (int result, String operator, int inputNumber){
	
			switch (operator){
			case "+":
				result=result+inputNumber;
				break;
			case "-":
				result=result-inputNumber;
				break;
			case "*":
				result=result*inputNumber;
				break;
			case "/":
				result=result/inputNumber;
				break;
			case "c":
				break;
			case "q":
				break;
			
		}
		return(result);
	}
}
