package main;

import utils.UIUtils;

public class CalculatorApplication {
	
	public static void main (String[] arg){
		int result=0;
		String operation="+";
		int inputNumber=0;
		
        Calculator calculator = new Calculator();     
   		
        
        	while (!operation.equalsIgnoreCase("Q")) {
        		
        	 	result=0;
        	 	operation="+";
            	System.out.println(result);
            	
     			result=UIUtils.readNumber("Enter a number: ");
     			
     			while (!operation.equalsIgnoreCase("C")) {
     			
     				operation=calculator.readOperation("Enter an operation (+ Add,- Subtruct,* Multiply, / Divide, C Clear, Q Quit): ");
     				if (operation.equalsIgnoreCase("C")||operation.equalsIgnoreCase("Q")){
     					break;
     				} else  {
     					{
     						inputNumber=UIUtils.readNumber("Enter a number: ");
                	
     					}
	         	    result=calculator.calculate(result,operation,inputNumber);  
	                	
	                System.out.println(result); 
         			
     				}
     			}
         		
        	}  
        	System.out.println("Bye"); 
      }        
		
}


