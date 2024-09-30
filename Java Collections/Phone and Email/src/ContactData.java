import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {
    private static final String phoneData = """
            """;
    private static final String emailData = """
            """;

    public static List<Contact> getData(String type){
        List<Contact> dataList = new ArrayList<>();
        Scanner scanner = new Scanner(type.equals("phone") ? phoneData : emailData);
        while(scanner.hasNext()){
            String[] data = scanner.next().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if(type.equals("phone")){
                dataList.add(new Contact(data[0], Long.parseLong(data[1])));
            }else if(type.equals("email")){
                dataList.add(new Contact(data[0], data[1]));
            }
        }

        return dataList;
    }
}
