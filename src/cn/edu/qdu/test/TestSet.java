package cn.edu.qdu.test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
public static void main(String[] args) {
	//创建一个HashSet对象，存放学生姓名信息
	Set nameSet=new HashSet();
	nameSet.add("王云");
	nameSet.add("刘静涛");
	nameSet.add("南天华");
	nameSet.add("雷静");
	nameSet.add("王云");//增添已有的数据类型
	System.out.println("再次添加王云是否成功："+nameSet.add("王云"));
    System.out.println("显示集合 内容"+nameSet);
    System.out.println("从集合中删除南天华"+nameSet.remove("南天华"));
    System.out.println("集合 里是否包含南天华"+nameSet.contains("南天华"));
    System.out.println("集合中元素数量"+nameSet.size());
    System.out.println("清空集合");
    nameSet.clear();
    System.out.println("集合是否为空"+nameSet.isEmpty());
    
    
}
}
