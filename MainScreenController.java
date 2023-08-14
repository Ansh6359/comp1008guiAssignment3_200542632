//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *  class serves as the controller for the main screen UI.
 */
public class MainScreenController {
    // FXML elements injected from the UI
    @FXML
    private Button addButton;
    @FXML
    private Rectangle desk1;  /** this is desk 1 to 9  */
    @FXML
    private Rectangle desk2;
    @FXML
    private Rectangle desk3;
    @FXML
    private Rectangle desk4;
    @FXML
    private Rectangle desk5;
    @FXML
    private Rectangle desk6;
    @FXML
    private Rectangle desk7;
    @FXML
    private Rectangle desk8;
    @FXML
    private Rectangle desk9;
    @FXML
    private Label errorMessage;
    @FXML
    private Label name1Label;
    @FXML
    private Label name2Label;
    @FXML
    private Label name3Label;
    @FXML
    private Label name4Label;
    @FXML
    private Label name5Label;
    @FXML
    private Label name6Label;
    @FXML
    private Label name7Label;
    @FXML
    private Label name8Label;
    @FXML
    private Label name9Label;
    @FXML
    private TextField studentNameField;
    @FXML
    private ColorPicker colorPicker;

    /**
     * Constructor for the MainScreenController class.
     */
    public MainScreenController() {
    }

    /**
     * Initializes the UI components after they are loaded.
     * Sets default values and clears any existing errors.
     */
    @FXML
    public void initialize() {
        // Set the initial value of the color picker to white
        this.colorPicker.setValue(Color.WHITE);
        // Clear any previous error messages
        this.errorMessage.setText("");
    }

    /**
     * Event handler for the "Add Student" button click.
     * Handles the process of adding a new student to a desk.
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void onAddButtonClick(ActionEvent event) {
        // Retrieve the name of the student entered by the user
        String studentName = this.studentNameField.getText();

        // Lists to hold UI elements and data
        ArrayList<Label> studentNameLabels = new ArrayList<>();
        ArrayList<Rectangle> studentDesks = new ArrayList<>();
        Set<Color> assignedDesks = new HashSet<>();
        Set<Label> assignedNames = new HashSet<>();
        Set<Color> usedColors = new HashSet<>();

        // Populate the lists with UI elements
        studentNameLabels.add(this.name1Label);
        studentNameLabels.add(this.name2Label);
        studentNameLabels.add(this.name3Label);
        studentNameLabels.add(this.name4Label);
        studentNameLabels.add(this.name5Label);
        studentNameLabels.add(this.name6Label);
        studentNameLabels.add(this.name7Label);
        studentNameLabels.add(this.name8Label);
        studentNameLabels.add(this.name9Label);

        studentDesks.add(this.desk1);
        studentDesks.add(this.desk2);
        studentDesks.add(this.desk3);
        studentDesks.add(this.desk4);
        studentDesks.add(this.desk5);
        studentDesks.add(this.desk6);
        studentDesks.add(this.desk7);
        studentDesks.add(this.desk8);
        studentDesks.add(this.desk9);

        // Retrieve the color selected by the user
        Color selectedColor = this.colorPicker.getValue();

        // Error handling and validation logic for student addition
        if (selectedColor == null) {
            this.errorMessage.setText("ERROR: You did not choose any color");
        } else if (this.studentNameField.getText().trim().isEmpty()) {
            this.errorMessage.setText("ERROR: Student name field cannot be blank");
        } else if (this.studentNameField.getText().trim().length() < 3) {
            this.errorMessage.setText("ERROR: Student name must be at least three characters");
        } else {
            // ... (rest of the validation and addition logic)
        }
    }
}


    @FXML
    public void initialize() {
        this.pColor.setValue(Color.WHITE);
        this.pColor.setValue((Object)null);
        this.error.setText("");
    }

    @FXML
    public void onAddStudentClick(ActionEvent event) {
        String studentName = this.sName.getText();
        ArrayList<Label> studentNameLabels = new ArrayList();
        ArrayList<Rectangle> studentDeskBoxes = new ArrayList();
        Set<Color> assignedDesks = new HashSet();
        Set<Label> assignedNames = new HashSet();
        Set<Color> usedColors = new HashSet();
        studentNameLabels.add(this.name1);
        studentNameLabels.add(this.name2);
        studentNameLabels.add(this.name3);
        studentNameLabels.add(this.name4);
        studentNameLabels.add(this.name5);
        studentNameLabels.add(this.name6);
        studentNameLabels.add(this.name7);
        studentNameLabels.add(this.name8);
        studentNameLabels.add(this.name9);
        studentDeskBoxes.add(this.box1);
        studentDeskBoxes.add(this.box2);
        studentDeskBoxes.add(this.box3);
        studentDeskBoxes.add(this.box4);
        studentDeskBoxes.add(this.box5);
        studentDeskBoxes.add(this.box6);
        studentDeskBoxes.add(this.box7);
        studentDeskBoxes.add(this.box8);
        studentDeskBoxes.add(this.box9);
        Color selectedColor = (Color)this.pColor.getValue();
        if (selectedColor == null) {
            this.error.setText("ERROR:You did not choose any color");
        } else if (this.sName.getText().trim().isEmpty()) {
            this.error.setText("ERROR: Student name field cannot be blank");
        } else if (this.sName.getText().trim().length() < 3) {
            this.error.setText("ERROR: Student name must be at least three characters");
        } else {
            int numStudents;
            for(numStudents = 0; numStudents < studentNameLabels.size(); ++numStudents) {
                this.error.setText("");
                if (((Label)studentNameLabels.get(numStudents)).getText().equals(studentName)) {
                    this.error.setText("ERROR: Student name ' " + studentName + " ' already exists.");
                    return;
                }
            }

            for(numStudents = 0; numStudents < studentNameLabels.size(); ++numStudents) {
                if (((Label)studentNameLabels.get(numStudents)).getText().isEmpty()) {
                    assignedNames.add((Label)studentNameLabels.get(numStudents));
                    usedColors.add((Color)((Rectangle)studentDeskBoxes.get(numStudents)).getFill());
                } else {
                    if (((Label)studentNameLabels.get(numStudents)).getText().equals(studentName)) {
                        return;
                    }

                    assignedDesks.add((Color)((Rectangle)studentDeskBoxes.get(numStudents)).getFill());
                    usedColors.add((Color)((Rectangle)studentDeskBoxes.get(numStudents)).getFill());
                }
            }

            if (!assignedNames.isEmpty()) {
                if (usedColors.contains(selectedColor)) {
                    this.error.setText("ERROR: White can not be Chosen");
                    return;
                }

                Random random = new Random();
                Label randomLabel = (Label)assignedNames.stream().skip((long)random.nextInt(assignedNames.size())).findFirst().orElse((Object)null);
                if (randomLabel != null) {
                    randomLabel.setText(studentName);
                    assignedNames.add(randomLabel);
                }

                int assignedLabelIndex = studentNameLabels.indexOf(randomLabel);
                Rectangle emptyDesk = (Rectangle)studentDeskBoxes.get(assignedLabelIndex);
                emptyDesk.setFill(selectedColor);
                assignedDesks.add(selectedColor);
            }

            numStudents = 0;

            for(int i = 0; i < studentNameLabels.size(); ++i) {
                if (!((Label)studentNameLabels.get(i)).getText().isEmpty()) {
                    ++numStudents;
                }
            }

            if (numStudents >= 9) {
                this.error.setText("The class is full!");
                this.error.setTextFill(Color.GREEN);
                this.pColor.setValue(Color.WHITE);
            }
        }
    }
}
