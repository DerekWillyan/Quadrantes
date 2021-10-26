package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField x;	
	@FXML
	private TextField y;
	@FXML
	private Button gerar;
	@FXML
	private Label resul;
	
	@FXML
	public void onbtnGerar() {
		
		int x = Integer.parseInt(this.x.getText());
		int y = Integer.parseInt(this.y.getText());
		
		if(x > 0 && y > 0) {
			
			this.resul.setText("primeiro");
			
		} 
		if(x > 0 && y < 0) {
			
			this.resul.setText("quarto");
			
		}
		if (x < 0 && y < 0) {
			
			this.resul.setText("terceiro");
			
		}
		if(x < 0 && y > 0) {
			
			this.resul.setText("segundo");
			
		}
		if(x == 0 || y == 0) {
			
			this.resul.setText("Error");
			
		}
		
	}
	
}
