/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class A3Q5 
{
    public void mulletSort(int[] n){
        for (int i = 1; i < n.length; i++){
            for (int j = i; j >0 && n[j]>n[j-1]; j--){
                //swap
                int temp=n[j-1];
                n[j-1]=n[j];
                n[j]=temp;
            }
        }
    }
    
    public static void main(String[] args) {
        A3Q5 test= new A3Q5();
        int[] n={24,1,5,23,87,13,2};
        test.mulletSort(n);
        //check if sorted
        for (int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
    }
}
