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
    public class Mamifero implements IPodeCaminar,IPodeVoar,IPodeNadar {

    @Override
    public void Voar() {
         System.out.println("Puedo Volar, mamifero");
    }

    @Override
    public void Caminar() {
        System.out.println("Puedo Caminar, mamifero");
    }

    @Override
    public void Nadar() {
        System.out.println("Puedo Nada, Mamifero");
    }
}
