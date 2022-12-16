package com.project.pbo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerLoginDulu {
    @FXML
    private Button button_milihayam, button_milihanjing, button_milihreptil, button_milihkucing, button_pulangdulu;
    @FXML
    void milihanjing(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitAnjing.fxml"));
        Stage window = (Stage) button_milihanjing.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void milihayam(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitAyam.fxml"));
        Stage window = (Stage) button_milihayam.getScene().getWindow();
        window.setScene(new Scene(root));
        }
    @FXML
    void milihreptil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitReptil.fxml"));
        Stage window = (Stage) button_milihreptil.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void milihkucing(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KonsultasiSakitKucing.fxml"));
        Stage window = (Stage) button_milihkucing.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    @FXML
    void pulangdoeloe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage window = (Stage) button_pulangdulu.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}