package com.loop.test.day10_jsexecutor_pom;

import com.loop.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_drag_drop_pom {
    /*
   Loop Practice Drag and Drop Test
   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Verify expected default text appears on big circle
   Expected = "Drag the small circle here."

   Loop Practice Drag and Drop Test
   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Click and hold small circle
   4. Verify "Drop here." text appears on big circle

   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Click and hold small circle
   4. Move it on top of the big circle
   5. Verify “Now drop…” text appears on big circ

   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Click and hold small circle
   4. Dropped anywhere outside of big circle
   5. Verify “Try again!” text appears on big circle
    */
    @Test
    public void drag_small_here_test() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        String expected = "Drag the small circle here.";
        LoopPracticeDragDropPage loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        String actual = loopPracticeDragDropPage.bigCircle.getText();
        Assert.assertEquals(actual, expected, "Actual does not match the expected");

    }
}
