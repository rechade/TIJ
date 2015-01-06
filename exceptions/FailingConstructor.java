// TIJ exceptions ex22 p344
class DCException extends Exception {
}
class InnerException extends Exception {
}
class DisposableClass {
	DisposableClass(boolean fail) throws Exception {
		System.out.println("DisposableClass constructor");
		if (fail) {
			throw new DCException();
		}		
	}
	void dispose() {
		System.out.println("DisposableClass.dispose()");
	}
}

class FailingConstructor {
	
	DisposableClass dc1;
	DisposableClass dc2;
	
	FailingConstructor() throws DCException, InnerException, Exception {
		System.out.println("FailingClass constructor start");
		try {
			dc1 = new DisposableClass(false);
			try {
				dc2 = new DisposableClass(false);	
				try {
					// inner stuff
					
				} catch (Exception e) {
					
				} finally {
					dc2.dispose();
				}
			} catch (Exception e) {
				// dc2 fail
				e.fillInStackTrace();
				throw e;
			} finally {
				dc1.dispose();
			}
		} catch (Exception e) {
			// dc1 fail or inner fail
			e.fillInStackTrace();
			//System.out.println(e);
			//e.printStackTrace();
			throw e;		
		} finally {
			;
		}
		System.out.println("FailingClass constructor end");
	}
		
	void dispose() {
		System.out.println("FailingConstructor.dispose()");
	}
	
	public static void main (String[] args) throws Exception {
		try {
			System.out.println("asdf.make()"); 
			FailingConstructor fc = null;
			try {
				fc = new FailingConstructor();
			} catch (Exception e) {				
				//System.out.println(e);
				//e.printStackTrace();
				throw e;
			}  
			fc.dispose();
		} finally {
			System.out.println("asdf.cleanup()"); 
		}
	}	
}




/*
				try {
					// inner makes()
					// do some stuff
					// ...
					// whoopsie
					throw new InnerException();
				} catch (Exception e) {
					throw e; // inner exception
				} finally {
					// dispose of stuff in reverse
					// inner disposes (exceptions not possible)
					dc2.dispose();					
				}
				*/			