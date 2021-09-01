package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		//버튼이 눌린 상태의 모습
		HBox hb=new HBox(10);
		ToggleButton tb = new ToggleButton("toggleButton");
		hb.getChildren().addAll(tb);
		hb.setPrefSize(300, 200);
		
		
		arg0.setScene(new Scene(hb));
		arg0.show();
		
	}

}
