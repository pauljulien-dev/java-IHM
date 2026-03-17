package modele;

import java.util.Scanner;

public class Date {
    protected int chJour;
    protected int chMois;
    protected int chAnnee;

    public Date(int jour, int mois, int annee) {
        chJour = jour;
        chMois = mois;
        chAnnee = annee;
    }

    public Date(int annee) {
        chJour = 1;
        chMois = 1;
        chAnnee = annee;
    }

    public Date() {
        chJour = 1;
        chMois = 1;
        chAnnee = 1;
    }

    public static Date lireDate() {
        System.out.println("Entrez votre jour: ");
        Scanner sc = new Scanner(System.in);
        int jour = sc.nextInt();
        int mois = sc.nextInt();
        int annee = sc.nextInt();
        return new Date(jour, mois, annee);
    }

    public boolean estValide() {
        if (chJour < 0) {
            return false;
        }
        if (chMois <= 0 || chMois > 12) {
            return false;
        }
        return (chJour <= dernierJour());
    }

    public static boolean estValide(int jour, int mois, int annee) {
        if (jour < 0) {
            return false;
        }
        if (mois <= 0 || mois > 12) {
            return false;
        }
        return (jour <= dernierJour(mois, annee));
    }

    public int dernierJour() {
        switch (chMois) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (estBissextile()) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    public static int dernierJour(int mois, int annee) {
        switch (mois) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (estBissextile(annee)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    public boolean estBissextile() {
        return ((chAnnee % 400 == 0) || ((chAnnee % 100 != 0) && (chAnnee % 4 == 0)));
    }

    public static boolean estBissextile(int annee) {
        return ((annee % 400 == 0) || ((annee % 100 != 0) && (annee % 4 == 0)));
    }

    public int compareTo(Date compareDate) {
        return (chAnnee * 1000) - (compareDate.chAnnee * 1000) + (chMois * 50) - (compareDate.chMois * 50) + chJour - compareDate.chJour;
    }

    public String toString() {
        return chJour + "/" + chMois + "/" + chAnnee;
    }

    public Date dateDuLendemain (){
        if (!estValide(chJour,chMois,chAnnee)) {
            System.out.println("la date n'est pas valide");
            return null;
        }
        if (dernierJour(chAnnee, chMois) == chJour) {
            if (chMois == 12) {
                return new Date(0, 0, chAnnee + 1);
            }
            else return new Date(0, chMois + 1, chAnnee);
        }
        return new Date(chJour+1, chMois, chAnnee);
    }

}
