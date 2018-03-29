package test;

import ch.ntb.inf.deep.unsafe.US;

public class targetCMD {
	public static int a;
	public static int f0=0x3f8ccccd;	//1.1f
	public static int f1=0x400ccccd;	//2.2f
	public static int f2;
//	public static double d0;
	
	public static void inc() {
		a++;
	}
	
	public static void talk() {
		System.out.println("I'm talking.");
	}
	
//	public static void fMul() {
////		f1 = (float) 1.1f;
////		f2 = (float) 2.2f;
////		d0 = 3.3;
//		
//		f0 = f1 * f2;
//		
//		System.out.println(f0);
//		System.out.println((int)f1);
//		System.out.println((int)f2);
//		//System.out.println((int)d0);
//		System.out.println("fMul executed");
//	}


	public static void initVFP() {
//		// save state
//		//  PC??
//		int r0Value = US.GETGPR(0);
//		
//		// enable VFP (FPU)
//		//   allow access in secure and non-secure mode
//		US.ASM("mrc p15, 0, r0, c1, c1, 2");
//		US.ASM("orr r0, r0, 0xC00");	// [11:10]
//		US.ASM("mcr p15, 0, r0, c1, c1, 2");
//		
//		//   enable access coprocessor CPACR[23:20] -> CP10 and CP11
//		US.ASM("mrc p15, 0, r0, c1, c0, 2");
//		US.ASM("orr r0, r0, 0x00f00000");
//		// US.ASM("ldr r0, 0x00f00000");	// ??? was bedeutet das? Sind die oberen zeilen nicht besser?
//		US.ASM("mcr p15, 0, r0, c1, c0, 2");
//		
//		//   enable FPU in FPEXC (Floating Point Exception Register)
//		
//		// restore state
//		US.PUTGPR(0, r0Value);
	}
	
	
	public static void mulFloat() {
		
//		US.PUTGPR(0, f0);
//		US.ASM("VMOV S0, R0");
//		US.PUTGPR(0, f1);
//		US.ASM("VMOV S1, R0");
//		
////		
//		US.ASM("VMUL.F32 S2, S0, S1");
//		US.ASM("VMOV R4, S2");
//	
//		f2 = US.GETGPR(4);
//		System.out.print("f0 * f1 = f2 = ");
//		System.out.printHex(f2);
//		System.out.println();
	}
	
	public static void getResult() { 
	
		US.ASM("vmov R7, r8, d0");
		System.out.println("vmov R7, r8, d0");
//		f2 = US.GETGPR(0);
//		System.out.printHex(f2);
//		System.out.println();
		
	}
	
	public static void getResult2() { 
	
		US.ASM("vmov R0, r1, d0");
		System.out.println("vmov R0, r1, d0");
//		f2 = US.GETGPR(0);
//		System.out.printHex(f2);
//		System.out.println();
		
	}
}
