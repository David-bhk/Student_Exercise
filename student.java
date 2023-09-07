package student_Excercise;
import java.util.*;
public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creer deux arrays(nom et points) pour stocker les infos des etudiants
        String[] nom;
        double[] points;

        while (true){
            System.out.println("Entrez le numero de l'Etudiant: ");
            int numEtudiants = scanner.nextInt();

            scanner.nextLine();// pour consommer la ligne suivante et eviter la perte de donnees.

            if (numEtudiants == 0){
                break;// pour terminer le program lorsque l'utilisateur tape 0
            }

            nom = new String[numEtudiants];
            points= new double[numEtudiants];

            //prendre les infos de chaque etudiants

            for (int i = 0; i <numEtudiants ; i++) {
                System.out.println("Entrez le nom de l'Etudiant" +(i+1)+": ");
                nom[i] = scanner.next();
                System.out.println("Entrez les points de l'Etudiant"+ nom[i]+": ");
                points[i] = scanner.nextDouble();

            }

            // tracer le tableau visuel
            System.out.println("----------------------------------------");
            System.out.printf("%-15s %-10s %-10s%n", "Nom", "Points", "Mention");
            System.out.println("----------------------------------------");
            for (int i = 0; i < numEtudiants ; i++) {
                String mention = getMention(points[i]);
                System.out.printf("%-15s %-10.2f %-10s%n", nom[i], points[i], mention);
            }
            System.out.println("----------------------------------------");
        }
        //arreter le scanner

        scanner.close();
     }
    //avant d'executer la loop apres le tableau, il faut definir la method qui va contenir la condition de la mention
    private static String getMention(double point){
        if (point>=16){
            return "Excellent";
        }else if (point >= 14){
            return "Tres bien";
        }else if (point >= 12){
            return "Bien";
        }else if (point >= 10){
            return "Assez Bien";
        }else{
            return "Echec";
        }
    }
}
