

import Geometry.*;
import Vectormath.*;
import Mathtools.*;
import ScenePack.*;
import Color.*;
import ImagePack.*;
import Renderers.*;

public class RendProject extends Object {
    
    public static void main(String[] args) {
        Image               image;
        Scene               scene;
        
        Settings.printSettings();
        
        scene = new Scene();
        SceneBuilder.cornellBox(scene);
        scene.printSceneInfo();
        
        image = new Image(Settings.IMAGE_WIDTH, Settings.IMAGE_HEIGHT);
        
        System.out.println("Start generating Image");Timer.startTime();
        image = RayTracer.generateImage(scene, scene.defaultCamera);
        System.out.println("Image Complete " + Timer.endTime() + " seconds");
        image.writeImageAsRGBE("picture.rgbe");
        
        Statistics.printStatistics();
    }
    
}