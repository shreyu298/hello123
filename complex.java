class complexadd{

int a1,b1,a2,b2,a3,b3;

complexadd()
{
a1= 2;
 b1= 3;
}

complexadd(int real,int img)
{
a2 = real;
b2 = img;
}

complexadd Add(complexadd C1, complexadd C2){

complexadd C3 = new complexadd();

C3.a3 = C1.a1 + C2.a2;
C3.b3= C1.b1+ C2.b2;
return C3;
}

}

class complex{

public static void main(String args[]){

complexadd C3 = new complexadd();
complexadd C1 = new complexadd();
complexadd C2 = new complexadd(4,5);

C3 = C3.Add(C1,C2) ;
System.out.println(C1.a1 + "+" + "i"+ C1.b1+ "+" + C2.a2 + "+"  + "i" + C2.b2+ "=" +C3.a3 + "+"+ "i"+C3.b3);

}
}