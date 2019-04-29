 /*

Elle joue aussi un rôle dans la communication, car tous les messages passent par cette classe Flotte.
    Càd : quand un message est créé, il est capté par la classe flotte, car il est listener de Message


Elle a aussi une interface graphique, qui affiche tous les robots disponibles, avec leur position.

Elle permet d’afficher les communications échangées : lors de la réception d’un message de la part d’un robot,
ce message est retransmis aux autres robots.

 */

 import java.util.ArrayList;

 public class Flotte implements MessageListener{

    ArrayList<Robot> flotte = new ArrayList<>();


    private void addRobot(Robot robot){
        flotte.add(robot);
    }

    private void removeRobot(Robot robot){
        flotte.remove(robot);
    }



    //    Elle joue aussi un rôle dans la communication, car tous les messages passent par cette classe Flotte.
    //    Càd : quand un message est créé, il est capté par la classe flotte, car il est listener de Message

    @Override
     public void onMessage(Message message){
        // Lorsqu'un message est envoyé, il est envoyé à tout le monde
        for (int i = 0; i < flotte.size(); i++)
            new Message(flotte[i].getNom(),message.getContenu());

    }




}
