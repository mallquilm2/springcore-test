package edu.pe.cibertec.beans;

public class DocumentoTexto  implements Imprimible{

    private void iniciar(){
        System.out.println("Iniciando la creación de la instancia del bean de TEXTO");
    }

    private void destruir(){
        System.out.println("Destruyendo la instancia del bean de TEXTO");
    }

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo de texto.";
    }
}
