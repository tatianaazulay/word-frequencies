/******************************************************************************
 *  TATIANA AZULAY | 23750073
 *  Example commands for running this file:
 *  Compilation:  javac wordFrequencies.java
 *  Execution:    java wordFrequencies
 *
 *  Asks the user to input a path to a text file. It counts the appearance of each unique word in the file 
 *  and prints out a word frequency list in descending order sorted by number of occurences.
 *  Stopwords (such as the, a) are filtered out from the analysis.
 *  Words are not case sensitive. 
 *
 ******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class wordFrequencies
{ public static void main(String[]args) throws FileNotFoundException
{
     String [] stopWordsArr=new String[]{"a","about","above","after","again","against","all","am","an","and","any","are","aren't","as","at","be","because",
      "been","before","being","below","between","both","but","by","can","can't","cannot","could","couldn't","did","didn't","do","does","doesn't","doing",
      "don't","down","during","each","few","for","from","further","had","hadn't","has","hasn't","have","haven't","having","he","he'd","he'll",
      "he's","her","here","here's","hers","herself","him","himself","his","how","how's","i","i'd","i'll","i'm","i've","if","in","into","is","isn't",
      "it","it's","its","itself","let's","me","more","most","mustn't","my","myself","no","nor","not","of","off","on","once","only","or","other","ought",
      "our","ours","ourselves","out","over","own","same","shan't","she","she'd","she'll","she's","should","shouldn't","so","some","such","than","that",
      "that's","the","their","theirs","them","themselves","then","there","there's","these","they","they'd","they'll","they're","they've","this","those",
      "through","to","too","under","until","up","us","very","was","wasn't","we","we'd","we'll","we're","we've","were","weren't","what","what's","when",
      "when's","where","where's","which","while","who","who's","whom","why","why's","with","won't","would","wouldn't","you","you'd","you'll",
      "you're","you've","your","yours","yourself","yourselves"};
     Set<String> stopwords=new HashSet<>(Arrays.asList(stopWordsArr));
     HashMap<String,Integer> wordCount=new HashMap<String, Integer>();
     Scanner console= new Scanner(System.in);
     System.out.println("Please enter the path to the text file: ");
     String path=console.nextLine();
     Scanner file=new Scanner(new File(path));
     while(file.hasNext())
     {String word=(file.next()).replaceAll("[^a-zA-Z']","").toLowerCase();//filter out punctuation marks and transform word to lower case
      if(!stopwords.contains(word))
         {if (wordCount.containsKey(word) )
             {int n=wordCount.get(word);//get() used to retrieve the value(frequency count) mapped by word
               wordCount.put(word, ++n);
             }else if (!word.equals(""))
               wordCount.put(word,1);
         }
      }
      file.close();
      HashMap <String,Integer> sortedWordCount=sortByValue(wordCount);//sort hashmap by value
      for(String key:sortedWordCount.keySet())
      System.out.println(sortedWordCount.get(key)+": "+key);     
   }//main ends
   
   public static HashMap<String,Integer> sortByValue(HashMap<String,Integer>wordCount)
   {
   List <Map.Entry<String,Integer>> lst= new LinkedList<Map.Entry<String,Integer>>(wordCount.entrySet());//creats a list from elements of HashMap 
   Collections.sort(lst,new sortByValue());//sort the list
   HashMap<String,Integer> temp=new LinkedHashMap<String,Integer>();//LinkedHashMap maintains insertion order
   for (Map.Entry<String,Integer> entry:lst)
      temp.put(entry.getKey(),entry.getValue());//put data from sorted list to hashmap
   return temp;
   }
}//class wordFrequencies ends

      class sortByValue implements Comparator<Map.Entry<String,Integer>>
      {public int compare(Map.Entry<String,Integer> object1,Map.Entry<String,Integer> object2)
         {return (object2.getValue()).compareTo(object1.getValue());
          }
       }