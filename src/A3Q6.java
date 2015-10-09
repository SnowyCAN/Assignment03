/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class A3Q6 {
    
    public void bucketSort(int[] numbers)
    {
        
        int[] bukkit = new int[101]; 
        for (int i = 0; i < bukkit.length; i++) {
            bukkit[i]=0;
        }
        
        for (int i = 0; i < bukkit.length; i++) {
            bukkit[numbers[i]]++;
        }
        
        int count=0;
        for (int i = 0; i < bukkit.length; i++) {
            if(bukkit[i]>0){
                for (int j = 0; j < bukkit[i]; j++) {
                    numbers[count]=i;
                    count++;
                }
                
            }
        }
    }
    
    public static void main(String[] args) {
        A3Q6 test=new A3Q6();
        
        int[] numbers=new int[101];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random()*101);
        }
        
        test.bucketSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
}
