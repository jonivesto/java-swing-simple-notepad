import java.io.IOException;
import java.io.PrintWriter;

class Save {

void write() {
		
		try{
		    PrintWriter writer = new PrintWriter(Main.OUTPUT_FILE, "UTF-8");
		    writer.println(Gui.text.getText());
		    writer.close();
		    Gui.info.setText("Saved ("+Main.OUTPUT_FILE+")");
		    
		} catch (IOException ignored) {}
		
	}
}
