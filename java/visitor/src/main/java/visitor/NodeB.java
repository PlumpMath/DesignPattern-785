package visitor;

public class NodeB implements Node {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub

	}
	public void action(){
        System.out.println("NodeB visited");
    }
}
