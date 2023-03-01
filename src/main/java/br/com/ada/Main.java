package br.com.ada;

import br.com.ada.service.TranslateService;

import javax.inject.Inject;
import javax.transaction.Transaction;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/translate")
public class Main {
    @Inject
    private TranslateService translateService;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return translateService.getMessage("de");
    }

}