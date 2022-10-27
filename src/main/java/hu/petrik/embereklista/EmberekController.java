package hu.petrik.embereklista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class EmberekController {
    @FXML
    private ListView<Ember> emberek;

    @FXML
    private void initialize(){
        Ember e1 = new Ember("Gipsz Jakab",25);
        Ember e2 = new Ember("Teszt Elek",52);
        Ember e3 = new Ember("Szabolcsi Károly",11);
        this.emberek.getItems().add(e1);
        this.emberek.getItems().add(e2);
        this.emberek.getItems().add(e3);
    }
   }