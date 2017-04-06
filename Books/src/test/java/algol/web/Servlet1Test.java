package algol.web;

import junit.framework.TestCase;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.junit.Test;
import org.junit.Before;

import javax.servlet.ServletException;

import java.io.IOException;

/**
 * Created by admin on 05.04.2017.
 */
public class Servlet1Test extends TestCase {

    @Test
    public void testDoSomething() throws Exception {
        System.out.println("testDoSomething");
        request.addParameter("username", "scott");
        request.addParameter("password", "tiger");
        servlet.doGet(request, response);
        assertEquals("text/html", response.getContentType());
    }
    @Test
    public void testDoGet() throws Exception {
        System.out.println("Testing doGet...");
        servlet.doGet(request, response);
        System.out.println(response.getContentAsString());
    }

    private Servlet2 servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() {
        System.out.println("setUp");
        servlet = new Servlet2();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }

//    @Test
//    public void correctUsernameInRequest() throws ServletException, IOException {
//        System.out.println("correctUsernameInRequest");
//        request.addParameter("username", "scott");
//        request.addParameter("password", "tiger");
//        servlet.doGet(request, response);
//        assertEquals("text/html", response.getContentType());
//
//    }
}