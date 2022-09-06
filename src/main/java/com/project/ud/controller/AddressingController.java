package com.project.ud.controller;

import com.project.ud.service.IAddressingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("addressing")
public class AddressingController {
    @Autowired
    private IAddressingService addressingService;

   @GetMapping("static")
    public HttpEntity<?> getAddressingStatic(){

       return ResponseEntity.ok("Hola mundo");
    }

    @GetMapping("networkPrefix")
    public HttpEntity<?> get(@RequestParam String ipAddress){
        return ResponseEntity.ok(addressingService.validateNumberNetworkPrefix(ipAddress));
    }

    @RequestMapping(value = "vlsm", method = RequestMethod.GET)
    public HttpEntity<?> getAddressingVlsm(@RequestParam String ipAddress , @RequestParam String networkPrefix , @RequestParam String numberSubnet){
        return ResponseEntity.ok("Hola mundo");
    }

}
