 /*

Ajoutez des méthodes leur permettant d’envoyer des messages aux autres robots se trouvant dans l’arène. OK

Chaque robot possède une interface graphique à partir de laquelle il est possible de changer de position,
envoyer des messages vers d’autres robots, et afficher les messages reçus.

 */

 import java.util.ArrayList;

 public class Robot {

     private static String nom;
     ArrayList<Integer> coords;
     // La classe Robot permettant la représentation des robots qui possède un nom, ainsi qu’une position dans l’arène.

     private static boolean available = true; // Donne le statut d'un robot, disponible ou non





     public Robot(String nom, ArrayList<Integer> coords, boolean available){
         this.nom=nom;
         this.coords=coords;
         this.available=available;
     }

     public String getNom(){
         return this.nom;
     }

     private void move(ArrayList<Integer> newCoords){
         /**
          * Fonction permettant de modifer les coordonnées d'un robot, et donc de le déplacer
          */
         coords = newCoords;
     }

     private void sendMessage(Robot destinataire, String content){
         new Message(this,destinataire, content);
     }

     public void displayMessage(){
     }


}

