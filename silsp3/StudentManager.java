package silsp3;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	MyArrayList<Student> students;
	StudentManager(){students = new MyArrayList<>();}
	
	void printStudent(){
		System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t\t��ȭ��ȣ\t\t\t���л�");
		int i=0;
		for(Student student : students){
			System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\t\t%s\n",++i,student.getName(),student.getHaknum(),student.getSex(),student.getAddr(),student.getPhone(),student.getIsbok());
		}
	}
	
	void printStudent(MyArrayList<Student> students) {
		System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t\t��ȭ��ȣ\t\t\t���л�");
		int i=0;
		for(Student student : students){
			System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\t\t%s\n",++i,student.getName(),student.getHaknum(),student.getSex(),student.getAddr(),student.getPhone(),student.getIsbok());
		}
	}
	
	String[] setStudent(){
		Scanner s = new Scanner(System.in);
        System.out.print("�л��̸�, �й�, ������ �Է��ϼ��� : ");
        String name = s.nextLine();
        System.out.print("�ּҸ� �Է��ϼ��� : ");
        String addr = s.nextLine();
        System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
        String phone = s.nextLine();
        System.out.print("���л��Դϱ�?(Y/N) ");
        String isbok = s.nextLine();
        return new String[]{name, addr, phone, isbok};
	}
	
	void start(){
		Scanner s;
		Scanner c = new Scanner(System.in);
		int stunum = 0;
		int a = 0;
		do{	
			String[] input;
            String[] name;
            MyArrayList<Student> found;
			System.out.println("-----------------------------------");
			System.out.println("1) �л���� 2) �������� 3) ���� 4) ����Ʈ 5) �̸��˻� 6)���л�����Ʈ 7) �ּҰ˻� 8) ���� ==>");
			a = new Scanner(System.in).nextInt();
			System.out.println("-----------------------------------");
			if(a==1){
				input = setStudent();
				name = input[0].split(" ");
				students.add(new Student(name[0],name[1],name[2],input[1],input[2],input[3]));
				stunum++;
				System.out.println(students);
			}
			else if(a == 2){
				
				System.out.println("---------------------------------");
				printStudent();
				System.out.println("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
				Student edit = students.get(new Scanner(System.in).nextInt() - 1);
				input = setStudent();
				name = input[0].split(" ");
				edit.setName(name[0]);
				edit.setHaknum(name[1]);
				edit.setSex(name[3]);
				edit.setAddr(input[1]);
				edit.setPhone(input[2]);
				edit.setIsbok(input[3]);
				System.out.println("�����Ǿ����ϴ�.");
			}
			else if(a==3){
				System.out.println("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
				int delnum = new Scanner(System.in).nextInt();
				students.remove(delnum-1);
				System.out.println("�����Ǿ����ϴ�.");
				
			}
			else if(a==4){
				System.out.println("---------------------------------");
				printStudent();
				System.out.println(students);
			}
			else if(a==5){
				System.out.println("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
				String searchname = c.nextLine();
				found = new MyArrayList<>();
				for(Student student : students){
					if(student.getName().equals(searchname)){
						System.out.println("�˻��Ǿ����ϴ�.");
						found.add(student);
					}
				}
			}
			else if(a==6){
				int boknum = 0;
				found = new MyArrayList<>();
				
				for(Student student : students){
					if(student.getIsbok().equals("Y")){
						boknum++;
						found.add(student);
					}
					if(!(found.size() == 0)){
						printStudent(found);
					}
				}
				System.out.println("���л���"+boknum+"�� �Դϴ�.");
			}
			else if(a==7){
				System.out.println("�˻��Ͻ� �ּҸ� �Է��ϼ��� : ");
				String searchaddr = c.nextLine();
				found = new MyArrayList<>();
				for(Student student : students){
					if(student.getAddr().equals(searchaddr)){
						System.out.println("�˻��Ǿ����ϴ�.");
						found.add(student);
					}
				}
				if(!(found.size() == 0)){
					printStudent(found);
				}
			}
		}while(a  != 8);
		System.out.println("����Ǿ����ϴ�.");
	}

}

class MyArrayList<E> extends ArrayList<E>{
	@Override
	public String toString(){return "�� " + size() + "���� ��ϵǾ����ϴ�.";}
}
