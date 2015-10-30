package visitor;

public class VisitB implements Visitor {

	@Override
	public void visit(NodeA nodeA) {
		// TODO Auto-generated method stub
		System.out.println("***visitB***");
		nodeA.action();
	}

	@Override
	public void visit(NodeB nodeB) {
		// TODO Auto-generated method stub
		System.out.println("***visitB***");
		nodeB.action();
	}

}
