package hospitalmanagementsystem;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
/**
 *
 * @author memir
 */
public class FXMLDocumentController implements Initializable { 
    @FXML
    private CheckBox login_checkBox;
    @FXML
    private AnchorPane login_form;
    @FXML
    private Button login_loginBtn;
    @FXML
    private PasswordField login_passwoed;
    @FXML
    private Hyperlink login_registerHere;
    @FXML
    private TextField login_showPassword;
    @FXML
    private TextField login_userName;
    @FXML
    private ComboBox<?> loginusers;
    @FXML
    private AnchorPane main_form;
    @FXML
    private CheckBox register_checkBox;
    @FXML
    private AnchorPane register_form;
    @FXML
    private Hyperlink register_loginHere;
    @FXML
    private TextField register_mail;
    @FXML
    private PasswordField register_password;
    @FXML
    private TextField register_showPassword;
    @FXML
    private Button register_singupBtn;
    @FXML
    private TextField register_userName;
  
    public void switchForm(ActionEvent event){
        if(event.getSource() == login_registerHere){
            login_form.setVisible(false);
            register_form.setVisible(true);
        }else if(event.getSource() == register_loginHere){
            login_form.setVisible(true);
            register_form.setVisible(false);
        }
    }   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
