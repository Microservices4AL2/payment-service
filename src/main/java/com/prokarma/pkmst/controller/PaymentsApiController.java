package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.PaymentDetails;
import com.prokarma.pkmst.model.PaymentOutput;

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
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2022-06-01T16:46:40.877Z")

@Controller
public class PaymentsApiController implements PaymentsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PaymentsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PaymentOutput> paymentsCreditCardPost(@ApiParam(value = "" ,required=true )   @RequestBody PaymentDetails body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PaymentOutput>(objectMapper.readValue("", PaymentOutput.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/xml")) {
            return new ResponseEntity<PaymentOutput>(objectMapper.readValue("", PaymentOutput.class), HttpStatus.OK);
        }

        return new ResponseEntity<PaymentOutput>(HttpStatus.OK);
    }

}
