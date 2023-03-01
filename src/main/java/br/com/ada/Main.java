package br.com.ada;

import br.com.ada.service.TranslateService;

import javax.inject.Inject;
import javax.transaction.Transaction;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class Main {
    @Inject
    private TranslateService translateService;

    @Path("/translate")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloTranslate() {
        return translateService.getMessage("en");
    }

    @Path("/carro")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String carro() {
        return new Carro("Hillux","LKJ7986", "Toyota").toString();
    }

}

class Carro {
    private String modelo;
    private String placa;
    private String marca;

    public Carro(String modelo, String placa, String marca) {
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return this.placa+" - "+this.modelo+" - "+this.marca;
    }
}