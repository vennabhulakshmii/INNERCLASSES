class Outer{
	 int outerVar = 100; 
	public void show(){
		System.out.println("show");
	}
	class nonStaticInner{
		public void display(){
			System.out.println("dispaly non static method");
		}
	}
	static class  Inner{
		public void play(){
			System.out.println("play chess");
		}
	}
	void localvar(){
		int localVar = 50;
		class LocalInner{
			void print() {
                          System.out.println("Inside Local Inner Class");
                          System.out.println("Outer variable = " + outerVar);
                          System.out.println("Local variable = " + localVar);
                         }
		}
		LocalInner l=new LocalInner();
		l.print();
	}
	
}
class Test{
	public static void main(String[] args){
		Outer o=new Outer();
		o.show();

		Outer.nonStaticInner n=o.new nonStaticInner();
		n.display();

		Outer.Inner I=new Outer.Inner();
		I.play();

		o.localvar();
	}
}
