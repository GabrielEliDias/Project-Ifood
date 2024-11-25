package javafxapplication1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private Button button;

    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoSenha;

    @FXML
    private Label label;

    @FXML
    private Label textoLogin;

    @FXML
    private Label textoSenha;

    @FXML
    void fazerLogin(Usuario user) {
        if (campoLogin.getText() == "master" && campoSenha.getText() == "adm123") {
            
        }
    }

}
