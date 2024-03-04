module sio.tp1bis_javafon {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.tp1bis_javafon to javafx.fxml;
    exports sio.tp1bis_javafon;
}