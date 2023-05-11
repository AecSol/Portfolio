
package javaapplicationsort;
        import java.util.Arrays;
        import java.util.Random;
public class JavaApplicationSort {

    public static void main(String[] args) {
       
       // int[] m;  // int[] a[], b;   a двумерный массив
        
        int [] m = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = rnd.nextInt(10); // 0 - 9   
        }
        
         Arrays.sort(m);
         System.out.println(Arrays.toString(m));
    }
    
}
