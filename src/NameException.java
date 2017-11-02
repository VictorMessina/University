/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Messina
 */
class NameException extends Exception {
    private String name;

    public NameException(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NameException{" + "name=" + name + '}';
    }
    
}
