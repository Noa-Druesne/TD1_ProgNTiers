package controler;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("<html>") ;
        out.println("<head>") ;
        out.println("<title>Bonjour le monde !</title>") ;
        out.println("</head>") ;
        out.println("<body>") ;
        out.println("<h1>Bonjour le monde !</h1>") ;
        out.println("</body>") ;
        out.println("</html>") ;
    }
}
