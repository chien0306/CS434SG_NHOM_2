import java.util.Scanner;


public class Caculator {
	boolean kiemtranguyento(int n){
		  for(int i =2; i<=Math.sqrt(n);i++){
		   if(n%i == 0){
		    return false;
		   }
		  }
		  return true;
		 }
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		  System.out.printf("Nhap vao so nguyen duong \n");
		  int n = s.nextInt();
		  Caculator snt = new Caculator();
		  if(snt.kiemtranguyento(n)){
		   System.out.printf("So " +n +" la so nguyen to");
		  }else{
		   System.out.printf("So " +n +"  khong phai la so nguyen to");
		  }
	}
}
