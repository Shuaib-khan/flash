
public class Jtc181 {

	public static void main(String[] args) {
		Thread th1=new Thread();
		System.out.println(th1);
		System.out.println("*************************");
		String name=th1.getName();
		System.out.println("11111111111111111");
		System.out.println(name);
		System.out.println("*************************");

		int p=th1.getPriority();
		System.out.println(p);
		System.out.println("*************************");

		th1.setName("Jtc-th1");
		System.err.println(th1.getName());
		System.out.println("*************************");

		th1.setPriority(9);
		System.out.println(th1.getPriority());
		Thread th2=new Thread();
		System.out.println(th2);
		Thread th3=new Thread("Jtc");
		System.out.println(th3);
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " under the ThreadGroup of:" + 
					Thread.currentThread().getThreadGroup().getName());
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}
	}

}
