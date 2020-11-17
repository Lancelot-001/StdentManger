import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {

	public static void main(String[] args) {
		int x;
		ArrayList<Student> array = new ArrayList<Student>();
		do {
			System.out.println("----------------");
			System.out.println("��ӭ����ѧ������ϵͳ");
			System.out.println("1.�����Ϣ");
			System.out.println("2.�鿴��Ϣ");
			System.out.println("3.ɾ����Ϣ");
			System.out.println("4.�޸���Ϣ");
			System.out.println("5.�˳�ϵͳ");
			System.out.println("��ѡ������Ҫ�Ĳ�����");
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
		System.out.println("������ѧ��ѧ�ţ�");
		String number = sc.nextLine();
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ����ַ��");
		String address = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		Student s = new Student();
		s.setName(name);
		s.setAddress(address);
		s.setAge(age);
		s.setNumber(number);
		array.add(s);

	}

	public static void findStudent(ArrayList<Student> array) {
		System.out.println("ѧ��\t����\t����\t��ַ");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);

			System.out.println(s.getNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}

	}

	public static void deleteStudent(ArrayList<Student> array) {
		System.out.println("��������Ҫɾ����ѧ��ѧ��");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getNumber().equals(number)) {
				array.remove(i);
				break;
			}
		}
		System.out.println("ɾ���ɹ�");

	}

	public static void updateStudent(ArrayList<Student> array) {
		System.out.println("��������Ҫ�޸ĵ�ѧ��");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		System.out.println("����������");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		System.out.println("�����ַ��");
		Scanner sc11 = new Scanner(System.in);
		String address = sc11.nextLine();
		System.out.println("�������䣺");
		Scanner sc111 = new Scanner(System.in);
		String age = sc111.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getNumber().equals(number)) {
				s.setName(name);
				s.setAddress(address);
				s.setAge(age);
			}
		}

	}
}
