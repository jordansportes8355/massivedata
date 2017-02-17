package inverted_index;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV_stopwords {

	public static ArrayList<String> getStopWords(){
		ArrayList<String> stopwords= new ArrayList<String>();
		
		String csvFile = "stop_words1.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // separated by a comma
                String[] words = line.split(cvsSplitBy);

              
                stopwords.add(words[0].toLowerCase());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

		return stopwords;
	}
	public static void main(String[] args){
		System.out.println(getStopWords());
	}
	
}
