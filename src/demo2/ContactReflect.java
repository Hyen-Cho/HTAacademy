package demo2;

import java.lang.reflect.Method;

public class ContactReflect {
	public static void main(String[] args) throws Exception {
		
		Contact c = new Contact(10, "홍길동", "010-111-1111", "hong@gmail.com");
		
		Class<?> clazz = c.getClass();
		Method[] methods = clazz.getMethods();
		
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		
	}
}

// 클래스의 정보를 알 수 있다.
// 코드 기억하지 않아도됨...