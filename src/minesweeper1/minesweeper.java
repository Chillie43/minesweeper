package minesweeper1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class minesweeper extends Application implements Initializable {
	@FXML
	Button spot00;
	@FXML
	Button spot01;
	@FXML
	Button spot02;
	@FXML
	Button spot03;
	@FXML
	Button spot04;
	@FXML
	Button spot05;
	@FXML
	Button spot06;
	@FXML
	Button spot07;
	@FXML
	Button spot08;
	@FXML
	Button spot09;
	@FXML
	Button spot10;
	@FXML
	Button spot11;
	@FXML
	Button spot12;
	@FXML
	Button spot13;
	@FXML
	Button spot14;
	@FXML
	Button spot15;
	@FXML
	Button spot16;
	@FXML
	Button spot17;
	@FXML
	Button spot18;
	@FXML
	Button spot19;
	@FXML
	Button spot20;
	@FXML
	Button spot21;
	@FXML
	Button spot22;
	@FXML
	Button spot23;
	@FXML
	Button spot24;
	@FXML
	Button spot25;
	@FXML
	Button spot26;
	@FXML
	Button spot27;
	@FXML
	Button spot28;
	@FXML
	Button spot29;
	@FXML
	Button spot30;
	@FXML
	Button spot31;
	@FXML
	Button spot32;
	@FXML
	Button spot33;
	@FXML
	Button spot34;
	@FXML
	Button spot35;
	@FXML
	Button spot36;
	@FXML
	Button spot37;
	@FXML
	Button spot38;
	@FXML
	Button spot39;
	@FXML
	Button spot40;
	@FXML
	Button spot41;
	@FXML
	Button spot42;
	@FXML
	Button spot43;
	@FXML
	Button spot44;
	@FXML
	Button spot45;
	@FXML
	Button spot46;
	@FXML
	Button spot47;
	@FXML
	Button spot48;
	@FXML
	Button spot49;
	@FXML
	Button spot50;
	@FXML
	Button spot51;
	@FXML
	Button spot52;
	@FXML
	Button spot53;
	@FXML
	Button spot54;
	@FXML
	Button spot55;
	@FXML
	Button spot56;
	@FXML
	Button spot57;
	@FXML
	Button spot58;
	@FXML
	Button spot59;
	@FXML
	Button spot60;
	@FXML
	Button spot61;
	@FXML
	Button spot62;
	@FXML
	Button spot63;
	@FXML
	Button spot64;
	@FXML
	Button spot65;
	@FXML
	Button spot66;
	@FXML
	Button spot67;
	@FXML
	Button spot68;
	@FXML
	Button spot69;
	@FXML
	Button spot70;
	@FXML
	Button spot71;
	@FXML
	Button spot72;
	@FXML
	Button spot73;
	@FXML
	Button spot74;
	@FXML
	Button spot75;
	@FXML
	Button spot76;
	@FXML
	Button spot77;
	@FXML
	Button spot78;
	@FXML
	Button spot79;
	@FXML
	Button spot80;
	@FXML
	Button spot81;
	@FXML
	Button spot82;
	@FXML
	Button spot83;
	@FXML
	Button spot84;
	@FXML
	Button spot85;
	@FXML
	Button spot86;
	@FXML
	Button spot87;
	@FXML
	Button spot88;
	@FXML
	Button spot89;
	@FXML
	Button spot90;
	@FXML
	Button spot91;
	@FXML
	Button spot92;
	@FXML
	Button spot93;
	@FXML
	Button spot94;
	@FXML
	Button spot95;
	@FXML
	Button spot96;
	@FXML
	Button spot97;
	@FXML
	Button spot98;
	@FXML
	Button spot99;

	@FXML
	Button restartGame;
	@FXML
	Button flags;
	@FXML
	Label numMines;

	@FXML
	ImageView smile;
	@FXML
	ImageView dead;
	@FXML
	ImageView shades;
	@FXML
	ImageView boom;

	@FXML
	ImageView mine;
	@FXML
	ImageView mine1;
	@FXML
	ImageView mine2;
	@FXML
	ImageView mine3;
	@FXML
	ImageView mine4;
	@FXML
	ImageView mine5;
	@FXML
	ImageView mine6;
	@FXML
	ImageView mine7;
	@FXML
	ImageView mine8;
	@FXML
	ImageView flag;

	public static Label[][] mineLabels = new Label[10][10];
	public static ImageView[][] flagImages = new ImageView[10][10];
	public int numMinesLeft = 10;
	public boolean flagging = false;

	public static void main(String[] args) {
		//System.out.println("test");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/minesweeper.fxml"));
		final Pane p = loader.load();
		
		primaryStage.setTitle("Minesweeper");
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				mineLabels[i][j] = new Label("");
				mineLabels[i][j].setPrefHeight(20);
				mineLabels[i][j].setMinHeight(20);
				mineLabels[i][j].setMaxHeight(20);
				p.getChildren().add(mineLabels[i][j]);
				mineLabels[i][j].setTranslateX(20 * (j + 1));
				mineLabels[i][j].setTranslateY(180 - 380 * (i + 1) - 40 * j);
				mineLabels[i][j].setVisible(false);

				flagImages[i][j] = new ImageView();
				// flagImages[i][j] = flag0;
				Image graphic = new Image(
						"https://cdn.discordapp.com/attachments/758486779254538271/786729678286487562/flag.png");
				// System.out.println("" + graphic);
				flagImages[i][j].setImage(graphic);
				p.getChildren().add(flagImages[i][j]);
				flagImages[i][j].setTranslateX(20 * (j + 1));
				flagImages[i][j].setTranslateY(160 - 380 * (i + 1) - 40 * j);
				flagImages[i][j].setVisible(false);
			}
		}

		primaryStage.setHeight(400);

		Scene scene = new Scene(p);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resource) {
		// TODO Auto-generated method stub
		mineField field = new mineField();

		spot00.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 0, field);
			}
		});
		spot01.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 1, field);
			}
		});
		spot02.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 2, field);
			}
		});
		spot03.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 3, field);
			}
		});
		spot04.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 4, field);
			}
		});
		spot05.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 5, field);
			}
		});
		spot06.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 6, field);
			}
		});
		spot07.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 7, field);
			}
		});
		spot08.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 8, field);
			}
		});
		spot09.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(0, 9, field);
			}
		});
		spot10.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 0, field);
			}
		});
		spot11.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 1, field);
			}
		});
		spot12.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 2, field);
			}
		});
		spot13.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 3, field);
			}
		});
		spot14.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 4, field);
			}
		});
		spot15.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 5, field);
			}
		});
		spot16.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 6, field);
			}
		});
		spot17.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 7, field);
			}
		});
		spot18.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 8, field);
			}
		});
		spot19.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(1, 9, field);
			}
		});
		spot20.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 0, field);
			}
		});
		spot21.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 1, field);
			}
		});
		spot22.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 2, field);
			}
		});
		spot23.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 3, field);
			}
		});
		spot24.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 4, field);
			}
		});
		spot25.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 5, field);
			}
		});
		spot26.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 6, field);
			}
		});
		spot27.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 7, field);
			}
		});
		spot28.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 8, field);
			}
		});
		spot29.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(2, 9, field);
			}
		});
		spot30.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 0, field);
			}
		});
		spot31.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 1, field);
			}
		});
		spot32.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 2, field);
			}
		});
		spot33.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 3, field);
			}
		});
		spot34.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 4, field);
			}
		});
		spot35.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 5, field);
			}
		});
		spot36.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 6, field);
			}
		});
		spot37.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 7, field);
			}
		});
		spot38.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 8, field);
			}
		});
		spot39.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(3, 9, field);
			}
		});
		spot40.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 0, field);
			}
		});
		spot41.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 1, field);
			}
		});
		spot42.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 2, field);
			}
		});
		spot43.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 3, field);
			}
		});
		spot44.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 4, field);
			}
		});
		spot45.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 5, field);
			}
		});
		spot46.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 6, field);
			}
		});
		spot47.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 7, field);
			}
		});
		spot48.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 8, field);
			}
		});
		spot49.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(4, 9, field);
			}
		});
		spot50.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 0, field);
			}
		});
		spot51.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 1, field);
			}
		});
		spot52.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 2, field);
			}
		});
		spot53.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 3, field);
			}
		});
		spot54.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 4, field);
			}
		});
		spot55.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 5, field);
			}
		});
		spot56.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 6, field);
			}
		});
		spot57.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 7, field);
			}
		});
		spot58.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 8, field);
			}
		});
		spot59.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(5, 9, field);
			}
		});
		spot60.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 0, field);
			}
		});
		spot61.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 1, field);
			}
		});
		spot62.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 2, field);
			}
		});
		spot63.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 3, field);
			}
		});
		spot64.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 4, field);
			}
		});
		spot65.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 5, field);
			}
		});
		spot66.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 6, field);
			}
		});
		spot67.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 7, field);
			}
		});
		spot68.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 8, field);
			}
		});
		spot69.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(6, 9, field);
			}
		});
		spot70.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 0, field);
			}
		});
		spot71.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 1, field);
			}
		});
		spot72.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 2, field);
			}
		});
		spot73.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 3, field);
			}
		});
		spot74.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 4, field);
			}
		});
		spot75.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 5, field);
			}
		});
		spot76.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 6, field);
			}
		});
		spot77.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 7, field);
			}
		});
		spot78.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 8, field);
			}
		});
		spot79.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(7, 9, field);
			}
		});
		spot80.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 0, field);
			}
		});
		spot81.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 1, field);
			}
		});
		spot82.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 2, field);
			}
		});
		spot83.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 3, field);
			}
		});
		spot84.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 4, field);
			}
		});
		spot85.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 5, field);
			}
		});
		spot86.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 6, field);
			}
		});
		spot87.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 7, field);
			}
		});
		spot88.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 8, field);
			}
		});
		spot89.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(8, 9, field);
			}
		});
		spot90.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 0, field);
			}
		});
		spot91.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 1, field);
			}
		});
		spot92.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 2, field);
			}
		});
		spot93.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 3, field);
			}
		});
		spot94.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 4, field);
			}
		});
		spot95.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 5, field);
			}
		});
		spot96.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 6, field);
			}
		});
		spot97.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 7, field);
			}
		});
		spot98.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 8, field);
			}
		});
		spot99.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				click(9, 9, field);
			}
		});

		restartGame.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				field.setMineField();
				field.setMinesNear();
				field.setRevealed();
				field.setNumRevealed();
				field.setFlagged();
				dead.setVisible(false);
				shades.setVisible(false);
				smile.setVisible(true);
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						mineLabels[i][j].setVisible(false);
						flagImages[i][j].setVisible(false);
					}
				}
				boom.setVisible(false);
				mine.setVisible(false);
				mine1.setVisible(false);
				mine2.setVisible(false);
				mine3.setVisible(false);
				mine4.setVisible(false);
				mine5.setVisible(false);
				mine6.setVisible(false);
				mine7.setVisible(false);
				mine8.setVisible(false);
				numMinesLeft = 10;
				numMines.setText("Mines: 10");
			}
		});

		flags.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				flagging = !flagging;
				flag.setVisible(flagging);
			}
		});
		// TODO
	}

	public void click(int i, int j, mineField field) {
		if (i < 10 && i > -1 && j < 10 && j > -1) {
			if (flagging) {
				// do stuff with flags
				if (field.getFlagged(i, j)) {
					field.setFlagged(i, j);
					numMinesLeft++;
					numMines.setText("Mines: " + numMinesLeft);
					flagImages[i][j].setVisible(false);
				} else {
					field.setFlagged(i, j);
					numMinesLeft--;
					numMines.setText("Mines: " + numMinesLeft);
					flagImages[i][j].setVisible(true);
				}
			} else {
				if (!field.getRevealed(i, j)) {
					if (field.getMineField(i, j)) {
						// gameover
						// System.out.println("" + dead);
						dead.setVisible(true);
						smile.setVisible(false);
						boom.setVisible(true);
						boom.relocate(20 * (j + 1) + 3, 20 * (i + 1) + 3);
						int temp = 0;
						for (int k = 0; k < 10; k++) {
							for (int l = 0; l < 10; l++) {
								if (field.getMineField(k, l)) {
									if (i == k && j == l) {
										temp--;
									} else if (temp == 0) {
										System.out.println("" + mine);
										mine.setVisible(true);
										mine.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
									} else if (temp == 1) {
										mine1.setVisible(true);
										mine1.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
									} else if (temp == 2) {
										mine2.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
										mine2.setVisible(true);
									} else if (temp == 3) {
										mine3.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
										mine3.setVisible(true);
									} else if (temp == 4) {
										mine4.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
										mine4.setVisible(true);
									} else if (temp == 5) {
										mine5.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
										mine5.setVisible(true);
									} else if (temp == 6) {
										mine6.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
										mine6.setVisible(true);
									} else if (temp == 7) {
										mine7.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
										mine7.setVisible(true);
									} else if (temp == 8) {
										mine8.relocate(3 + 20 * (l + 1), 3 + 20 * (k + 1));
										mine8.setVisible(true);
									}
									temp++;
								}
							}
						}
					} else {
						field.setRevealed(i, j);

						// System.out.println(i + " " + j + " " + mineLabels[i][j]);
						
						if (field.getMinesNear(i, j) == 0) {
							mineLabels[i][j].setTextFill(Color.web("#000000"));
						} else if (field.getMinesNear(i, j) == 1) {
							mineLabels[i][j].setTextFill(Color.web("#0000ff"));
						} else if (field.getMinesNear(i, j) == 2) {
							mineLabels[i][j].setTextFill(Color.web("#00ff00"));
						} else if (field.getMinesNear(i, j) == 3) {
							mineLabels[i][j].setTextFill(Color.web("#ff0000"));
						} else if (field.getMinesNear(i, j) == 4) {
							mineLabels[i][j].setTextFill(Color.web("#ff00ff"));
						} else if (field.getMinesNear(i, j) == 5) {
							mineLabels[i][j].setTextFill(Color.web("#800000"));
						} else if (field.getMinesNear(i, j) == 6) {
							mineLabels[i][j].setTextFill(Color.web("#30d5c8"));
						} else if (field.getMinesNear(i, j) == 7) {
							mineLabels[i][j].setTextFill(Color.web("#ffa500"));
						} else if (field.getMinesNear(i, j) == 8) {
							mineLabels[i][j].setTextFill(Color.web("#c0c0c0"));
						}
						mineLabels[i][j].setText("  " + field.getMinesNear(i, j));
						// System.out.println(i + " " + j + " " + mineLabels[i][j]);

						mineLabels[i][j].setVisible(true);

						if (field.getMinesNear(i, j) == 0) {
							click(i - 1, j - 1, field);
							click(i + 1, j - 1, field);
							click(i - 1, j + 1, field);
							click(i + 1, j + 1, field);
							click(i - 1, j, field);
							click(i + 1, j, field);
							click(i, j - 1, field);
							click(i, j + 1, field);

						}
					}
				}
			}
			if (field.getNumRevealed() == 90) {
				smile.setVisible(false);
				shades.setVisible(true);
			}
		}

	}
}