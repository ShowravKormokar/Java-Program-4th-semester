import javax.swing.*;
import java.awt.*;

public class JFrame{
    public String title;
    public int width;
    public int height;
    public boolean visible;

    public JFrame(){

    }
    public JFrame(String title){
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public void setSize(int width, int height){
        this.width=width;
        this.height=height;
    }

    public void setVisible(boolean visible){
        this.visible = visible;

    }

    public String toString(){
        return "JFrame[height= "+height+"width= "+width+"]";
    }

}