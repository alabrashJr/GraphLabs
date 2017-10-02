package lab1.JavaFxBasics;
import  javafx.application.Application;
import  javafx.event.ActionEvent;
import  javafx.event.EventHandler;
import javafx.scene.Scene;
import  javafx.scene.control.Button;
import javafx.scene.control.Label;
import  javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class SwitchingScenes extends  Application{
    Stage window ;
    Scene scene1,scene2 ;
    public static void main(String[] args) {
    launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
    window=primaryStage;
        Label label = new Label("Hi there ! ");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(scene2));
        //Layout
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label,button1);
        scene1=new Scene(layout1,200,200);


        Button button2 = new Button("Go to Scene 1");
        button2.setOnAction(e -> window.setScene(scene1));
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Switching Scenes");
        window.show();
    }
}
