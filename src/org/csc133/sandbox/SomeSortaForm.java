package org.csc133.sandbox;

import com.codename1.ui.Form;
import com.codename1.ui.util.UITimer;


public class SomeSortaForm extends Form implements Runnable{
    UITimer time;
    int counter = 0;
    public SomeSortaForm(){
        time = new UITimer(this);
        unpause();
    }

    public void pause(){
        time.cancel();

    }
    public void unpause(){
        time.schedule(1000, true, this);
    }

    @Override
    public void run() {

        System.out.println("Some sorta text: " + counter++);

    }
}
