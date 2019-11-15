package com.spartaglobal.demoqatests;

import com.spartaglobal.demoqa.Resizable;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResizableTest {
    private Resizable resizable;

    @BeforeClass
    public static void setup(){

    }

    @Test
    public void resizerTest(){
        resizable = new Resizable();
        resizable.resizer();
    }

}
