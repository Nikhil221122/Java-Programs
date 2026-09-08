package programs;

public class DemoText {

    public static void main(String[] args) {
        String input = "Hi. nikhil ,, how aRe you ??";
        String words[] = input.split("[^a-zA-z]");
        
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            if(!word.isEmpty()) {
        	sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

}
