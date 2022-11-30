package com.example.dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryUsingHashmap {
        private HashMap<String,String> dictionary;
        public DictionaryUsingHashmap(){
            dictionary = new HashMap<String , String>();
            addListOfWords();
        }

        public boolean addWord(String word , String meaning){
            dictionary.put(word , meaning);
            return true;
        }

        public String[] getSuggestions(String word){
            String[] suggestion = new String[5];
            int i=0;
            for(Map.Entry<String,String> entry : dictionary.entrySet()){
                int lastIndex = Math.min(word.length() , entry.getKey().length());
                if(word.compareTo(entry.getKey().substring(0,lastIndex))==0){
                    suggestion[i++]=entry.getKey();
                }
                if(i == 4)
                    break;
            }

            return suggestion;
        }
        public String findMeaning(String word){
            if(!dictionary.containsKey(word)){
                return "Given word are not found";
            }
            else{
                return dictionary.get(word);
            }
        }
        private void addListOfWords(){
            addWord("Shubh" ," Auspicious");
            addWord("Predicament" ," Situation");
            addWord("Weeping" ," Crying");
            addWord("Project" ," An application to do something");
            addWord("Realiable" ," That you can trust");
            addWord("Persistence" , " The fact of continuing in an opinion or course of action is spite");
            addWord("Body" , " It is dead matter");
            addWord("Smartphone" , " A mobile phone that performs many of functions of a computer");
            addWord("Realistic" , " Able to see things as they really are and to deal with them in a");
            addWord("Abused , magnificant" , " Illogical , impressive");
            addWord("Remedy" , " A medicine or treatement for a disease");
            addWord("Satellite" , " A satellite or artificial Satellite is an objects intentionally place");
            addWord("Home" , " A place to make shelter");
            addWord("Dictionary" , " A book or electronic resource that lists the words of a language");
            addWord("Common" , " belonging equally to");
        }
}
