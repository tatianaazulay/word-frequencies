# word-frequencies
The program 
* asks the user to input a path to a text file
* reads from the text file
* captures the data into a data structure
* counts the appearance of each unique word in the text file
* prints out a word frequency list in the following format:
* number of occurrences: word

Punctuation marks are eliminated from each word.
Stopwords (such as the, a) are filtered out from the analysis. HashSet is used to store string values of stopwords
as HashSet offers constant time performance for the basic operation contains() which is used to identify stop words while 
reading the file.
Words from the text file are stores in a HashMap where the word is stored as a key and a number of occurences stored as a value.
Search on a HashMap is O(1), which allows to check if the next word from the file is already in a HashMap 
and if yes, increase the number of its occurences in constant time.
Keys are not case sensitive.

Example commands for running this file:
 *  Compilation:  javac wordFrequencies.java
 *  Execution:    java wordFrequencies
 
