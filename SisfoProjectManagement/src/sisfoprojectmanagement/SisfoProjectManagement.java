/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfoprojectmanagement;

import controller.ControllerLogin;

/**
 *
 * @author skday
 */
public class SisfoProjectManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aplikasi App = new Aplikasi();
        Serialization sr = new Serialization();
        App.setListOrang(sr.deserializeList());
        //App.mainMenu();
        //sr.serializeList(App.getListOrang());
      
        new ControllerLogin(App);
    }
    
}