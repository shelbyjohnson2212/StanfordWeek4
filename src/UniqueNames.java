import java.util.*;
import java.util.jar.Attributes.Name;

public class UniqueNames extends ConsoleProgram{

	public void run() {
		
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String name = readLine("Enter name: ");
			if(name.equals("")) break;
			if(!list.contains(name)){
				list.add(name);
			}
		}
		println("Unique name list contains: ");
		println(Names);
	
	public String readLine(String string){
		return string;
	}
	public void println(ArrayList<String> names){
		for(int i = 0; i < names.size(); i++) {
			println(names.get(i));
		}
	}
	private ArrayList<String>nameGenerator(){
		String name = "";
		ArrayList<String>Names = new ArrayList<String>();
		do {
			name = readLine("Enter name: ");
			if (!Name.contains(name)) {
				Names.add(name);
				
			}
		}while (!(name.equals("")));
		return Names;
	}
	
	}
		
