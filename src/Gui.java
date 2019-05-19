import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class Gui{
	
	static JTextArea text = new JTextArea();
	static JLabel info = new JLabel();
	private Save save = new Save();

	void builder() {
		
		// Frame
		JFrame frame = new JFrame(Main.FRAME_TITLE);
		frame.setSize(Main.FRAME_WIDTH, Main.FRAME_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Menu
		JMenuBar menuBar = new JMenuBar();
		//menuBar.setBackground(Color.WHITE);
		//menuBar.setBorder(null);
		
	    JMenu fileMenu = new JMenu("File");
	    menuBar.add(fileMenu);

		@SuppressWarnings("serial")
		JMenuItem item = new JMenuItem(new AbstractAction("Save") {
			public void actionPerformed(ActionEvent e) {
		        save.write();
		    }
		});
	        
	    fileMenu.add(item);	
	    
	    // Font
	    Font font = new Font("Consolas", Font.PLAIN, Main.FONT_SIZE);
	    text.setFont(font);
	      
	    // Panel
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(info, BorderLayout.SOUTH);
		panel.add(text, BorderLayout.CENTER);	
		panel.add(menuBar, BorderLayout.NORTH);
		frame.add(panel);	

		// Show frame
		frame.setVisible(true);	
	}
	
}
