package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hb= new HBox(10);
		RadioButton rb1 = new RadioButton("rb1");
		RadioButton rb2 = new RadioButton("rb2");
		
		hb.getChildren().addAll(rb1,rb2);
		hb.setPrefSize(300, 200);
		
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		//둘을 하나의 그룹으로 묶음
		
		rb1.setText("10대");
		rb1.setSelected(true);
		
		hb.setPadding(new Insets(20));//상하좌우 20씩 띄움
		//hb.setStyle("-fx-background-color:red");
		
		//padding은 안으로 여백주기
		//무엇을 기준으로 margin은 밖으로 여백주기
		HBox.setMargin(rb2, new Insets(50,20,20,50));
				
		arg0.setScene(new Scene(hb));
		arg0.show();
		
	}

}
