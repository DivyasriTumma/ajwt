import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HandHttpReqRes extends HttpServelt{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String sno,sname,branch,college;
		sno=request.getParameter("sno");
		sname=request.getParameter("sanme");
		branch=request.getParameter("branch");
		college=request.getParameter("college");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<table>");
		out.println("<tr><th>Student no.</th><td>"+sno+"</td></tr>");
		out.println("<tr><th>Student name.</th><td>"+sname+"</td></tr>");
		out.println("<tr><th>Branch.</th><td>"+branch+"</td></tr>");
		out.println("<tr><th>College.</th><td>"+college+"</td></tr>");
		out.println("</table>");
	}
}
		
		
	
