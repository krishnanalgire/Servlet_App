package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet{
public void init()throws ServletException{
	
}
public void service(ServletRequest req,
ServletResponse res)throws ServletException,
IOException{
String uName = req.getParameter("uname");
String mId = req.getParameter("mid");
PrintWriter pw = res.getWriter();
res.setContentType("text/html");
pw.println("====UserDetails===");
pw.println("<br>UserName:"+uName);
pw.println("<br>MailId:"+mId);
}

public void destroy() {

}
}