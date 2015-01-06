// TIJ innerclasses ex12 p254 (based on ex7 p249)
package innerclasses;
class Photo {
	private String image = "";
	private void output() {
		System.out.println("Photo.output() = " + image);
	}
	private AlterPhoto alterPhoto () {
		return new AlterPhoto() {
			public void changeImage(String s) {
				image = s;
			}
		};
	}
	public static void main (String[] args) {
		Photo p = new Photo();
		p.output();
		p.alterPhoto().changeImage("fwuffy kitten");
		p.output();
	}
}
interface AlterPhoto {
	void changeImage(String s);	
}