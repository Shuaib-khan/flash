package com.jtc.anno;

import java.lang.annotation.Inherited;

@Author(aname="shuaib",age=28)
class Hai{
		@Deprecated
	void m1(){}
}
class A extends Hai{
	@Override
	void m1(){}
}

public class Test5 {
	
		public static void main(String[] args) {
			try{
			Class cls=Class.forName("com.jtc.anno.A");
			boolean b=cls.isAnnotationPresent(com.jtc.anno.Author.class);
			System.out.println(b);
			if(b){
				Author a=(Author)cls.getAnnotation(Author.class);
				System.out.println(a.aname()+"\t"+a.age());
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}

