package fr.kipaka.com.gameofmemory;

/**
 * Created by M0297357 on 20/12/2016.
 */

import android.widget.Button;


public class Card{

    public int x;
    public int y;
    public Button button;

    public Card(Button button, int x,int y) {
        this.x = x;
        this.y=y;
        this.button=button;
    }


}