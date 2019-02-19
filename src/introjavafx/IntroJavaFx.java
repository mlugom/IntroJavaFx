/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
/**
 *
 * @author Estudiante
 */
public class IntroJavaFx extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tabla");
        TableView table = new TableView();
         
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    } 
}
