/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author rcarreraamoedo
 */
public class Aves implements IPodeVoar,IPodeCaminar {

    @Override
    public void Voar() {
         System.out.println("Puedo Volar,ave");
    }

    @Override
    public void Caminar() {
        System.out.println("Puedo caminar, ave");
    }
    
}
