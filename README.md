# word-frequencies
The program 
1. asks the user to input a path to a text file
2. reads from the text file
3. captures the data into a HashMap
4. counts the appearance of each unique word in the text file
5. prints out a word frequency list in the following format:<br/>
 number of occurrences: word

- Punctuation marks are eliminated from each word.
- Stopwords (such as the, a) are filtered out from the analysis. HashSet is used to store string values of stopwords
as HashSet offers constant time performance for the basic operation contains() which is used to identify stop words while 
reading the file.
- Words from the text file are stored in a HashMap where the word is stored as a key and a number of occurences stored as a value.
- Search on a HashMap is O(1), which allows to check if the next word from the file is already in a HashMap 
and if yes, increase the number of its occurences in constant time.
- Keys are not case sensitive.

Example commands for running this file:
 *  Compilation:  javac wordFrequencies.java
 *  Execution:    java wordFrequencies<br/>
**Sample of input file: song lyrics "Lessons" by Sohn**<br/>
![inputFile](https://user-images.githubusercontent.com/41156932/70396525-e5114a00-19d7-11ea-8ea0-879d51559089.jpg)<br/>
**Sample of output**<br/>
![output](https://user-images.githubusercontent.com/41156932/70396554-24d83180-19d8-11ea-808d-b14a669f1b7f.jpg)

 
