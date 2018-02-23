package org.simpleprogramming.test;

import org.simpleprogramming.common.LoggedClass;

public class MyTestBean extends LoggedClass
    implements Runnable				
{
    public void run()
    {
	log.debug("running the main program");
    }
}

