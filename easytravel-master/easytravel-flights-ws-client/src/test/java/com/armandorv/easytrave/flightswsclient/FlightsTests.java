package com.armandorv.easytrave.flightswsclient;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		com.armandorv.easytrave.flightswsclient.flightstats.FlightsServiceTest.class,
		com.armandorv.easytrave.flightswsclient.flightware.FlightsServiceTest.class })
public class FlightsTests {

}
