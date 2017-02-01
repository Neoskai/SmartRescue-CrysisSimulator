package com.smartcity.exchange;

import java.io.IOException;

import com.smartcity.simulator.ClientSimulator;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Created by lpotages on 22/12/16.
 */
public class RequestInterceptor extends Thread{

    private static ClientSimulator simulator = new ClientSimulator();

    public void run() {
        try{
            simulator.initializePool(10,10,10);

            Server server = new Server(8081);
            server.start();
            server.join();
        } catch (Exception e){
            System.err.println("Could not launch server");
        }
    }

    private static class RequestHandler extends AbstractHandler{
        public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
                throws IOException, ServletException {
            // Handling headers

            response.setContentType("text/html;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);
            baseRequest.setHandled(true);
            response.getWriter().println("OK");


            String operationType = request.getHeader("operationType");

            //int idEmergency = Integer.parseInt((String) request.g);
            //String tokenId = (String) t.getAttribute("token");


            // A) Initialiser un pool de threads identifiés par un ID unique
            // B) Sauvegarde la thread de pools dans le generator
            // C) On forward les messages aux threads concernés ou on broadcast sur les requetes
            // D) Le thread réponds en fonction de son état

            //Traiter cas:
            // La requete est une demande d'intervention
            // La requete est une confirmation de prise en charge

            // @TODO Retrieve informations from T element
            // @TODO Launch simulation with the given infos
        }
    }

}
