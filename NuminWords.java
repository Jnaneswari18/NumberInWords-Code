
package numinwords;

public class NuminWords {

    public static void main(String[] args) {
      
        int n=1700,r;
        String str="";
        while(n>0)
        { 
          r=n%10;
          n=n/10;
          str=str+r;
        }
         System.out.println(str);
         char c;
         for(int i=str.length()-1;i>=0;i--)
         {
              c=str.charAt(i);
              switch(c)
              {
                  case '0':System.out.print("Zero ");
                           break;
                  case '1':System.out.print("ONE ");
                           break;
                  case '2':System.out.print("TWO ");
                           break;
                  case '3':System.out.print("THREE ");
                           break;
                  case '4':System.out.print("FOUR ");
                           break;
                  case '5':System.out.print("FIVE ");
                           break;
                  case '6':System.out.print("SIX ");
                           break;
                  case '7':System.out.print("SIVEN ");
                           break;
                  case '8':System.out.print("EIGHT ");
                           break;
                  case '9':System.out.print("NINE ");
                           break;
                  default:System.out.print("ERROR");
                           break;
              }
         }
         
            
         
         
    }
    
}
