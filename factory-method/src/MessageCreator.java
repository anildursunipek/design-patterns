import message.Message;

public abstract class MessageCreator {
    public Message getMessage(){
        Message msg = createMessage();

        msg.addDefaultHeader();
        msg.encrypt();
        return msg;
    }

    // Factory Method
    public abstract Message createMessage();
}
