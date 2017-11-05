package io.swagger.api;

import io.swagger.model.Cliente;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T17:41:52.644Z")

@Controller
public class ClientesApiController implements ClientesApi {



    public ResponseEntity<Cliente> alteraCliente(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Cliente>(HttpStatus.OK);
    }

    public ResponseEntity<Cliente> buscaCliente(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Cliente>(HttpStatus.OK);
    }

    public ResponseEntity<Cliente> criarCliente(@ApiParam(value = "Informações do Cliente." ,required=true )  @Valid @RequestBody Cliente cliente) {
        // do some magic!
        return new ResponseEntity<Cliente>(HttpStatus.OK);
    }

    public ResponseEntity<Void> removerCliente(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
