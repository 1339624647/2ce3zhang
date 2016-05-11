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
		return "学号为：" + stuNum + "的学生，姓名为：" + stuName + "]";
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
		//若学号相同，则按照String自然排序比较学生姓名
		if(res==0){
			res=stuName.compareTo(input.stuName);
		}
		return res;
	}

}
