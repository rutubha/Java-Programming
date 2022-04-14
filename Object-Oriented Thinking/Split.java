import java.util.ArrayList;

/**
 * Split
 */
public class Split {

    Split() {

    }

    ArrayList<String> split(String s, String regex) {
        ArrayList<String> split = new ArrayList<>();

        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            
            int j = 0;
            boolean flage = true;
            while(j < regex.length() && flage) {
                if(val == regex.charAt(j)) {
                    split.add(s.substring(index, i));
                    split.add(""+s.charAt(i));
                    index = i + 1;
                    flage = false;
                }
                j++;
            }
            if(flage) {
                split.add(s.substring(index, i));
            }
        }

        return split;
    }
}