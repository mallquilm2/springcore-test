package edu.pe.cibertec;

import edu.pe.cibertec.beans.HolaMundo;
import edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutora_XML {

    public static void main(String[] args) {
        // Aperturamos el contexto de spring con la configuraciòn XML
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");

        HolaMundo h1 = (HolaMundo) contexto.getBean("holaMundo");

        h1.saludar();

        HolaMundo h2 = (HolaMundo) contexto.getBean("holaMundo");
        System.out.println("compara posiciones de memoria = "+h1+" - "+h2);
        h2.setNombre("Segundo nombre");
        h2.saludar();
        System.out.println("Valor del nombre de la primera instancia del bean h1 = "+h1.getNombre());

        ImpresoraService impresoraService = (ImpresoraService) contexto.getBean("impresoraService");
        impresoraService.imprimirDocumento();

        //Cerramos el contexto de spring con la configuración XML
        ((ConfigurableApplicationContext)contexto).close();
    }
}
