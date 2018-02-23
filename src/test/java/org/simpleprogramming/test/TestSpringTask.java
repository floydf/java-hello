package org.simpleprogramming.test;

import org.simpleprogramming.common.LoggedTest;
import org.simpleprogramming.common.SpringTask;

public class TestSpringTask extends LoggedTest
{
    public void test1()
    {
	log.debug("starting test1");

	try {

	    log.debug("in try loop");

	    SpringTask
		st = new SpringTask();

	    st.setContextName("applicationContext.xml");
	    st.setEntryName("main");

	    st.execute();


	} catch (Exception ex) {

	    log.warn("test1: exception", ex);
	    fail("test1: exception");
	}
    }
}