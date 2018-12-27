package fr.peaks.my_e_market.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnStatus {

    int errorCode = 0;
    List<String> messages;

    public void addMessage(String message){
       if(messages==null)
           messages = new ArrayList<>();
       messages.add(message);
    }

    public int size(){
        if(messages!=null)
            return messages.size();
        else
            return 0;
    }
}
