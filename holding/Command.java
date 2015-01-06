package holding;
import java.util.*;

class Command {
	String command;
	Command (String s) {
		command = s;
	}
	void operation() {
		System.out.println(command);
	}
}

class Commands {	
	static Queue<Command> generate() {
		Queue<Command> q = new LinkedList<Command>();
		for (int i=0; i<10; i++){
			q.offer(new Command("command "+i));
		}
		return q;
	}	
}

class ExecuteCommands {
	static void execute (Queue<Command> q) {
		Iterator<Command> it = q.iterator();
		while(it.hasNext()){
			it.next().operation();
		}		
	}
	public static void main(String[] args) {
		Queue<Command> commands = Commands.generate();
		execute(commands);
	}
}