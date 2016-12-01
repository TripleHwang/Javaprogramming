package Thread;

class SharedPrinter{
	synchronized void print(int text){
		//Thread.yield();
		System.out.print(text);
		System.out.println();
	}
}

class WorkerThread extends Thread{
	SharedPrinter p;
	int [] text;
	WorkerThread(SharedPrinter p, int[] text){
		this.p = p; this.text = text;
	}
	
	public void run(){
		for(int i = 0; i<text.length;i++){
			p.print(text[i]);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){return;}
		}
	}
}

public class SyncronizedEX {
	public static void main(String[] args){
		SharedPrinter p = new SharedPrinter();
		int [] ex1 = {1,2,3,4,5,6,7,8};
		int [] ex2 = {10,20,30,40,50};
		int [] ex3 = {100,200,300};
		
		String [] korText = {"가나다라", "마바사아", "자차카","타파하"};
		Thread th1 = new WorkerThread(p, ex1);
		Thread th2 = new WorkerThread(p, ex2);
		Thread th3 = new WorkerThread(p, ex3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
