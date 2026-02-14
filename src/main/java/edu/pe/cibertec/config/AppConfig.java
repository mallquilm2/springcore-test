package edu.pe.cibertec.config;

import edu.pe.cibertec.beans.DocumentoExcel;
import edu.pe.cibertec.beans.DocumentoTexto;
import edu.pe.cibertec.beans.HolaMundo;
import edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HolaMundo holaMundo(){
        return new HolaMundo();
    }

    @Bean
    public ImpresoraService impresoraService(){
        return new ImpresoraService();
    }

    @Bean
    DocumentoExcel documentoExcel(){
        return new DocumentoExcel();
    }

    @Bean
    public DocumentoTexto documentoTexto(){
        return new DocumentoTexto();
    }
}
