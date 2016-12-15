package tasks1;
public class Sceondquestion {

public static void main(String[] args) {
	int i=0;
    int d[]=new int[200];int sum=0;
    for(int y=0;y<1000;y++)
    {	
    if(y%2!=0&&y%3!=0&&y%5!=0&&y%7!=0&&y%11!=0&&y%13!=0&&y%17!=0){
    d[i]=y;System.out.println(y);
    i++;}
    }
    for(int j=0;j<i;j++)
    {
    sum=sum+d[j];	
    }System.out.print(sum);
}
}
