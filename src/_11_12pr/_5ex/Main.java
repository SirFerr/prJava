package _11_12pr._5ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(sc.nextLine()));
        StringBuilder text = new StringBuilder();
        while (reader.ready()) {
            text.append(reader.readLine()+" ");
        }
        reader.close();
        String [] toAnalyze = text.toString().split(" ");

        StringBuilder result = getLine(toAnalyze);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result= new StringBuilder();
        if (words.length==0 || words==null) return result;
        List<String> list = new ArrayList<>(Arrays.asList(words));
        Collections.sort(list);

        result.append(list.get(0)+" ");
        String word = list.get(0);
        list.remove(0);
        int max=list.size();
        int count=0;

        while (true) {
            for (int i=0;i<list.size();i++) {
                if ( list.get(i).toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
                    result.append(list.get(i)+" ");
                    word=list.get(i);
                    list.remove(i);
                    break;
                }
            }
            count++;
            if (list.size()==0 || max==count) break;
        }

        for (String text : list) {
            result.append(text+" ");
        }

        return new StringBuilder((result.toString().trim()));
    }
}
