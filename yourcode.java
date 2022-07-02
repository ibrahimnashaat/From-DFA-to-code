import java.util.Scanner;


public class yourcode{
	 public static void main(String []args){
Scanner s = new Scanner (System.in);

System.out.println("Enter input token : ");
String token = s.next();int state = 1;int i =0;
 while(i<token.length()){
char ch = token.charAt(i);

	if(state ==1){
		if (ch == 'a'){state = 1; }
		if (ch == 'b'){state = 2; }
	}
	if(state ==2){
		if (ch == 'a'){state = 2; }
		if (ch == 'b'){state = 2; }
	}i +=1;
}
if(state == 2){
 System.out.println(true);
}else 
System.out.println(false);
}
}