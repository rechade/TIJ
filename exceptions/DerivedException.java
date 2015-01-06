// TIJ exceptions ex21 p344
class BaseException {
	BaseException() throws Exception {
		// make something needing disposal
		try {
			throw new Exception();
		} catch (Exception e) {
			// catch block if exceptions possible
			
			// can throw it up
			throw e;
		} finally {
			//dispose()
		}
	}
}

class DerivedException extends BaseException {
	DerivedException() throws Exception {
		// can't catch super() exceptions firstly - call wouldn't be first line
		// but main reason is if the base constructor fails, the derived object 
		// is uncreatable, can't continue the construction process so this object
		// isn't valid to continue either
	}
	public static void main (String[] args) {		
		try {
			//can catch them here 
			DerivedException de = new DerivedException();
		} catch (Exception e){
			System.out.println(e);
		}
		/*
		try {
			BaseException be = new BaseException();
		} catch (Exception e){
			System.out.println(e);
		}
		*/
	}
}