package com.lanou.code;

public class ArrayDemo1 {
	public static void main(String[] args) {
		/*
		 	数组:
		 		一组数据,可以实现对数据的统一管理
		 		在数据量大的时候,操作管理比较方便
		 	其实数组相当于一个容器.容器内部存放我们需要的数据
		 	
		 	1.如何声明数组
		 	2.如何对数组进行初始化
		 	3.如何赋值、取值
		 	4.下标越界问题
		 	5.如何对数组进行遍历
		 */
		//声明数组的语法格式
		/*
		 	数据类型[] 数组名
		 	数据类型 数组名[]
		 	建议采用第一种
		 */
		//数组声明时,给定的数据类型,一定要与赋值的数据,类型一致!!!
		//整形数组
		int[] nums;
		//浮点型数组
		double score[];
		//字符串数组
		String[] names;
		//
		Object[] objs;
		
		//对数组进行初始化,开辟空间
		/*
		 	初始化的语法格式:
		 	new 数据类型[数组容量]
		 	而 所谓的熔炉,就是内部存储数据的个数
		 	一定要在初始化时给定,否则开辟的大小无法确定!
		 	
		 	数组是一块连续的内存空间 
		 	数组名这个变量在栈区,引用的是new出来的真正的数组对象,在堆区
		 */
		nums = new int[6];
	}
}
