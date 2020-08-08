//Description
//Write a program that keeps a map with synonyms.
//The key of the map will be the word.
//The value will be a list of all the synonyms of that word.
//Input / Constraints
//You will be given a number n.
//On the next 2 * n lines you will be given a word and a synonym each on a separate line like this:
//{word}
//{synonym}
//If you get the same word for the second time, just add the new synonym to the list.
//Output
//Print the words in the following format:
//{word} - {synonym1, synonym2… synonymN}

//Examples
//Input                                             	Output
//3                                                     cute - adorable, charming
//cute                                                  smart - clever
//adorable
//cute
//charming
//smart
//clever

//Examples
//Input                                             	Output
//2                                                     task – problem, assignment
//task
//problem
//task
//assignment
package AssociativeArrayPackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> Synonims = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <=(n) -1; i++) {
            String word = scanner.nextLine();
            String syno = scanner.nextLine();
            ArrayList<String> curentSynonim = Synonims.get(word);

            if(curentSynonim == null){
                curentSynonim = new ArrayList<>();
                Synonims.put(word, curentSynonim);


            }
            curentSynonim.add(syno);


        }

        for (Map.Entry<String, ArrayList<String>> entry : Synonims.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            ArrayList<String> output = entry.getValue();
            System.out.print(String.join(",", output));
            System.out.println();
        }

    }
}
