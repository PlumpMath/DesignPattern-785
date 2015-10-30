package visitor;

public class NodeA implements Node {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub

	}
	public void action(){
        System.out.println("NodeA visited");
    }
}
