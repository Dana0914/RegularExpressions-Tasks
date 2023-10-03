package regex;

public class StringTask1 {
    public static void main(String[] args) {
        String ip = "12.9.136.55";
        boolean codeMatch = ip.matches("\\d{1,2}\\.\\d\\.\\d{1,3}\\.\\d{1,2}");
        System.out.println(codeMatch);

        String phone = "+7 (702) 411-11-98";
        boolean phoneMatch = phone.matches("\\+\\d{0,1}\\s?\\(\\d{1,3}\\)\\s?\\d{1,3}\\-\\d{1,2}\\-\\d{1,2}");
        System.out.println(phoneMatch);

        String dateTime = "2023/01/23 14:35";
        boolean datetimeMatch = dateTime.matches("\\d{1,4}\\/\\d{1,2}\\/\\d{1,2}\\s?\\d{1,2}\\:\\d{1,2}");
        System.out.println(datetimeMatch);
    }
}
