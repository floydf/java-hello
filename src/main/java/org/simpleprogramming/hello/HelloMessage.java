package org.simpleprogramming.hello;

import org.simpleprogramming.common.LoggedClass;

public class HelloMessage extends LoggedClass
    implements Runnable				
{
    private String helloMessage;

    public void setHelloMessage(String s)
    {
	helloMessage = s;
    }

    public void run()
    {
	log.debug("running the hello program");
	log.debug(helloMessage);

	System.out.println("running the hello program");
	System.out.println(helloMessage);
    }
}

