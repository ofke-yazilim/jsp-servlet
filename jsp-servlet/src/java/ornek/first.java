/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author o.kesmez
 */
public class first extends HttpServlet {

    public int renk = 1;
    public String line = "";
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
        
        String file = "dosyam.txt";
        FileReader fileReader = new FileReader(file);

        String _line;
        BufferedReader br = new BufferedReader(fileReader);

        while ((_line = br.readLine()) != null) {

           this.line = _line;

        }

        br.close();

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet first</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet first at " + request.getContextPath() + this.renk  + this.line +  getServletContext().getRealPath("/") + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
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

    /**
     * Yapıcı sınıfımız Birkez çalışır.
     * @throws ServletException 
     */
    @Override
    public void init() throws ServletException {
        this.renk = 12;
    }
    
    /**
     * Son çalışan method
     */
    @Override
    public void destroy(){
        try {
            result();
        } catch (IOException ex) {
            Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void result() throws IOException {
        try{
            File ds=new File(getServletContext().getRealPath("/") + "files\test25.txt");
            if(ds.exists()){
                out.println("Dosya zaten var ismi-->"+ds.getName()+"yolu-->"+ds.getAbsolutePath());
            }
            else{
                ds.createNewFile();
                out.println("dosyam isminde bir text dosyası olusturuldu");
            }

        } catch(IOException e2){
            out.println(e2);
        }
    }
}
