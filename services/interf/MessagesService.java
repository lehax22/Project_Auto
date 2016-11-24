package services.interf;

import entity.Messages;

import java.util.ArrayList;

/**
 * Created by Alex on 20.11.2016.
 */
public interface MessagesService {

    ArrayList<Messages> getMessages(Integer id);
}
