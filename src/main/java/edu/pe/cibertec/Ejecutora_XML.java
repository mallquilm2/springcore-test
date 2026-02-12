package edu.pe.cibertec;

import edu.pe.cibertec.beans.HolaMundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutora_XML {

    public static void main(String[] args) {
        // Aperturamos el contexto de spring con la configuraciòn XML
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");

        HolaMundo h = (HolaMundo) contexto.getBean("holaMundo");

        h.saludar();

        //Cerramos el contexto de spring con la configuración XML
        ((ConfigurableApplicationContext)contexto).close();
    }
}
