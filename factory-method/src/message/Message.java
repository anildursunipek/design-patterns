package message;

public abstract class Message {
    public abstract String getMessage();

    public void addDefaultHeader(){
        // Add some default headers
    }
    public void encrypt(){
        // some code...
    }
}
