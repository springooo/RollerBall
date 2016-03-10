package iut63.iut.rollerball.Model;

import android.graphics.Bitmap;
import android.media.Image;

/**
 * Created by Cedric on 04/03/2016.
 */
public abstract class Component {

    private int posX;
    private int posY;
    //patern pont à implementer si on à le temps
    private Bitmap myRepresentation;

    public int getPosX() {return posX;}
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public Bitmap getMyRepresentation() {return myRepresentation;}
    public void setMyRepresentation(Bitmap myRepresentation) {this.myRepresentation = myRepresentation;}
    public int getPosY() {return posY;}
    public void setPosY(int posY) {this.posY = posY;}



}
