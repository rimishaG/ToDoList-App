package sample.datamodel;
import java.time.LocalDate;

public class TodoItem {
    private String shortDescription;
    private String details;
    private LocalDate dueDate;

//    Constructor
    public TodoItem(String shortDescription, String details, LocalDate dueDate) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.dueDate = dueDate;
    }
//    Getter
    public String getShortDescription()
    {
        return shortDescription;
    }

    public String getDetails()
    {
        return details;
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }
//    Setter
    public void setShortDescription(String shortDescription)
    {
        this.shortDescription = shortDescription;
    }
    public void setDetails(String details)
    {
        this.details = details;
    }
    public void setDueDate(LocalDate dueDate)
    {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return shortDescription;
    }

}
