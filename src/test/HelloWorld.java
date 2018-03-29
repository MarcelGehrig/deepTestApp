package test;
import java.io.PrintStream;
//import ch.ntb.inf.deep.runtime.mpc555.driver.SCI;
import ch.ntb.inf.deep.runtime.zynq7000.driver.UART1;
 

public class HelloWorld {
//	public static int testInt = 0;
	public static float f00;
	
	
	static {
		
		// 1.) Initialize UART1
		int baudRate = 9600;
//		int baudRate = 115200;
		short parity = 0;
		short data = 8;
		UART1.start(baudRate, parity, data);
		
		// 2) Use UART1 for stdout
		System.out = new PrintStream(UART1.out);
 
		// 3) Say hello to the world
		System.out.println();
		System.out.println("Hello, world!");
		targetCMD tCMD = new targetCMD();
//		f00 = 0.0f;
//		System.out.println(f00);
//		targetCMD.f1 = 1.1f;
//		targetCMD.fMul();
//		System.out.println("HelloWorld done2");
	}
}