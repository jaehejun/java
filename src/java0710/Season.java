package java0710;

public class Season {
    enum Month { //Season 클래스 내부에 enum 선언
        JANUARY("Winter"), FEBRUARY("Winter"), MARCH("Spring"),
        APRIL("Spring"), MAY("Spring"), JUNE("Summer"),
        JULY("Summer"), AUGUST("Summer"), SEPTEMBER("Fall"),
        OCTOBER("Fall"), NOVEMBER("Fall"), DECEMBER("Winter");

        private final String season;

        Month(String season) {
            this.season = season;
        }

        public String getSeason() {
            return season;
        }
    }

    private Month currentMonth;

    public Season(Month currentMonth) {
        this.currentMonth = currentMonth;
    }

    public String getMonthInfo() {
        return currentMonth.name() + "--> " + currentMonth.getSeason();
    }

    public static void main(String[] args) {
        Season january = new Season(Month.JANUARY);
        Season june = new Season(Month.JUNE);
        System.out.println(january.getMonthInfo());
        System.out.println(june.getMonthInfo());
    }
}
