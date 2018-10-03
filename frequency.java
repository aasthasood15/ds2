import java.util.*;
  public class Frequency{
    
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