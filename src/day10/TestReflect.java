package day10;

import org.junit.Test;
import java.lang.reflect.*;

public class TestReflect {
	public void test() throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("day10.Person");
		Object obj = clazz.newInstance();
		Person p = (Person)obj;
		p.show();
	}
	
	public void test1() throws Exception{
		Class clazz = Class.forName("day10.Person");
		Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
		cons.setAccessible(true);
		Person p = (Person)cons.newInstance("Tom",20);
		System.out.println(p);
		System.out.println(p.age);
		System.out.println(p.name);
	}
	
	@Test
	public void test2() throws Exception{
		
		Class clazz = Class.forName("day10.Person");
		Object obj = clazz.newInstance();
		Person p = (Person)obj;
		
		Field f1 = clazz.getDeclaredField("name");
		f1.setAccessible(true);
		f1.set(p, "yaoyao");
		
		Field f2 = clazz.getDeclaredField("age");
		f2.setAccessible(true);
		f2.set(p, 18);
		//�൱�ڵ���getAge()����
		System.out.println(f2.get(p));
		System.out.println(p);
	}
	
	public void test3() throws Exception{
		Class clazz = Class.forName("day10.Person");
		Object obj = clazz.newInstance();
		Person p = (Person)obj;
		
		Method m1 = clazz.getDeclaredMethod("showName");
		String name = 
	
	}
}
