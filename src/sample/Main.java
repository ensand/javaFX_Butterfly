package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import static sample.Controller.getX;
import static sample.Controller.getY;
import static sample.Controller.drawShapes;
import static sample.Controller.setX;
import static sample.Controller.setY;

public class Main extends Application {

    double x1 = 0.0, y1 = 0.0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Liblikas");
        Scene scene=new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.setOnKeyPressed(
                new EventHandler<KeyEvent>() {
                    public void handle(KeyEvent e) {
                        String code = e.getCode().toString();
                        System.out.println(code);

                        if(code.equals("UP")){
                            y1 = getY() - 10;
                            drawShapes(Controller.gc, getX(), y1);
                            setY(y1);
                        }

                        if(code.equals("DOWN")){
                            y1 = getY() + 10;
                            drawShapes(Controller.gc, getX(), y1);
                            setY(y1);
                        }

                        if(code.equals("LEFT")){
                            x1 = getX() - 10;
                            drawShapes(Controller.gc, x1, getY());
                            setX(x1);
                        }

                        if(code.equals("RIGHT")){
                            x1 = getX() + 10;
                            drawShapes(Controller.gc, x1, getY());
                            setX(x1);
                        }

                    }
                }
            );
    }


    public static void main(String[] args) {
        launch(args);
    }
}