package com.sterling.test;

import java.io.InputStream;
import java.util.Iterator;

import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Document;

import com.sterlingcommerce.baseutil.SCXmlUtil;

/**
 * The Class SampleJUnitTest.
 *
 */
public class PTSampleJUnitTest extends XMLTestCase {

  /**
   * Test something using Mockito.
   */
  @Test
  public final void testSomethingTest() {
    Iterator i = Mockito.mock(Iterator.class);
    Mockito.when(i.next()).thenReturn("Mockito").thenReturn("rocks");
    String result = i.next() + " " + i.next();
    // assert
    assertEquals("Mockito rocks", result);
  }

  /**
   * Test something using XMLUnit.
   */
  @Test
  public final void testXmlTest() {
    InputStream is = PTSampleJUnitTest.class.getResourceAsStream("test.xml");
    Document doc1 = SCXmlUtil.createFromStream(is);
    Document doc2 = SCXmlUtil.createFromString("<Test Check=\"true\"/>");
    assertXMLEqual(doc1, doc2);
  }
}
