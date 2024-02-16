module com.cha.userlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cha.userlogin to javafx.fxml;
    exports com.cha.userlogin;
}