package org.csc133.sandbox;

import com.codename1.ui.Form;
import com.codename1.ui.util.UITimer;


public class SomeSortaForm extends Form implements Runnable{
    UITimer time;
    int counter = 0;
    public SomeSortaForm(){
        //instantiate the timer, you can pass this because the class is Runnable(has a run method)
        time = new UITimer(this);
        unpause();
    }

    public void pause(){
        time.cancel();

    }
    public void unpause(){
        //Time is milliseconds until timer elapses
        //The boolean is weather or not the timer should repeat.
        //We bind a cn1 Form to the timer. I think this is tly if you instantiate UITimer in AppMain.
        //CN1 has a lot of examples where they make a UITimer, and implement a runnable method using a lambda.
        //At the end they use .schedule and bind a Form.
        //I am not sure how to stop the timer if you schedule it like that.
        //Last note: CN1 makes a note that the timer is not very accurate. 
        time.schedule(1000, true, this);
    }

    @Override
    public void run() {

        System.out.println("Some sorta text: " + counter++);

    }
}
