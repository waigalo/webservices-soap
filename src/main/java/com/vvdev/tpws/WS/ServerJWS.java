/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvdev.tpws.WS;

import com.vvdev.tpws.WS.BanqueService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author apple
 */
public class ServerJWS {
    
    public static void main(String[] args){
       String url="http://127.0.0.1:8787/";
       Endpoint.publish(url, new BanqueService());
       System.out.println("Mon web service est demarre sur le lien "+url);
    }
    
}
