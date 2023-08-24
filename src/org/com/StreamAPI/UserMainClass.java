package org.com.StreamAPI;

import java.util.stream.Stream;

public class UserMainClass {
	public static void main(String[] args) {
		UserClass user1=new UserClass("maniakanta",25);
		UserClass user2=new UserClass("mani", 24);
		UserClass user3=new UserClass("yuva", 25);
		UserClass user4=new UserClass("sri", 23);
		UserClass user5=new UserClass("teja", 24);
		UserClass user6=new UserClass("uma", 25);
		UserClass user7=new UserClass("mouni",22);
		
		Stream<UserClass> stream = Stream.of(user1,user2,user3,user4,user5,user6,user7);
		
		stream.filter(i->i.age >= 18).filter(i->i.name.startsWith("m")).forEach(i->System.out.println(i));
		
		
	}
}
