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