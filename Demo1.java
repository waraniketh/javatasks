package tasks1;
public class Demo1 extends Demo2 {
	int s=100,k=200,m=0;
public int add()
{
int u=super.add();int k=super.l;
m=s+k;System.out.println(u +" "+k);
return(m);
}
public static void main(String[] args) {
Demo1 m=new Demo1();
int w=m.add();
System.out.println(w);
	}

}
