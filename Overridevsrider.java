class A{
	int i,j;
	A(int i,int j){
	this.i=i;
	this.j=j;
	}



void show(){
	System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A{

	int k;
	B(int i,int j,int k){
	super(i,j);
	this.k=k;
}
void show(String msg){
	
	System.out.println("k and msg " + k + " " + msg);
	}
}

class Overridevsrider{
	public static void main(String args[]){
	B myb = new B(5,10,15);
	myb.show();
	myb.show("saikat");
	}
}
	
	


	