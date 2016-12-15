
public class Dea extends Thread {
public void run()
{
for(int x=0;x<5;x++)
	System.out.println(this.getName()+"."+x);
}
public void main(String args[])
{
	Dea d1=new Dea();
	Dea d2=new Dea();
      d1.setName("Deamon thread"); 

      d2.setName("Normal thread"); 
      d1.setDaemon(true);
      d1.setPriority(Thread.MIN_PRIORITY);
      d1.start();
      d2.start();
}
}
