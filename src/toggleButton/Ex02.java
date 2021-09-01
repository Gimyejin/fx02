package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex02 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hb=new HBox(10);
		ToggleButton tb=new ToggleButton("111");
		ToggleButton tb2=new ToggleButton("222");
		ToggleButton tb3=new ToggleButton("333");
		
		ToggleGroup tg=new ToggleGroup();
		tb.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);
		
		tb2.setSelected(true);
		
		hb.getChildren().addAll(tb,tb2,tb3);
		hb.setPrefSize(300,200);
		
		
		arg0.setScene(new Scene(hb));
		arg0.show();
		
	}

}
