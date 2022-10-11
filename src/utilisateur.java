import java.io.*;


class utilisateur implements Serializable {
    public String nom , prenom , user , mdp , num;
     public utilisateur (String nom , String prenom , String user , String mdp , String num){
         this.nom = nom;
         this.prenom = prenom;
         this.user = user;
         this.mdp = mdp;
         this.num = num ;
     }
}

class endoffile implements Serializable {

}
