import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainFormController {

    public TextField txtInput;

    public void num1OnAction(MouseEvent mouseEvent) {
        setNumber(1);
    }

    public void num2OnAction(MouseEvent mouseEvent) {
        setNumber(2);
    }

    public void num3OnAction(MouseEvent mouseEvent) {
        setNumber(3);
    }

    public void num4OnAction(MouseEvent mouseEvent) {
        setNumber(4);
    }

    public void num5OnAction(MouseEvent mouseEvent) {
        setNumber(5);
    }

    public void num6OnAction(MouseEvent mouseEvent) {
        setNumber(6);
    }

    public void num7OnAction(MouseEvent mouseEvent) {
        setNumber(7);
    }

    public void num8OnAction(MouseEvent mouseEvent) {
        setNumber(8);
    }

    public void num9OnAction(MouseEvent mouseEvent) {
        setNumber(9);
    }

    public void num0OnAction(MouseEvent mouseEvent) {
        setNumber(0);
    }

    public void sumOnAction(MouseEvent mouseEvent) {
    }

    public void subOnAction(MouseEvent mouseEvent) {
    }

    public void numEQOnAction(MouseEvent mouseEvent) {
    }

    public void devOnAction(MouseEvent mouseEvent) {
    }

    public void mulOnAction(MouseEvent mouseEvent) {
    }
    private void setNumber(int number){
        //txtInput.setText(number+"");
        txtInput.setText(txtInput.getText()+(number));

    }
}