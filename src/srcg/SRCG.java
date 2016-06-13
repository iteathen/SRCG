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
import java.net.URL;
import javax.xml.bind.annotation.*;


/**
 * ...
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
                        
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        
        /* This is an example of how to execute a EMCAScript using nashorn 
        try{
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
            //engine.put("stage", primaryStage);
            String ScriptFilePath = getClass().getResource("/srcg/scripts/test.js").getPath();
            System.out.println(ScriptFilePath); //test
            FileReader Script = new FileReader(ScriptFilePath); //file not found
            System.out.println(Script.toString()); //test
            engine.eval(Script); 
        }catch(Exception e){
            System.out.println("There was a problem loading a script. Error: " );
            e.printStackTrace();
        }
        */

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

