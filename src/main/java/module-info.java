module dk.haliimo.mytunes {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.haliimo.mytunes to javafx.fxml;
    exports dk.haliimo.mytunes;
}