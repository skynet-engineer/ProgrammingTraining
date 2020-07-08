package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflect {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	//调用指定的方法
	@Test
	public void test4() throws Exception{
		Class clazz = Class.forName("reflection.Person");
		Object obj = clazz.newInstance();
		Person p = (Person)obj;
		
		//调用非public的方法
		Method m1 = clazz.getDeclaredMethod("getAge");
		m1.setAccessible(true);
		int age = (Integer)m1.invoke(p);
		System.out.println(age);
		
		//调用public的方法
		Method m2 = clazz.getMethod("show", String.class);
		//p.show("守法公民")
		Object returnVal = m2.invoke(p,"守法公民");
		System.out.println(returnVal);
		//调用static的方法
		Method m3 = clazz.getDeclaredMethod("info");
		m3.setAccessible(true);
//		m3.invoke(Person.class);
//		m3.invoke(p);
		m3.invoke(null);
	}
	
	//@Test
	public void test3() throws Exception{
		Class clazz = Class.forName("reflection.Person");
		
		//实例化一个Person对象，名字是p
		Object obj = clazz.newInstance();
		Person p = (Person)obj;
		
		//调用非public的属性
		//getDeclaredField(name)方法的参数是属性名字
		Field f1 = clazz.getDeclaredField("name");
		f1.setAccessible(true);
		
		//给对象p的name属性赋值，相当于p.setName("张三")
		f1.set(p, "张三");
		
		//调用public的属性
		Field f2 = clazz.getField("age");
		f2.set(p, 18);
		//f2.get(p)，相当于调用p.age
		System.out.println(f2.get(p));
		
		System.out.println(p);
		//调用static的属性
		Field f3 = clazz.getDeclaredField("desc");
		//f3.get(null)相当于调用了Person.Desc
		System.out.println(f3.get(null));
		System.out.println(f3.get(p));
	}
	
	
	
	
	
	
	//调用指定的构造器创建运行时类的对象
	//@Test
	public void test2() throws Exception{
		Class clazz = Person.class;
		Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
		cons.setAccessible(true);
		Person p = (Person)cons.newInstance("Tom",20);//实例化person的对象
		System.out.println(p);
	}
		
	//获取运行时类的对象：方法一
	//@Test
	public void test1() throws Exception{
		Class clazz = Class.forName("reflection.Person");
//		Class clazz2 = Person.class;
		Object obj = clazz.newInstance();
		//Person p = new Person();
		
		Person p = (Person)obj;
		System.out.println(p);
	}
	

}
