package BehavioralPatterns;


public class Context {  
	  
    private BehavioralPatterns.strategy strategy;  
    
    public Context(BehavioralPatterns.strategy strategy){  
       this.strategy = strategy;  
    }  

    public float executeStrategy(float num1, float num2){  
       return strategy.calculation(num1, num2);  
    }  
}