package a.b.c;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyAdditionClass extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
       
	int a;
	int x=Integer.parseInt(req.getParameter("n1"));
	int y=Integer.parseInt(req.getParameter("n2"));
	String b=req.getParameter("cal");
	
	PrintWriter po=res.getWriter();
	if("Add".equalsIgnoreCase(b))
	{
		int z=x+y;
		po.println("Addtion is :"+z);
	}
	else if("Sub".equalsIgnoreCase(b))
	{
		int z=x-y;
		po.println("Subtraction is :"+z);
	}
	else if("Mult".equalsIgnoreCase(b))
	{
		int z=x*y;
		po.println("Multiplcation is :"+z);
	}
	else if("Div".equalsIgnoreCase(b))
	{
		int z=x/y;
		po.println("Division is :"+z);
	}
	
	
	
	
}

}
