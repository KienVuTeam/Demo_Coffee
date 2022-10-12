module com.appvn.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.appvn.mavenproject2 to javafx.fxml;
    exports com.appvn.mavenproject2;
}
