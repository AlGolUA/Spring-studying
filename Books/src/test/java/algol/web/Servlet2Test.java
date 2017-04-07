package algol.web;

import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.junit.Test;
import org.junit.Before;

import javax.servlet.ServletException;

import java.io.IOException;

/**
 * Created by admin on 05.04.2017.
 */
public class Servlet2Test extends TestCase {
    private Log log = LogFactory.getLog(this.getClass());

    @Test
    public void testDoSomething() throws Exception {
        log.info("Servlet2Test.testDoSomething");
        request.addParameter("username", "scott");
        request.addParameter("password", "tiger");
        servlet.doGet(request, response);
        assertEquals("text/html", response.getContentType());
    }
    @Test
    public void testDoGet() throws Exception {
        log.info("Servlet2Test.Testing doGet...");
        servlet.doGet(request, response);
        System.out.println("response: " + response.getContentAsString());
    }

    private Servlet2 servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() {
        log.info("Servlet2Test.setUp");
        servlet = new Servlet2();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }
}