module com.example.utolso {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.sql;
    requires org.hibernate.orm.core;


    opens application to javafx.fxml;
    exports application;
    exports controller;
    exports library;
    opens controller to javafx.fxml;
}