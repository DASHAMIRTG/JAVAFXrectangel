package org.example.demo10;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
             Pane pane = new Pane();
             Scene scene = new Scene(pane,600,600);
             drawCarpet(pane,0,0,600);
             stage.setScene(scene);
             stage.show();

    }
    public void drawCarpet(Pane root, int x, int y, int side){
        int subSide= side/3;
        Rectangle rectangle= new Rectangle(x + subSide,y + subSide,subSide,subSide);

        root.getChildren().add(rectangle);
        if (subSide>=50){
            rectangle.setFill(Color.RED );
        } else if (subSide>=12) {
            rectangle.setFill(Color.BISQUE);
        }else {
            rectangle.setFill(Color.DARKBLUE);
        }
        if (subSide>=12){
                drawCarpet(root, x , y, subSide);
                drawCarpet(root, x +subSide, y, subSide);
                drawCarpet(root, x , y+subSide, subSide);
                drawCarpet(root,x + 2 *subSide,y + 2 *subSide,subSide);
                drawCarpet(root,x + subSide,y + 2 * subSide,subSide);
                drawCarpet(root,x+2*subSide,y+subSide,subSide);
                drawCarpet(root, x ,y + 2*subSide,subSide);
                drawCarpet(root,x+2*subSide,y,subSide);
            }
    }
    public static void main(String[] args) {launch(args);}
}