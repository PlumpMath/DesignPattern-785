package iterator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");
		
		MyIterator iter = cma.createIterator();
		while ( iter.hasNext())
		{
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}

}
