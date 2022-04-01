public enum enumEx {
    SUMMER,SRING,RAIN,WINTER,AUTUMN;
}
class season{
    public static void main(String[] args) {
        enumEx[] e = enumEx.values();
        for (enumEx enumEx2 : e) {
            System.out.println(enumEx2);
        }

        enumEx e1  = enumEx.AUTUMN;
        switch (e1) {
            case SUMMER:
                System.out.println(" it is SUMMER");
                break;
            case SRING:
                System.out.println(" it is SRING");
                break;
            case RAIN:System.out.println(" it is RAIN");
                 break;
            case WINTER:
                System.out.println(" it is WINTER");
                break;
            case AUTUMN:
                System.out.println(" it is AUTUMN");
                break;
            default:
                System.out.println("Not a valid season");
                break;
        }
    }
}