/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rainy
 */
public class A3Q7 {
    public void insertionSort(String[] words){
        for (int i = 1; i < words.length; i++){
            for (int j = i; j >0; j--){
                if(words[j].compareTo(words[j-1])<0){
                    //swap the two
                    String temp=words[j];
                    words[j]=words[j-1];
                    words[j-1]=temp;
                }
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        
        String[] words = {"hi","apple","pear"};
        test.insertionSort(words);
        
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
