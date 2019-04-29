import java.util.ArrayList;
import java.util.Collection;

public class Message{

    private Robot envoyeur;
    private Robot destinataire;
    private String contenu;

    private Collection<MessageListener> MessageListeners = new ArrayList<>();

    public void resut


    public Message(Robot envoyeur,  Robot destinataire, String contenu) {
        this.envoyeur = envoyeur;
        this.destinataire = destinataire;
        this.contenu = contenu;
    }

    public String getContenu(){
        return this.contenu;
    }




    public void addMessageListener(MessageListener listener) {
        MessageListeners.add(listener);
    }

    public void removeMessageListener(MessageListener listener) {
        MessageListeners.remove(listener);
    }


}
