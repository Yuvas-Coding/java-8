package org.com.SupplierFunctionInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierFunctionDemo implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}
	
}


public class SupplierDemo {
	public static void main(String[] args) {
	SupplierFunctionDemo sfd=new SupplierFunctionDemo();
	System.out.println(sfd.get());
	
	System.out.println("by using lambda expressions.....");
	Supplier<LocalDateTime> supplier=()->LocalDateTime.now();
	System.out.println(supplier.get());
	}
}
