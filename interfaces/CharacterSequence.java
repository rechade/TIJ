// TIJ interfaces, ex.16 p235
package interfaces;
import java.util.Random;          
import java.nio.*;

class CharacterSequence implements Readable {
	private Random r = new Random(47);
	private int sequenceLength;
	private static final char[] chars = 
 "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
 	
 CharacterSequence(int i) {
 		sequenceLength = i;
 }
 	
	public int read(CharBuffer cb) {		
		for (int i = 0; i<sequenceLength; i++) {
			cb.append(chars[r.nextInt(chars.length)]);
		}		
		cb.append(" ");
		return cb.length();
	}     
	public char nextChar() {
		return (chars[r.nextInt(chars.length)]);		
	}	
}