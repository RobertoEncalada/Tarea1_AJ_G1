module TAREA {
	requires transitive javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	

	opens application to javafx.graphics, javafx.fxml;

	
	
}
