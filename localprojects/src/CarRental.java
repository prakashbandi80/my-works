import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CarRental {
    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {

        /*
        * box1 - Prakash index = 0
        * box2 - Sredevi index = 1
        * box3 - Pradeep index = 2
        * box4 - Prathap index = 3
        *
        *
        * */



       Boolean scheduleAll = false;
        for(RentalTime t: rentalTimes){
            if(t.getStart().getTime() < t.getEnd().getTime()){
                scheduleAll = true;
            }

        }

       return scheduleAll;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");


        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

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