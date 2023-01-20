/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

  /* SANDESH THAPA */
package com.mycompany.javarmi.AreaOfCircle;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CircleAreaServer {
  public static void main(String[] args) {
    try {
       Registry registry = LocateRegistry.createRegistry(5099);
       registry.rebind("CircleArea", (Remote) new CircleAreaImpl());
       System.out.println("server is ready");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
