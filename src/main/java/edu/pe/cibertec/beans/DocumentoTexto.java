package edu.pe.cibertec.beans;

public class DocumentoTexto  implements Imprimible{

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo de texto.";
    }
}
