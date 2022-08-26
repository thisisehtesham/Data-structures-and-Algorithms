package oops.singletonpattern;

public class AppConfig {

    private AppConfig () {
    	
    }
    
//    private static AppConfig obj = new AppConfig();      //Singleton Pattern
//    
//    public static AppConfig getinstance() {
//    	return obj;
    
    private static AppConfig obj = null;                   //Optimised Singleton Pattern
    
    public static AppConfig getInstance() {
    	if(obj == null) {
    		obj = new AppConfig();
    	}
    	return obj;
    }
}
 