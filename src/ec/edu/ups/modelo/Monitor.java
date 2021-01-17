/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.controladorCliente;
import ec.edu.ups.vista.VentanaPrincipal;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class Monitor implements Runnable {
   VentanaPrincipal ventana ;
   
    int clientes_max;
    int clientes;
    
     boolean cajero1;
    
    boolean cajero2;
    
    boolean cajero3;
    
     int clientesCola;
    
     int clientesFuera;
  

    public Monitor(VentanaPrincipal ventana) {
        
      cajero1= false;
      cajero2= false;
      cajero3=false;
      clientes=0;
      clientesCola=10;
      clientes_max=90;
      clientesFuera=0;
      
      this.ventana=ventana;
     ;
    }
    
     public synchronized void ingresoCajero1(){
         JLabel c =new javax.swing.JLabel();
     cajero1=true;
     clientesCola--;
     int  r = (int) (Math.random() * 3) + 1;
     if(r==1){
    ingresaDinero();
     }else if(r==2){
 retiraDinero();
     cajero1=false;
              clientesFuera++;
             
       c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconsP.png")));
       c.setBounds(-40, -40, 60,60);
       ventana.getPanelCola().add(c);
             
              
     }
     
      try{  
        Thread.sleep(4000);  
    }catch(InterruptedException e){  
    }
     cajero1=false;
     ventana.getPanelCola().remove(c);
             }
     public synchronized void ingresoCajero2(){
       JLabel c =new javax.swing.JLabel();

         cajero2=true;
     clientesCola--;
     int  r = (int) (Math.random() * 3) + 1;
     if(r==1){
     ingresaDinero();
     }else if(r==2){
     retiraDinero();  
     }
      try{  
        Thread.sleep(4000);  
    }catch(InterruptedException e){  
    }
     cajero2=false;
     clientesFuera++;
      c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconsP.png")));
       c.setBounds(-40, -40, 60,60);
       ventana.getPanelCola().add(c);
             
      }

      public synchronized void ingresoCajero3(){
           JLabel c =new javax.swing.JLabel();
          cajero3=true;
     clientesCola--;
     int  r = (int) (Math.random() * 3) + 1;
     if(r==1){
     ingresaDinero();
     }else if(r==2){
     retiraDinero();
     }
      try{  
        Thread.sleep(4000);  
    }catch(InterruptedException e){  
    }
     cajero3=false;
      clientesFuera++;
       c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconsP.png")));
       c.setBounds(-40, -40, 60,60);
       ventana.getPanelCola().add(c);
           
      }
       public void ingresaDinero(){
     
         int randomNumber = (int) (Math.random() * 4) + 1;
        switch (randomNumber) {
            case 1:
                ventana.getjTextArea1().setText("Cliente "+clientes+" ingresa 100 euros");
                break;
            case 2:
                ventana.getjTextArea1().setText("Cliente "+clientes+"ingresa 50 euros");
                break;
            case 3:
                ventana.getjTextArea1().setText("Cliente "+clientes+"ingresa 20 euros");
                break;
            default:
                break;
        }
          try{  
        Thread.sleep(3000);  
    }catch(InterruptedException e){  
    
    }
    }
    
    public void retiraDinero(){
      int randomNumber = (int) (Math.random() * 4) + 1;
        switch (randomNumber) {
            case 1:
                ventana.getjTextArea1().setText("Cliente "+clientes+" retira 100 euros");
                break;
            case 2:
                ventana.getjTextArea1().setText("Cliente "+clientes+"retira 50 euros");
                break;
            case 3:
                ventana.getjTextArea1().setText("Cliente "+clientes+"retira 20 euros");
                break;
            default:
                break;
        }
          try{  
        Thread.sleep(3000);  
    }catch(InterruptedException e){  
    
    }
    }
    @Override
    public void run() {
       
    }

    public int getClientes_max() {
        return clientes_max;
    }

    public void setClientes_max(int clientes_max) {
        this.clientes_max = clientes_max;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public int getClientesCola() {
        return clientesCola;
    }

    public void setClientesCola(int clientesCola) {
        this.clientesCola = clientesCola;
    }

    public int getClientesFuera() {
        return clientesFuera;
    }

    public void setClientesFuera(int clientesFuera) {
        this.clientesFuera = clientesFuera;
    }
    
}
