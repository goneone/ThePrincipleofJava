package example;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class JsonParserTest {
 
    public static void main(String[] args) {
 
        //JSON ������
        String jsonInfo = "{\"books\":[{\"genre\":\"�Ҽ�\",\"price\":\"100\",\"name\":\"����� �������� ��°�?\",\"writer\":\"�罺����\",\"publisher\":\"�罺���� ���ǻ�\"},{\"genre\":\"�Ҽ�\",\"price\":\"300\",\"name\":\"ȫ�浿��\",\"writer\":\"���\",\"publisher\":\"��� ���ǻ�\"},{\"genre\":\"�Ҽ�\",\"price\":\"900\",\"name\":\"���������\",\"writer\":\"���丣 ����\",\"publisher\":\"���丣 ���� ���ǻ�\"}],\"persons\":[{\"nickname\":\"���ùμ�\",\"age\":\"25\",\"name\":\"�۰�ȣ\",\"gender\":\"����\"},{\"nickname\":\"������\",\"age\":\"21\",\"name\":\"������\",\"gender\":\"����\"}]}";
 
        /*
        {ȿ
            "books": [
                {
                    "genre": "�Ҽ�",
                    "price": "100",
                    "name": "����� �������� ��°�?",
                    "writer": "�罺����",
                    "publisher": "�罺���� ���ǻ�"
                },
                {
                    "genre": "�Ҽ�",
                    "price": "300",
                    "name": "ȫ�浿��",
                    "writer": "���",
                    "publisher": "��� ���ǻ�"
                },
                {
                    "genre": "�Ҽ�",
                    "price": "900",
                    "name": "���������",
                    "writer": "���丣 ����",
                    "publisher": "���丣 ���� ���ǻ�"
                }
            ],
            "persons": [
                {
                    "nickname": "���ùμ�",
                    "age": "25",
                    "name": "�۰�ȣ",
                    "gender": "����"
                },
                {
                    "nickname": "������",
                    "age": "21",
                    "name": "������",
                    "gender": "����"
                }
            ]
        }
         */
 
        try {
 
            JSONParser jsonParser = new JSONParser();
             
            //JSON�����͸� �־� JSON Object �� ����� �ش�.
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonInfo);
             
            //books�� �迭�� ����
            JSONArray bookInfoArray = (JSONArray) jsonObject.get("books");
 
            System.out.println("* BOOKS *");
 
            for(int i=0; i<bookInfoArray.size(); i++){
 
                System.out.println("=BOOK_"+i+" ===========================================");
                 
                //�迭 �ȿ� �ִ°͵� JSON���� �̱� ������ JSON Object �� ����
                JSONObject bookObject = (JSONObject) bookInfoArray.get(i);
                 
                //JSON name���� ����
                System.out.println("bookInfo: name==>"+bookObject.get("name"));
                System.out.println("bookInfo: writer==>"+bookObject.get("writer"));
                System.out.println("bookInfo: price==>"+bookObject.get("price"));
                System.out.println("bookInfo: genre==>"+bookObject.get("genre"));
                System.out.println("bookInfo: publisher==>"+bookObject.get("publisher"));
 
            }
 
            JSONArray personInfoArray = (JSONArray) jsonObject.get("persons");
 
            System.out.println("\r\n* PERSONS *");
 
            for(int i=0; i<personInfoArray.size(); i++){
 
                System.out.println("=PERSON_"+i+" ===========================================");
                JSONObject personObject = (JSONObject) personInfoArray.get(i);
                System.out.println("personInfo: name==>"+personObject.get("name"));
                System.out.println("personInfo: age==>"+personObject.get("age"));
                System.out.println("personInfo: gender==>"+personObject.get("gender"));
                System.out.println("personInfo: nickname==>"+personObject.get("nickname"));
 
            }
 
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
 
}