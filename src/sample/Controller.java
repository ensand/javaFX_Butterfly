package sample;

import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class Controller {
    static double x;
    static double y;
    Button clear = new Button();
    Button blue = new Button();
    static GraphicsContext gc;


    @FXML
    Canvas joonis = new Canvas();

    public void hiir(MouseEvent event) {
        System.out.println(event.getX() + "|" + event.getY());
        x = event.getX() - 10;
        y = event.getY() - 10;
        gc = joonis.getGraphicsContext2D();
        drawShapes(gc, x, y);

    }

    public static void drawShapes(GraphicsContext gc, double x, double y) {
        gc.setFill(Color.BLACK);
        gc.fillOval(x, y, 20, 20);
//        Image pilt = new Image ("https://cdn.emojidex.com/emoji/seal/inverted_pentagram.png?1422537289");
//        gc.drawImage(pilt, 10, 10, 100, 100);

    }

    public void liiguta(KeyEvent event) {
        System.out.println(event.getCode());

    }

    public void initialize(){
        System.out.println("I am working properly I guess.");
    }

    @FXML
    private void clearAll(ActionEvent event) {// funktiooni nime kutsud nupu OnActionis esile
        gc.clearRect(0,0,600,550);
    }

    public void setBlue(ActionEvent event) {
        gc.setFill(Color.BLUE);
    }

    public static double getY(){
        return y;
    }

    public static double getX(){
        return x;
    }

    public static void setY(double y1) {
        y = y1;
    }

    public static void setX(double x1) {
        x = x1;
    }

}
