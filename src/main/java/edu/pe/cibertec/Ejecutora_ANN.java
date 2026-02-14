package edu.pe.cibertec;

import edu.pe.cibertec.beans.HolaMundo;
import edu.pe.cibertec.beans.Imprimible;
import edu.pe.cibertec.config.AppConfig;
import edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutora_ANN {

    public static void main(String[] args) {
        // Aperturamos el contexto de spring con la configuraciòn por Anotacion
        ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);

        HolaMundo h = (HolaMundo) contexto.getBean("holaMundo");
        h.saludar();

        ImpresoraService impresoraService = (ImpresoraService) contexto.getBean("impresoraService");
        impresoraService.imprimirDocumento();

        //Cerramos el contexto de spring con la configuración por anotacion
        ((ConfigurableApplicationContext)contexto).close();
    }
}
