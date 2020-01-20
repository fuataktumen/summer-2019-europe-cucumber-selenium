package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

@Before

    public void setuP(){


    System.out.println("This is from BEFORE");
}


@After

    public void TearDown(){


    System.out.println("This is from AFTER");

}

    @After("@Fleet")

    public void TearDownStoreManager(){


        System.out.println("This is from AFTER SPECİAL");
    }

}
