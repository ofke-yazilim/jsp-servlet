/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author o.kesmez
 */
public class two extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //mime typ hazırlanıyor
        response.setContentType("text/html;charset=UTF-8");
        
        //Response yazma nesnemiz hazırlanıyor
        PrintWriter pw = response.getWriter();

        //ServletConfig interface bağlanıyor
        ServletConfig config = getServletConfig();

        //web.xml içerisine tanımlanmış user değeri alınıyor
        String user = config.getInitParameter("user");
        //web.xml içerisine tanımlanmış olan password değeri alınıyor
        String password = config.getInitParameter("password");
        //şuan çalışan servlet ismnini alıyoruz.
        String servletName = config.getServletName();

        //Almış olduğumuz değerleri sayfa üzerine basıyoruz.
        pw.print("<html><body>");
        pw.print(servletName + "<br>");
        pw.print(user + "<br>");
        pw.print(password + "<br>");
        pw.print("</body></html>");

        //yukarıda parametrelerin değerlerini aldık
        //Aşağıdaki  web.xml içerisine bu servlet için tanımlanmış değerleri alıyoruz.
        Enumeration<String> enm = config.getInitParameterNames();
        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
