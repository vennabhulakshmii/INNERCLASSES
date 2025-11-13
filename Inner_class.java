import java.util.Scanner;
abstract class ab{
	static Scanner sc=new Scanner(System.in);
	ab(int a){
		System.out.println(a);
	}
	public abstract int m1(float b);
	public abstract long m2(char ch);
	byte m3(double d){
		System.out.print(d);
		return sc.nextByte();
	}
	interface I1{
		public abstract int m4(double d);
		static int m5(short s){
			System.out.print(s);
			return sc.nextInt();
		}
	interface I2{
		public abstract long m6(String s);
		public abstract int m7(boolean b);
		
		}
	}
}
class Test{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
	
	//ANONYMOUS FUNCTION
	ab a1=new ab(sc.nextInt()){
	  public  int m1(float b){
		System.out.println(b);
		return sc.nextInt();
	}
	 public  long m2(char ch){
		System.out.println(ch);
		return sc.nextLong();
	}
	};
	System.out.println(a1.m1(sc.nextFloat()));
	System.out.println(a1.m2(sc.next().charAt(0)));
	System.out.println(a1.m3(sc.nextDouble()));

	//Lamda Function
	ab.I1 i=d->{
		
			System.out.println(d);
			return sc.nextInt();
	};
	System.out.println(i.m4(sc.nextDouble()));
	System.out.println(ab.I1.m5(sc.nextShort()));
	
	//ANONYMOUS FUNCTION
	ab.I1.I2 i2=new ab.I1.I2(){
	 public  long m6(String s){
		System.out.print(s);
		return sc.nextLong();
	}
	public  int m7(boolean b){
		System.out.print(b);
		return sc.nextInt();
	}
			
     };
	System.out.println(i2.m6(sc.next()));
	System.out.println(i2.m7(sc.nextBoolean()));
}
	

}