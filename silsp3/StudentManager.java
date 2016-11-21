package silsp3;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	MyArrayList<Student> students;
	StudentManager(){students = new MyArrayList<>();}
	
	void printStudent(){
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t\t전화번호\t\t\t복학생");
		int i=0;
		for(Student student : students){
			System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\t\t%s\n",++i,student.getName(),student.getHaknum(),student.getSex(),student.getAddr(),student.getPhone(),student.getIsbok());
		}
	}
	
	void printStudent(MyArrayList<Student> students) {
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t\t전화번호\t\t\t복학생");
		int i=0;
		for(Student student : students){
			System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\t\t%s\n",++i,student.getName(),student.getHaknum(),student.getSex(),student.getAddr(),student.getPhone(),student.getIsbok());
		}
	}
	
	String[] setStudent(){
		Scanner s = new Scanner(System.in);
        System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
        String name = s.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String addr = s.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        String phone = s.nextLine();
        System.out.print("복학생입니까?(Y/N) ");
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
			System.out.println("1) 학생등록 2) 정보수정 3) 삭제 4) 리스트 5) 이름검색 6)복학생리스트 7) 주소검색 8) 종료 ==>");
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
				System.out.println("==> 수정하실 번호를 입력하세요 : ");
				Student edit = students.get(new Scanner(System.in).nextInt() - 1);
				input = setStudent();
				name = input[0].split(" ");
				edit.setName(name[0]);
				edit.setHaknum(name[1]);
				edit.setSex(name[3]);
				edit.setAddr(input[1]);
				edit.setPhone(input[2]);
				edit.setIsbok(input[3]);
				System.out.println("수정되었습니다.");
			}
			else if(a==3){
				System.out.println("==> 삭제하실 번호를 입력하세요 : ");
				int delnum = new Scanner(System.in).nextInt();
				students.remove(delnum-1);
				System.out.println("삭제되었습니다.");
				
			}
			else if(a==4){
				System.out.println("---------------------------------");
				printStudent();
				System.out.println(students);
			}
			else if(a==5){
				System.out.println("검색하실 이름을 입력하세요 : ");
				String searchname = c.nextLine();
				found = new MyArrayList<>();
				for(Student student : students){
					if(student.getName().equals(searchname)){
						System.out.println("검색되었습니다.");
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
				System.out.println("복학생은"+boknum+"명 입니다.");
			}
			else if(a==7){
				System.out.println("검색하실 주소를 입력하세요 : ");
				String searchaddr = c.nextLine();
				found = new MyArrayList<>();
				for(Student student : students){
					if(student.getAddr().equals(searchaddr)){
						System.out.println("검색되었습니다.");
						found.add(student);
					}
				}
				if(!(found.size() == 0)){
					printStudent(found);
				}
			}
		}while(a  != 8);
		System.out.println("종료되었습니다.");
	}

}

class MyArrayList<E> extends ArrayList<E>{
	@Override
	public String toString(){return "총 " + size() + "명이 등록되었습니다.";}
}
