package programs;

public class occurence {

	public static void main(String[] args) {
		String name= "nikhil dattatray bhosale";
		int count=0;
		for(char c: name.toCharArray()) {
			if(c == 'i') {
				count++;
			}
		}
		
		System.out.print(count);
	}

}
