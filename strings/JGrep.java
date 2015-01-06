//: strings/JGrep.java
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}
package strings;
import java.io.*;
import java.util.regex.*;
import util.*;

public class JGrep {
	public static class GrepStrategy implements util.Strategy {
		Pattern p;
		Matcher m;
		GrepStrategy () {}
		GrepStrategy (Pattern pattern, Matcher matcher) {
			p = pattern;
			m = matcher;
		}
		public void process (File f) throws IOException {
			int index=0;
			for(String line : new TextFile(f.getAbsolutePath())) {	
				index++;
				m.reset(line);
				while(m.find()) {
					System.out.format( "%12.12s line "+index + ": " +	m.group() + ": " + m.start() +"\n", f.getName());
				}
			}			
		}
	}
	
	static int getFlags(String[] args) {
		int flagCount = args.length-2;		
		int combinedFlags = 0;
		for (int i=2; i<flagCount+2; i++) {
			switch (args[i]) {
				case "CANON_EQ": combinedFlags |= Pattern.CANON_EQ; 
					break;                
				case "CASE_INSENSITIVE": combinedFlags |= Pattern.CASE_INSENSITIVE; 
					break;          
				case "COMMENTS": combinedFlags |= Pattern.COMMENTS; 
					break;          
				case "DOTALL": combinedFlags |= Pattern.DOTALL; 
					break;  
				case "LITERAL": combinedFlags |= Pattern.LITERAL; 
					break;  
				case "MULTILINE": combinedFlags |= Pattern.MULTILINE; 
					break;  
				case "UNICODE_CASE": combinedFlags |= Pattern.UNICODE_CASE; 
					break;  
				case "UNICODE_CHARACTER_CLASS": combinedFlags |= Pattern.UNICODE_CHARACTER_CLASS; 
					break;  
				case "UNIX_LINES": combinedFlags |= Pattern.UNIX_LINES; 
					break;
			}
		}
		return combinedFlags;
	}		
	
	public static void main(String[] args) throws Exception {
		
		if(args.length < 2) {
			System.out.println("Usage: java JGrep file regex [flags]");
			System.exit(0);
		}		
		Pattern p = Pattern.compile(args[1],getFlags(args));		
		
		// Pass use Strategy design pattern with ProcessFiles to use a processor 
		// on the input directory / file:
		Matcher m = p.matcher("");	
		File f = new File(args[0]);		
		GrepStrategy gs = new GrepStrategy(p,m);
		ProcessFiles pf = new ProcessFiles(gs,f);
		pf.start();
	}
}