package controle;

import modelo.BuscaInterpolada;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        BuscaInterpolada vetor = new BuscaInterpolada();

        int vet[] = new int[7];

        vet[0] = Integer.parseInt(request.getParameter("valor1"));
        vet[1] = Integer.parseInt(request.getParameter("valor2"));
        vet[2] = Integer.parseInt(request.getParameter("valor3"));
        vet[3] = Integer.parseInt(request.getParameter("valor4"));
        vet[4] = Integer.parseInt(request.getParameter("valor5"));
        vet[5] = Integer.parseInt(request.getParameter("valor6"));
        vet[6] = Integer.parseInt(request.getParameter("valor7"));

        vetor.setChave(Integer.parseInt(request.getParameter("chave")));

        vetor.setVet(vet);
        vetor.ordenacao(vet);
        vetor.buscaInterpolacao(vetor.getVet(), vetor.getVet().length, vetor.getChave());

        request.setAttribute("vetor", vetor);
        RequestDispatcher rd = request.getRequestDispatcher("/MostraOrdenacao.jsp");
        rd.forward(request, response);

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
