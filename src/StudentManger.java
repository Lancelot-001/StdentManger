import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {

	public static void main(String[] args) {
		int x;
		ArrayList<Student> array = new ArrayList<Student>();
		do {
			System.out.println("----------------");
			System.out.println("欢迎进入学生管理系统");
			System.out.println("1.添加信息");
			System.out.println("2.查看信息");
			System.out.println("3.删除信息");
			System.out.println("4.修改信息");
			System.out.println("5.退出系统");
			System.out.println("请选择你想要的操作：");
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			switch (x) {
			case 1:
				addStudent(array);
				break;
			case 2:
				findStudent(array);
				break;
			case 3:
				deleteStudent(array);
				break;
			case 4:
				updateStudent(array);
				break;
			}
		} while (x != 5);

	}

	public static void addStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生学号：");
		String number= sc.nextLine();
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生地址：");
		String address = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		Student s = new Student();
		s.setName(name);
		s.setAddress(address);
		s.setAge(age);
		s.setNumber(number);
		array.add(s);

	}

	public static void findStudent(ArrayList<Student> array) {
		for(int i=0;i<array.size();i++) {
			Student s = array.get(i);
			System.out.println("学号\t姓名\t年龄\t地址");
			System.out.println(s.getNumber() +"\t"+s.getName() +"\t"+s.getAge()+"\t"+s.getAddress());
		}
		

	}

	public static void deleteStudent(ArrayList<Student> array) {
			System.out.println("请输入想要删除的学生学号");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			

	}

	public static void updateStudent(ArrayList<Student> array) {

	}
}
