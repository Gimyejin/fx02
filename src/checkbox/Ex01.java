package checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		//다중선택
		VBox vb = new VBox(10);//안쪽 사이 거리 10
		CheckBox cb1=new CheckBox("chk1");
		CheckBox cb2=new CheckBox("chk2");
		cb2.setSelected(true);//시작부터 cb2에 체크상태
		
		cb1.setText("오락");
		cb2.setText("게임");
		
		vb.getChildren().addAll(cb1,cb2);
		arg0.setScene(new Scene(vb,300,200));
		
		arg0.show();
	}

}
