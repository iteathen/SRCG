/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcg;

import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.fxml.*;
import javafx.scene.*;
import javax.script.*;
import java.io.FileReader;
import javax.xml.bind.annotation.*;


/**
 *
 * @author heathen
 */
public class SRCG extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Start the main fxml scene
        try{
        Parent root = FXMLLoader.load(getClass().getResource("/srcg/fxml/MainWindow.fxml"));
        Scene scene = new Scene(root, 300, 275);
        scene.getStylesheets().add("/srcg/css/SRCG.css");
        primaryStage.setTitle("Heathen's SRCG");
        primaryStage.setScene(scene);
        primaryStage.show();
        }catch(Exception e){
            System.out.println("There was a problem loading the main window. Error: " + e.getMessage());
        }
        
        /* Execute a EMCAScript using nashorn */
        try{
            String Script = getClass().getResource("/srcg/scripts/myjavascript.js").getPath();
            if(Script.isEmpty()==false){
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
                engine.put("stage", primaryStage);
                engine.eval(new FileReader(Script));
            }
        }catch(Exception e){
            System.out.println("There was a problem loading a script. Error: " + e.getMessage());
        }
                        
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

