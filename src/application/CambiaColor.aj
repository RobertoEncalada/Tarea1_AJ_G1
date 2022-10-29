package application;

import javafx.scene.Parent;

public aspect CambiaColor {
	pointcut successRojo(): call(* *Arojo(..));

	after(): successRojo(){
		Object[] parameterList = thisJoinPoint.getArgs();
		Parent root = (Parent) parameterList[0];
		root.setStyle("-fx-background-color: red");
		System.out.println("Cambiado a color rojo");
	}
	
	pointcut successAmarillo(): call(* *Aamarillo(..));

	after(): successAmarillo(){
		Object[] parameterList = thisJoinPoint.getArgs();
		Parent root = (Parent) parameterList[0];
		root.setStyle("-fx-background-color: yellow");
		System.out.println("Cambiado a color amarillo");
	}
	
	pointcut successVerde(): call(* *Averde(..));

	after(): successVerde(){
		Object[] parameterList = thisJoinPoint.getArgs();
		Parent root = (Parent) parameterList[0];
		root.setStyle("-fx-background-color: green");
		System.out.println("Cambiado a color verde");
	}
	
	pointcut successAzar(): call(* *Aazar(..));

	after(): successAzar(){
		Object[] parameterList = thisJoinPoint.getArgs();
		Parent root = (Parent) parameterList[0];
		String[] colores = { "orange", "yellow", "pink", "chocolate", "violet", "cyan", "grey" };
		int al = (int) Math.round(Math.random() * (colores.length - 1));
		String color_al = colores[al];
		String s = "-fx-background-color: " + color_al + ";";
		root.setStyle(s);
		System.out.println("Cambiado a color " + color_al);
	}
	
}
