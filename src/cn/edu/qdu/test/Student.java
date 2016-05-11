package cn.edu.qdu.test;

public class Student implements Comparable {
	int stuNum = -1;
    String stuName="";
    public Student(String name,int num) {
    	this.stuNum = num;
    	this.stuName = name;
	}
	@Override
	public String toString() {
		return "ѧ��Ϊ��" + stuNum + "��ѧ��������Ϊ��" + stuName + "]";
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public int compareTo(Object o) {
		Student input=(Student)o;
		int res=stuNum>input.stuNum?1:(stuNum==input.stuNum?0:-1);
		//��ѧ����ͬ������String��Ȼ����Ƚ�ѧ������
		if(res==0){
			res=stuName.compareTo(input.stuName);
		}
		return res;
	}

}
