package cn.edu.qdu.test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
public static void main(String[] args) {
	//����һ��HashSet���󣬴��ѧ��������Ϣ
	Set nameSet=new HashSet();
	nameSet.add("����");
	nameSet.add("������");
	nameSet.add("���컪");
	nameSet.add("�׾�");
	nameSet.add("����");//�������е���������
	System.out.println("�ٴ���������Ƿ�ɹ���"+nameSet.add("����"));
    System.out.println("��ʾ���� ����"+nameSet);
    System.out.println("�Ӽ�����ɾ�����컪"+nameSet.remove("���컪"));
    System.out.println("���� ���Ƿ�������컪"+nameSet.contains("���컪"));
    System.out.println("������Ԫ������"+nameSet.size());
    System.out.println("��ռ���");
    nameSet.clear();
    System.out.println("�����Ƿ�Ϊ��"+nameSet.isEmpty());
    
    
}
}
