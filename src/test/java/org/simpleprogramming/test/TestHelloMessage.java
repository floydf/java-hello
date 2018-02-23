package org.simpleprogramming.test;

import org.simpleprogramming.common.LoggedTest;

import org.simpleprogramming.hello.HelloMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHelloMessage extends LoggedTest
{
    HelloMessage hm;

    public void setUp()
    {
	String 
	    filename = "applicationContext.xml";

	ApplicationContext
	    ac = new FileSystemXmlApplicationContext(filename);

	hm = (HelloMessage) ac.getBean("helloBean");
    }

    public void test1()
    {
	log.warn("emit");
	log.debug("starting test1");

	try {

	    hm.setHelloMessage("Hello World from the test framework");

	} catch (Exception ex) {

	    log.warn("test1: exception", ex);
	    fail("test1: exception");
	}
    }
}