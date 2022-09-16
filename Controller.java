package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import sample.datamodel.TodoItem;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private ListView <TodoItem>listViewTodoItems ;

    @FXML
    private List<TodoItem> todoItems;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;





    public void initialize() {
        TodoItem item1 = new TodoItem("Mom's birthday",
                "buy a 53rd birthday card",
                LocalDate.of(2021, Month.SEPTEMBER,
                        30));

        TodoItem item2 = new TodoItem("Dad's birthday",
                "buy a 56th birthday card",
                LocalDate.of(2021, Month.NOVEMBER,
                        04));

        TodoItem item3 = new TodoItem("Laundry",
                "Finishing up the laundry",
                LocalDate.of(2021, Month.OCTOBER,
                        01));

        TodoItem item4 = new TodoItem("Airport Pickup",
                "Picking up Rebecas from the dfw airport",
                LocalDate.of(2021, Month.OCTOBER,
                        02));

        TodoItem item5 = new TodoItem("Setting up exam 1",
                "setting up exam for insy 4306 ",
                LocalDate.of(2021, Month.OCTOBER,
                        3));
        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        listViewTodoItems.getItems().setAll(todoItems);
        listViewTodoItems.getSelectionModel().
                setSelectionMode(SelectionMode.SINGLE);
    }
    @FXML
    public void handleClickListView(){
        TodoItem item =listViewTodoItems.getSelectionModel().getSelectedItem();
//        System.out.println("The selected item is " + item);
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDueDate().toString());

//        StringBuilder sb= new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due:");
//        sb.append(item.getDueDate().toString());
//        itemDetailsTextArea.setText(sb.toString());
    }

}


