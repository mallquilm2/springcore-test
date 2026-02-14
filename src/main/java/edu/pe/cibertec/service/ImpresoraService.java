package edu.pe.cibertec.service;

import edu.pe.cibertec.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ImpresoraService {

    @Autowired
    @Qualifier("documentoTexto")
    private Imprimible documento;

    public ImpresoraService() {
    }

    public ImpresoraService(Imprimible documento) {
        this.documento = documento;
    }

    public void imprimirDocumento() {
        System.out.println("Imprimiendo documento -->"+getDocumento().imprimir());
    }

    public Imprimible getDocumento() {
        return documento;
    }

    public void setDocumento(Imprimible documento) {
        this.documento = documento;
    }
}
