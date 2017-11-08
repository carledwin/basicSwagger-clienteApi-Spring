package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.joda.time.LocalDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Cliente;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-08T16:23:03.102-02:00")

@Controller
public class ClientesApiController implements ClientesApi {

	List<Cliente> clientes;
	
	public ClientesApiController() {
		
		clientes = new ArrayList<>();
		clientes.add(new Cliente(1, "Carl Edwin Antonio", "Nascimento", "ativo", new LocalDate(1983, 2, 27)));
		clientes.add(new Cliente(2, "Fulano ", "de Tal", "inativo", new LocalDate(2005, 7, 16)));
	}


    public ResponseEntity<Cliente> alteraCliente(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Cliente>(HttpStatus.OK);
    }

    public ResponseEntity<Cliente> buscaCliente(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
    	
    	Cliente cliente = null;
    	
    	if(null == id || id <= 0) {
    		return new ResponseEntity("O id '" + id + "' informado é inválido.", HttpStatus.BAD_REQUEST);
    	}else {
    		for(Cliente cli : clientes) {
    			
    			if(cli.getId().equals(id)) {
    				cliente = cli;
    			}
    		}
    	}
    	
    	if(null == cliente) {
    		return new ResponseEntity("Cliente com id '" + id + "' não encontrado.", HttpStatus.NOT_FOUND);
    	}
    	
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    public ResponseEntity<List<Cliente>> buscaTodos(@ApiParam(value = "" , defaultValue="application/json") @RequestHeader(value="Content-Type", required=false) String contentType) {
    	// do some magic!
        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }

    public ResponseEntity<Cliente> criaCliente(@ApiParam(value = "Informações do Cliente." ,required=true )  @Valid @RequestBody Cliente cliente) {
        // do some magic!
        return new ResponseEntity<Cliente>(HttpStatus.OK);
    }

    public ResponseEntity<Void> removeCliente(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
