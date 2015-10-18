package command;

public class ConcreteCommand implements Command {

	private Receiver receiver;	//命令的真正的执行者
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		//命令真正执行前或后，执行相关的处理！
		receiver.action();
	}

}
