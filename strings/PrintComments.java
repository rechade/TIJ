// TIJ strings ex17 p386
package net.gusto.tij.strings;
import net.gusto.util.ProcessFiles;
import net.gusto.util.Strategy;
import net.gusto.util.TextFile;   
import java.io.*;
import java.util.regex.*;

class CommentsStrategy implements Strategy {
	public void process(File f) {
		Pattern p = Pattern.compile ("//.*");		
		//Pattern p = Pattern.compile ("^(?:[^\"]*?(?:\"[^\"]*?\"[^\"]*?)?)*",Pattern.MULTILINE);
		//Pattern p = Pattern.compile ("comment");
		//|(/\\*.*\\*/)+?)
		//Pattern p = Pattern.compile ("((//.*$)+?|(/\\u002A.*\\u002A/)+?)", Pattern.MULTILINE+Pattern.DOTALL);   
		// Pattern p = Pattern.compile ("^(?:[^\"]*?(?:\"[^\"]*?\"[^\"]*?)?)*");
		String fileContents = TextFile.read(f.getAbsolutePath());
		Matcher m = p.matcher(fileContents);		
		while (m.find()) {			
			System.out.println(m.group());
		}		
		System.out.println("==================================");
		p = Pattern.compile("(/\\*.*?\\*/)+?",Pattern.MULTILINE+Pattern.DOTALL);
		m = p.matcher(fileContents);
		while (m.find()) {
			System.out.println(m.group());
		}				
	}
}
class StringLiteralsStrategy implements Strategy {
	public void process (File f) {
		Pattern p = Pattern.compile ("(\".*\")+?");
		String fileContents = TextFile.read(f.getAbsolutePath());
		Matcher m = p.matcher(fileContents);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
class GrepStrategy implements Strategy {
	private String regex;	
	GrepStrategy(String s) {
		regex = s;
	}
	public void process (File f) {
		Pattern p = Pattern.compile (regex);
		String fileContents = TextFile.read(f.getAbsolutePath());
		Matcher m = p.matcher(fileContents);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
class ClassNamesStrategy implements Strategy {
	public void process (File f) {
		Pattern p = Pattern.compile ("(class(\\s)+)([a-z|A-Z]+)",Pattern.MULTILINE);
		String fileContents = TextFile.read(f.getAbsolutePath());
		Matcher m = p.matcher(fileContents);
		while (m.find()) {
			System.out.println("Class name = " + m.group(3));
		}
	}
}
class PrintClassNames {
	public static void main (String[] args) {
		if (args.length == 1) {
			File f = new File(args[0]);
			ClassNamesStrategy cns = new ClassNamesStrategy();
			ProcessFiles pf = new ProcessFiles(cns,f);
			pf.start();		
		} else {
			System.out.println("Usage: java strings.PrintClassNames filename");
		}
	}
}
class PrintStringLiterals {
	public static void main (String[] args) {
		if (args.length == 1) {
			File f = new File(args[0]);
			StringLiteralsStrategy cs = new StringLiteralsStrategy();
			ProcessFiles pf = new ProcessFiles(cs,f);
			pf.start();		
		} else {
			System.out.println("Usage: java strings.PrintStringLiterals filename");			
		}
	}
}
class PrintComments {
	public static void main (String[] args) {
		if (args.length == 1) {
			File f = new File(args[0]);
			CommentsStrategy cs = new CommentsStrategy();
			ProcessFiles pf = new ProcessFiles(cs,f);
			pf.start();		
		} else {
			System.out.println("Usage: java strings.PrintComments filename");			
		}
	}
}