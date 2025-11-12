public class TimeCalc {
    public static void main(String[] args) {
        String timeStr = args[0];
        String minutesStr = args[1];
        int minutesToAdd = Integer.parseInt(minutesStr);

        int colonPos = timeStr.indexOf(':');
        String hhStr = timeStr.substring(0, colonPos);
        String mmStr = timeStr.substring(colonPos + 1);

        int hours = Integer.parseInt(hhStr);
        int minutes = Integer.parseInt(mmStr);

        int totalMinutes = hours * 60 + minutes + minutesToAdd;

        int minutesInDay = 24 * 60;
        int newTotal = totalMinutes % minutesInDay;

        int newHours = newTotal / 60;
        int newMinutes = newTotal % 60;

        if (newHours < 10) {
            System.out.print("0");
        }
        System.out.print(newHours);
        System.out.print(":");
        if (newMinutes < 10) {
            System.out.print("0");
        }
        System.out.print(newMinutes);

    }
}
