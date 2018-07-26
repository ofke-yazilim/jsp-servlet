/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import static javax.servlet.SessionTrackingMode.URL;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author o.kesmez
 */
public class three extends HttpServlet {

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
             
        //charset ayarlanıyor
        response.setCharacterEncoding("ISO-8859-9");
        
        //ServletContext interface çağrılıyor
        ServletContext context = getServletContext();
        
        //web.xml içerisinde tanımlanan email parametresi alınıyor
        String email = context.getInitParameter("email");
        //Java Servlet Api Versiyon bilgisi alınıyor
        int version = context.getMajorVersion();
        //Context name bilgisini verir
        String contextName = context.getServletContextName();
        //Bulunduğumuz dizini verir
        String path = context.getContextPath();
        //Kullandığımız server bilgisini verir
        String serverInfo = context.getServerInfo();
        //Verilen dosyanın sunucu üzerindeki gerçek dizinini verir.
        String realPath = context.getRealPath("/a.txt");
        //Scope Ablication ad objesi tanımlandı
        context.setAttribute("ad","Omer Faruk");
        //ad objesi alınıyor
        Object ad = context.getAttribute("ad");
          
        //Response yazma nesnemiz hazırlanıyor
        PrintWriter pw = response.getWriter();

        //Almış olduğumuz değerleri sayfa üzerine basıyoruz.
        pw.print("<html><body>");
        pw.print(ad + "<br>");
        pw.print(serverInfo + "<br>");
        pw.print(realPath + "<br>");
        pw.print(contextName + "<br>");
        pw.print(path+ "<br>");
        pw.print(version + "<br>");
        pw.print(email + version +"<br>");
        pw.print("</body></html>");

        //servlet üzerinde index.jsp üzerine gidiyoruz. 
        //context.getRequestDispatcher("/index.jsp").forward(request,response); ;
        //yukarıda parametrelerin değerlerini aldık
        
        //Aşağıdaki  web.xml içerisine bu servlet için tanımlanmış değerleri alıyoruz.
        Enumeration<String> enm = context.getInitParameterNames();
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
