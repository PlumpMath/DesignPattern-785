package adapter;

public class Client {
	
	public void test1(ITarget t){
		t.handleReq();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		Adaptee adaptee = new Adaptee();
		ITarget target = new Adapter2(adaptee);
		client.test1(target);
	}

}
