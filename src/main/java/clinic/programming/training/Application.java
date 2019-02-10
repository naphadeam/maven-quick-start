package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public int countWords(String sentence){
		String [] separateWords = StringUtils.split(sentence,' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		
		greetings.add("Hello");
		
		for (String greeting : greetings){
			System.out.println("Greetings: " + greeting);
		}
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println("Starting Application");
		Application app = new Application();
		app.greet();
		System.out.println("Word Count : " + app.countWords("How are you doing today?"));
    }
}