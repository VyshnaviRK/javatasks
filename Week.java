public enum Week {

    MONDAY(1,"Monday"),TUESDAY(2,"Tuesday"),WEDNESDAY(3,"Wednesday"),THURSADY(4,"Thursday"),FRIDAY(5,"Friday"),SATURDAY(6,"Saturday"),
    SUNDAY(7,"Sunday");

    public int num;
    public String name;

    Week(int num,String name){

        this.num=num;
        this.name=name;
    }

    public int getNum(){

        return num;
    }

    public String getName(){

        return name;
    }

    public static void main(String[] args) {
        Week days = Week.valueOf(args[0]);

        switch (days){

            case MONDAY:

                System.out.println("Monday is lazy day:"+MONDAY.getNum());
                break;

            case TUESDAY:

                System.out.println("Tuesday is Hanuman day:"+TUESDAY.getNum());
                break;

            case WEDNESDAY:

                System.out.println("Wednesday is Ayyappa day:"+WEDNESDAY.getNum());
                break;

            case THURSADY:

                System.out.println("Thursday is Baba day:"+THURSADY.getNum());
                break;

            case FRIDAY:

                System.out.println("Friday is Laxmi day:"+FRIDAY.getNum());
                break;

            case SATURDAY:

                System.out.println("Saturday is Venkateswara Swamy  day:"+SATURDAY.getNum());
                break;

            case SUNDAY:

                System.out.println("Wednesday is  Holiday:"+SUNDAY.getNum());
                break;

                default:

                    System.out.println("No day is selected");
        }

    }

}
