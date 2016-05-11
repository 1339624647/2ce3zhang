package cn.edu.qdu.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet2 {
	public static void main(String[] args) {
		Set stuTS = new TreeSet();
		stuTS.add(new Student("王云", 3));
		stuTS.add(new Student("刘静涛", 2));
		stuTS.add(new Student("南天华", 3));
		stuTS.add(new Student("雷静", 1));
		// 使用迭代器循环输出
		Iterator it = stuTS.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
