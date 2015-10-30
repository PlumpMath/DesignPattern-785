package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * @author Administrator
 *
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();
	
	public void addObject(Object obj)
	{
		this.list.add(obj);
	}
	
	public void removeObject(Object obj)
	{
		this.list.remove(obj);
	}
	
	public List<Object> getList()
	{
		return list;
	}
	
	//获得迭代器
	public MyIterator createIterator()
	{
		return new ConcreteIterator();
	}
	
	
	//
	private class ConcreteIterator implements MyIterator
	{
		private int cursor;//定义游标用于记录遍历时的位置

		@Override
		public void first() {
			// TODO Auto-generated method stub
			cursor = 0;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			 if (cursor < list.size())
			 {
				 cursor++;
			 }
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (cursor < list.size())
			{
				return true;
			}
			
			return false;
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return 0 == cursor ? true : false;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return (list.size() - 1) == cursor ? true : false;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}
		
	}
}
