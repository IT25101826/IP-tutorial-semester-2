public class Marathon {
public static void main(String[] arg) {

	//a)Declare Variables 
		int miles;
		int yards;
		double kilometers;
	
	//b)initialize variables
		miles = 26;
		yards = 385;
		
	//c)& d)expression to calculate kilometers and store the result
		kilometers = (miles + yards / 1760.0) * 1.609;
		
    }
}