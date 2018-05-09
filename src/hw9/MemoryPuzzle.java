package hw9;

import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MemoryPuzzle extends Application {
	
	//Create image objects array 
//	private ImageView[] tilePictures = {
//		new ImageView("HW9/Resources/Ravenclaw.png"),
//		new ImageView("HW9/Resources/Gryffindor.png"),
//		new ImageView("HW9/Resources/Slytherin.png"),
//		new ImageView("HW9/Resources/Hufflepuff.png"),
//		new ImageView("HW9/Resources/Pukwudgie.png"),
//		new ImageView("HW9/Resources/Thunderbird.png"),
//		new ImageView("HW9/Resources/Horned_Serpent.png"),
//		new ImageView("HW9/Resources/Wampus.png"),
//	};
	
//	private Images[] tilePictures = {
//		new Images("Resources/Ravenclaw.png"),
//		new Images("Resources/Gryffindor.png"),
//		new Images("Resources/Slytherin.png"),
//		new Images("Resources/Hufflepuff.png"),
//		new Images("Resources/Pukwudgie.png"),
//		new Images("Resources/Thunderbird.png"),
//		new Images("Resources/Horned_Serpent.png"),
//		new Images("Resources/Wampus.png"),
//	};
	
	//Make a 2d array then initialize it 
	ImageView[][] tilePictures = {
			{   new ImageView("HW9/Resources/Ravenclaw.png"),
				new ImageView("HW9/Resources/Gryffindor.png"),
				new ImageView("HW9/Resources/Slytherin.png"),
				new ImageView("HW9/Resources/Hufflepuff.png"),
				new ImageView("HW9/Resources/Pukwudgie.png"),
				new ImageView("HW9/Resources/Thunderbird.png"),
				new ImageView("HW9/Resources/Horned_Serpent.png"),
				new ImageView("HW9/Resources/Wampus.png"),
			}	
	};
	
	//Start 
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Create a gridpane 
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(30, 30, 30, 30));
		pane.setHgap(10.0);
		pane.setVgap(10.0);
		pane.setPrefSize(10, 10);
		pane.setMaxSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);
		//pane.setGridLinesVisible(true);
		//pane.getChildren().add(new ImageView());
		
		//Declare Tiles array 
//		ImageView Tiles[] = new ImageView[8];
//		ImageView Tiles[] = tilePictures;
		
		//Assign tiles to imageview
//		ImageView[] tiles = new ImageView[8];
//		Collections.sort(tilePictures);
		ImageView[][] tilePictures = new ImageView[4][4];
		
		//Create the game board and add buttons
		for(int row = 0; row < 4; row++) {
			for(int col = 0; col < 4; col++) {
				Button button = new Button("Tile");
				GridPane.setRowIndex(button, 4);
				GridPane.setColumnIndex(button, 4);
				pane.add(button, row, col);
				pane.add(new ImageView(""), row, col);
			}
		}
		
		Label label = new Label();s
		GridPane.setConstraints(label, 4, 4);
		
		pane.getChildren().addAll(label);
			
		pane.setOnMouseClicked(e -> {
			
		});
		
		//Create scene 
		Scene scene = new Scene(pane, 300, 300);
		//Text sceneTitle = new Text("Memory puzzle game");
		primaryStage.setTitle("Memory puzzle game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
//	private class gameBoard() {
//		
//	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

