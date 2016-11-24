package services;

import dao.MessagesDaoImpl;
import dao.interf.MessagesDao;
import entity.Messages;
import services.interf.MessagesService;

import java.util.ArrayList;

/**
 * Created by Alex on 20.11.2016.
 */
public class MessagesServiceImpl implements MessagesService{

    private MessagesDao messagesDao = new MessagesDaoImpl();

    @Override
    public ArrayList<Messages> getMessages(Integer id) {
        ArrayList<Messages> messages = messagesDao.getListMessages(id);
        if (messages != null) {
            return  messages;
        }
        return null;
    }
}
