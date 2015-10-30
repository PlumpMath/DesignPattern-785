package visitor;

public class VisitA implements Visitor {

	@Override
	public void visit(NodeA nodeA) {
		// TODO Auto-generated method stub
		 System.out.println("***visitA***");
	        nodeA.action();
	}

	@Override
	public void visit(NodeB nodeB) {
		// TODO Auto-generated method stub
		System.out.println("***visitA***");
        nodeB.action();
	}

}
