/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvdev.tpws.WS;

//import jakarta.jws.WebMethod;
//import jakarta.jws.WebParam;
//import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author apple
 */
@WebService (serviceName="BanqueWS")
public class BanqueService {
    
    @WebMethod(operationName="convertionDHToFCFA")
    public double Conversion(@WebParam(name="montant") double mt){
        
       return mt/62;
    }
    
    @WebMethod
    public Compte getCompte (@WebParam(name="code") int code){
        
      return new Compte (code, Math.random()*10000, new Date())  ;
    }
    
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random() * 10000, new Date()),
                new Compte(2, Math.random() * 10000, new Date()),
                new Compte(3, Math.random() * 10000, new Date())
        );
    }
    
}
