package data;
import model.TODO;

import java.util.Arrays;
import java.util.stream.Stream;

public class TodoItems {
    private static TODO[] ItemsTodo= new TODO[0];

    public int size(){
        return ItemsTodo.length;
    }
    public TODO[] findAll(){
        return ItemsTodo;
    }
    public TODO[] findById(int todoId){
        return ItemsTodo ;
    }
    public void addTodo(TODO todoItem){
        TODO[] newTodoArray= Arrays.copyOf(ItemsTodo, ItemsTodo.length +1);
        newTodoArray[newTodoArray.length -1]= todoItem;
        ItemsTodo=newTodoArray;
    }
    public void clear(){
        ItemsTodo = null;
    }
    public Stream<TODO> findByDoneStatus(boolean doneStatus){
        return Arrays.stream(ItemsTodo).filter(TODO::isDone);
    }



}
