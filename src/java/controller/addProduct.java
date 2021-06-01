/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAO;
import Entities.Product;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Der Mods
 */
@WebServlet(name = "addProduct", urlPatterns = {"/addProduct"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class addProduct extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String fileName="";
        for (Part part : request.getParts()) {
            if(part.getName().equals("hinhAnh")){
                 fileName = extractFileName(part);
            // refines the fileName in case it is an absolute path
            fileName = new File(fileName).getName();
            part.write(this.getFolderUpload().getAbsolutePath() + File.separator + fileName);
            }
        }
       
       String ten = request.getParameter("ten");
       int gia = Integer.parseInt(request.getParameter("gia"));
       
       int danhMuc = Integer.parseInt(request.getParameter("danhMuc"));
       String moTa = request.getParameter("moTa");
       String hinhAnh = "/app/img/coffee/"+fileName;
       
        Product pd = new Product(1, ten, hinhAnh,moTa, danhMuc, gia);
        
        DAO dao = new DAO();
        
        dao.createProduct(pd);
       
       response.sendRedirect("managerProduct");
    }

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

    public File getFolderUpload() {
        File folderUpload = new File("C:\\Users\\Der Mods\\OneDrive\\Máy tính\\CoffeeCakeShop\\web\\app\\img\\coffee");
        if (!folderUpload.exists()) {
            folderUpload.mkdirs();
        }
        return folderUpload;
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
