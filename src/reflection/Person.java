package reflection;

public class Person {
	private String name;
	public int age;
	static String desc = "我是中国人";
	
	public Person() {
		super();
		System.out.println("!!!");
	}

	private Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void info(){
		System.out.println("中国人");
	}
	
	public void show(String desc){
		System.out.println("我是：" + desc);
	}
	
	
	
	private int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getDesc() {
		return desc;
	}

	public static void setDesc(String desc) {
		Person.desc = desc;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
