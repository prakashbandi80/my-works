import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

public class CarRental {
    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {

       Long minDate = 0l;
        for(RentalTime t: rentalTimes){
            if(t.getEnd().getTime() < t.getStart().getTime())
                return false;
            if(t.getEnd().getTime() < minDate)
                return false;
            minDate = t.getEnd().getTime();
        }

       return true;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");


        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:50"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:31"), sdf.parse("03/05/2020 22:50")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));
    }
}

class RentalTime {
    private Date start, end;

    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}


/*
*
*
*
* */