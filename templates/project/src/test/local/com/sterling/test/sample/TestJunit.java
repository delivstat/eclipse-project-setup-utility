/**
 * This is a sample JUnit Test Case.
 */
package com.sterling.test.sample;

import com.yantra.interop.japi.YIFApi;
import com.yantra.shared.ycp.YFSContext;
import com.yantra.yfc.dom.YFCDocument;
import com.yantra.yfc.junit.SCITest;
import com.yantra.yfc.junit.SCITestCase;
import com.yantra.yfc.junit.SCITestLogLevel;
import com.yantra.yfc.junit.SCITestUtil;
import com.yantra.yfc.log.YFCLogCategory;

/**
 * This is a sample JUnit Test Case which could be used to connect to the Installed Sterling
 * instance referencing which the project has been setup.
 *
 */
public class TestJunit extends SCITestCase {

  // The following variable need to be set up for the Test Case to Run.
  /**
   * Setting up YFSContext. This will be automatically set up in the setup method.
   */
  public static YFSContext ctx;

  /**
   * Setting up YIFApi. This will be automatically set up in the setup method.
   */
  public static YIFApi api;

  /**
   * Setting up SCITestUil. This will be automatically set up in the setup method.
   */
  public static SCITestUtil util;

  /**
   * Setting up Logger. This will be automatically set up in the setup method.
   */
  public static YFCLogCategory cat;

  /**
   * Setting up the default System properties to connect to the DB.
   */
  static {
    System.setProperty("vendor", "shell");
    System.setProperty("vendorFile", "servers.properties");
    System.setProperty("api.security.enabled", "N");
  }

  /**
   * Sample TestCase. loglevel is used to set the Log Level for the logger for the test Case.
   * 
   * @throws Exception
   */
  @SCITest(loglevel = SCITestLogLevel.VERBOSE)
  public final void testTestMethod() throws Exception {
    ctx.setUserID("admin");
    YFCDocument yldoc = YFCDocument.parse("<Flow/>");
    api.getFlowList(ctx, yldoc.getDocument());
    
  }
}
