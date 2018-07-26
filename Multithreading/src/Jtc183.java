class HelloThread extends Thread{
	public HelloThread(){
		super();
		start();
	}
	public HelloThread(String tname){
		super(tname);
		start();
	}
	HelloThread(ThreadGroup tg,String tname){
		super(tg,tname);
		start();
	}
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("#######################################");

			System.out.println(Thread.currentThread().getName() + " under the ThreadGroup of:" + 
					Thread.currentThread().getThreadGroup().getName());
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}
}
}
public class Jtc183 {

	public static void main(String[] args) {
		ThreadGroup tg=Thread.currentThread().getThreadGroup();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println(tg);
		System.out.println("+++++++++++++++++++++++++++++++++++");

		HelloThread th1=new HelloThread();
		HelloThread th2=new HelloThread("Jtc-1");
		HelloThread th3=new HelloThread(tg,"Jtc-2");
		/*for (int i = 0; i < 5; i++) {
			System.out.println("***************************************");
			System.out.println(Thread.currentThread().getName() + " under the ThreadGroup of:" + 
					Thread.currentThread().getThreadGroup().getName());
			System.out.println("***************************************");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}*/

	}

}
