package org.com.SupplierFunctionInterface;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

public class StringListGenerator {
	public static void main(String[] args) {
		Supplier<List<String>> list=(    )->{
			List<String> StringList=new ArrayList<>();
			StringList.add("sri");
			StringList.add("yuva");
			StringList.add("teja");
			StringList.add("manikanta");
			StringList.add("sai");
			return StringList;
		};
		System.out.println(list.get());
	}
}
