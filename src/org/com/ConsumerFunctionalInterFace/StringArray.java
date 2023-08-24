package org.com.ConsumerFunctionalInterFace;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StringArray {
	public static void main(String[] args) {
		List<String> c = Arrays.asList("mani","manikanta","yuva","teja");
		c.forEach(i->System.out.println(i));
	}
}
