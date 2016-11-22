package silsp5;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

class Friend{
	String name;
	String telnum;
	String add;
	
	public Friend(String a, String b, String c){
		this.name = a;
		this.telnum = b;
		this.add = c;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelnum() {
		return telnum;
	}
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
}

public class test1 {
	ArrayList<Friend> Friend_list;
	public test1(){
		Friend_list = new ArrayList<Friend>();
	}
	
	void addF(){
		Scanner s = new Scanner(System.in);
		System.out.println("이름=>");
		String name = s.nextLine();
		System.out.println("전화번호=>");
		String telnum = s.nextLine();
		System.out.println("주소=>");
		String add = s.nextLine();
		Friend f = new Friend(name,telnum,add);
		Friend_list.add(f);
	}
	
	void listF(){
		for(Friend f : Friend_list){
			System.out.printf("%s\t%s\t%s\t",f.getName(),f.getTelnum(),f.getAdd());
		}
	}
	
	void writeF(){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter("CopyFile.txt",false);
			bw = new BufferedWriter(fw);
			for(Friend f : Friend_list){
				String name = f.getName(); String telnum = f.telnum; String add = f.getAdd();
				bw.write(name+telnum+add);
				bw.write("\n");
				bw.newLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(bw != null) try{bw.close();}catch(IOException e){}
			if(fw != null) try{fw.close();}catch(IOException e){}
		}
	}
	
	void start(){
		Scanner s = new Scanner(System.in);
		int menu;
		boolean go=true;
		while(go)
		{
			System.out.println("\n===============================================================");
			System.out.println("1.친구등록, 2.전체보기, 3.데이터저장, 4.종료");
			System.out.print("메뉴선택 : ");
			menu = s.nextInt();
			switch (menu)
			{
			case 1 : 
				addF();	
				break;
			case 2 :
				listF();
				break;
			case 3 :
				writeF();
				break;
			case 4 :
				go=false;
				break;
			}
		}
	}
	public static void main(String[] args){
		test1 t = new test1();
		t.start();
	}
}
