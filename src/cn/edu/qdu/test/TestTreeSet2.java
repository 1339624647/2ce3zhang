package cn.edu.qdu.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet2 {
	public static void main(String[] args) {
		Set stuTS = new TreeSet();
		stuTS.add(new Student("����", 3));
		stuTS.add(new Student("������", 2));
		stuTS.add(new Student("���컪", 3));
		stuTS.add(new Student("�׾�", 1));
		// ʹ�õ�����ѭ�����
		Iterator it = stuTS.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
