import java.net.URL;
import java.util.Scanner;

class CountWord {
    public static void main(String[] args) throws Exception {
        try {
            URL urlString = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt"); 
            int count = 0;
            Scanner input = new Scanner(urlString.openStream());
            while(input.hasNext()) {
                String s = input.nextLine();
                count += s.length();
            }

            System.out.println("The file is " + count + " characters");
        } 
        catch(Exception e) {
            System.out.println("Message: " + e.getMessage());
        }

        
    }    
}
