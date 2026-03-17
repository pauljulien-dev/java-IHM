package modele;

import java.util.Calendar;

public class  DateCalendrier extends Date implements Comparable<Date> {
    private int chJourSemaine;

    public DateCalendrier(int jour, int mois, int annee) {
        super(jour, mois, annee);
        Calendar cal = Calendar.getInstance();
        cal.set(annee, mois - 1, jour);
        int DayWeek = cal.get(Calendar.DAY_OF_WEEK);
        chJourSemaine = DayWeek - 1;
        if (chJourSemaine == 0) {
            chJourSemaine = 7;

        }
    }

    public DateCalendrier() {
        super();
        Calendar cal = Calendar.getInstance();
        chAnnee = cal.get(Calendar.YEAR);
        chMois = cal.get(Calendar.MONTH) + 1;
        chJour = cal.get(Calendar.DAY_OF_MONTH);
        int DayWeek = cal.get(Calendar.DAY_OF_WEEK);
        chJourSemaine = DayWeek - 1;
        if (chJourSemaine == 0) {
            chJourSemaine = 7;
        }
    }


    @Override
    public int compareTo(Date date) {
        return super.compareTo(date);
    }

    public int compareTo(DateCalendrier date) {
        return super.compareTo(date);
    }

    public String toString() {
        return ConstantesCalendrier.Jours.values()[chJourSemaine - 1].toString() + " " + chJour + " " +  ConstantesCalendrier.Mois.values()[chMois - 1].toString() + " " +  chAnnee;
    }
}
