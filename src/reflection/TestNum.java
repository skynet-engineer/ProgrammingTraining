package reflection;

public class TestNum {

	public static void main(String[] args) {
	// 获取所有的枚举对象，返回的是数组
		
	Season[] values = Season.values();
	
	for (Season season : values) {
		System.out.println(season.getName() + " : " + season.getDesc());
	
	}
	

	}

}
