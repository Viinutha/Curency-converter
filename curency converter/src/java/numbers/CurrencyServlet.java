/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinut
 */
public class CurrencyServlet extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res)throws IOException{
        int amount = Integer.parseInt(req.getParameter("amount"));
        PrintWriter out = res.getWriter();
        out.println(amount);
        
        
    }
    
}