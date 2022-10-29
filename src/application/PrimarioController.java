package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.scene.layout.Pane;

public class PrimarioController implements Initializable {
	@FXML
	private Pane fondo;
	@FXML
	private Button botonRojo;
	@FXML
	private Button botonAmarillo;
	@FXML
	private Button botonVerde;
	@FXML
	private Button botonAzar;
	
	private Parent root;
	
	private void cambiarArojo(Parent root) {}
	private void cambiarAamarillo(Parent root) {}
	private void cambiarAverde(Parent root) {}
	private void cambiarAazar(Parent root, boolean b) {}
	Boolean keepMixing = false;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		botonRojo.setOnAction(eh -> {
            Node source = (Node) eh.getSource();
            this.root = (Parent) source.getScene().getRoot();
            cambiarArojo(root);
        });
		
		botonAmarillo.setOnAction(eh -> {
            Node source = (Node) eh.getSource();
            this.root = (Parent) source.getScene().getRoot();
            cambiarAamarillo(root);
        });
		
		botonVerde.setOnAction(eh -> {
            Node source = (Node) eh.getSource();
            this.root = (Parent) source.getScene().getRoot();
            cambiarAverde(root);
        });
		
		botonAzar.setOnAction(eh -> {
            Node source = (Node) eh.getSource();
            this.root = (Parent) source.getScene().getRoot();
            cambiarAazar(root, keepMixing);
        });
	}

	
}
