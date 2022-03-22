public class stringExample {
    public static void main(String[] args) {
        String str = "Good Morning to everyone present";

        System.out.println(str.length());
        System.out.println(str.charAt(6));
        System.out.println(str.substring(6, 12));
        System.out.println(str.equals("Good"));
        System.out.println(str.equals("Good Morning to everyone present"));
        String[] s1 = str.split(" ");
        for(int i =0 ;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }
        String s2 = str.concat(" here");
        System.out.println(s2);
        System.out.println(str.indexOf("i"));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.contains("g to e"));
        System.out.println(str.startsWith("Go"));
        System.out.println(str.endsWith("present"));
        System.out.println(str.equalsIgnoreCase("good morning to everyone present"));
        String s3 = str.replace("everyone","each of you");
        System.out.println(s3);
    }
}
