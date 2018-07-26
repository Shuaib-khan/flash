package com.anno;

import java.lang.annotation.Annotation;

@Author(aname="shuaib",age=28)
class Book{
	String name;
	int cost;
	public Book(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	void show_details(){
		System.out.println("Book Details");
		System.out.println(name);
		System.out.println(cost);
	}	
}
public class Test {

	public static void main(String[] args) {
		Book b=new Book("java",500);
		b.show_details();
		Class cls=b.getClass();
		Annotation an=cls.getAnnotation(Author.class);
		Author a=(Author)an;
		System.out.println("Book's Author Details");
		System.out.println("Author Name:"+a.aname());
		System.out.println("Author age:"+a.age());

	}

}
