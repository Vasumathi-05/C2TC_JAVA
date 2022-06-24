
public class Operation {
	int data=50; //local variable > instance variable
	void change(int data)
	{
		data=data+100;
	}

	public static void main(String[] args) {
	Operation op=new Operation();
	System.out.println("Before change "+op.data);
	op.change(500);
	System.out.println("Aefore change "+op.data);
	}

}
