package edu.pe.cibertec.beans;

public class DocumentoExcel implements Imprimible{

    private void iniciar(){
        System.out.println("Iniciando la creación de la instancia bean");
    }

    private void destruir(){
        System.out.println("destruyendo instancia creada ");
    }

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo Excel.";
    }
}
