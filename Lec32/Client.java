package Lec32;

public class Client {
	
	public static void main(String [] args) {
//		P obj = new P();    // (1)first case inheritance 
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun2();
		
		 // (2)Second case inheritance
//		P obj = new C();   /// Second case inheritance
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
////	System.out.println(obj.d1);    // type casting this line
//		System.out.println(((C)(obj)).d1);
//		System.out.println(((C)(obj)).d);
//		obj.fun();   // run time wala chalega -C
//		obj.fun2();
//		((C)(obj)).fun1();  // type casting hua h
//		
//		 // (3)Third case inheritance
//		 C obj = new P(); 
		 
		// (4)Four case inheritance
		   C obj = new C(); 
		   System.out.println(obj.d);
		   System.out.println(obj.d1);
		   System.out.println(obj.d2);
		   System.out.println(((P)(obj)).d); // type casting this line
		   obj.fun();
		   obj.fun1();
		   obj.fun2();
	}

}
