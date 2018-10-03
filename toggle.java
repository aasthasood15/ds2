import java.util.*;
 public class Toggle{

    public static String toggle(String str){
          char a[] = str.toCharArray();
          int i=0;
          while(i<str.length()){
                    if(a[i]>='a' && a[i]<='z'){
                                 a[i] = (char)(a[i]-32);
					i++;}
                    else{
                                 a[i] = (char)(a[i]+32);
				 i++;
                             }
		}
          String s = new String(a);
          return s;
	}	

     public static void main(String[] x){
       Scanner sc= new Scanner(System.in);
       String str = sc.next();
      System.out.println(toggle(str));
	  }
	}