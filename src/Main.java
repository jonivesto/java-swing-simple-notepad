public class Main {

	static final String FRAME_TITLE = "Pad";
	static final int FRAME_WIDTH = 750;
	static final int FRAME_HEIGHT = 600;
	static final int FONT_SIZE = 14;
	static final String OUTPUT_FILE = "SavedFile.txt";
	
	public static void main(String[] args) {
		Gui gui = new Gui();		
		gui.builder();
	}

}
