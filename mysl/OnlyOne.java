public class OnlyOne {
    	private static OnlyOne INSTANCE = null;

    	public static OnlyOne getInstance() {
       		if ( INSTANCE == null ) {
           	INSTANCE = new OnlyOne();
       		}
       	 	return INSTANCE;
    	}

    	private OnlyOne() {
    	}
	public static void main(String[] args) {
		getInstance();
	}
}