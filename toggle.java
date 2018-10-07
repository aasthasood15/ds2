import java.util.*;
  public class Frequency{
1.    
   public static char frequency(String str){
           char a[] = str.toCharArray();
           int i= 0,max = 0,pos = 0;
           while(i<str.length()){
                       int j = 0;
                       int count =0;
                      while(j<str.length()){
                          if(a[i] == a[j])
                            count ++;
                            j++;
			}
                  if(count>max){
                         max = count;
                         pos = i;
                        }
                  i++;
		}
           return a[pos];
	}

     public static void main(String[] x){
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       System.out.println("Character with highest frequency"+frequency(str));
		}
	}

/////////////////////////////////////////////////////////////////////////////
2.
import java.util.*;
 public class Reverse{

 public static boolean reverse(String str){
           char x[] = str.toCharArray();
           int i=0;
    int flag=0;
  while(i<str.length()){
    while(str.charAt(i)==' '){
      i++;
    }
    if(i>=str.length()){
      break;
    }
    int j=i;
    while(i<str.length() && str.charAt(i)!=' '){
      i++;
    }
    int k=i-1;
    while(j<k){
      if(str.charAt(j)!=str.charAt(k)){
        flag=1;
        break;
      }
      j++;
      k--;
    }
  }
if(flag == 1)
  return false;
else
 return true;
}
 
   public static void main(String[] x){
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       System.out.println(reverse(str));
		}
	}
///////////////////////////////////////////////////////////////////////
3.

import java.util.HashSet;
 
public class Subsequence {
     
    // set to store all the subsequences
    static HashSet<String> st = new HashSet<>();
    static void subsequence(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                String sub_str = str.substring(i, j);
             
                if (!st.contains(sub_str))
                    st.add(sub_str);
                for (int k = 1; k < sub_str.length() - 1; k++) {
                    StringBuffer sb = new StringBuffer(sub_str);
                    sb.deleteCharAt(k);
                    if (!st.contains(sb))
                        ;
                    subsequence(sb.toString());
                }
            }
        }
    }
    public static void main(String[] args)
    {
        String s = "aabc";
        subsequence(s);
        System.out.println(st);
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////
4.
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