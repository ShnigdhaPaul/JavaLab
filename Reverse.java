
package reverse;


public class Reverse {

  
    public static void main(String[] args) {
        String input="Bangladesh";
        char[] original=input.toCharArray();
        int i;
                int j=0;
        j=original.length-1;
        for(i=0;i<j;i++,j--)
        {
         char temp=original[i]; 
            original[i] = original[j]; 
            original[j]=temp;
        }
        System.out.println(input);
       for(char c:original)
           System.out.print(c);
       System.out.println();
   
    }
    
}
