package example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class generateJsonExample2 {
	public static void main(String[] args) {
		JSONArray workerArray = new JSONArray();

		JSONObject workerInfo = new JSONObject();

		workerInfo.put("name", "���ϳ�");
		workerInfo.put("age", "28");
		workerArray.add(workerInfo);

		workerInfo = new JSONObject();
		workerInfo.put("name", "���γ�");
		workerInfo.put("age", "25");
		workerArray.add(workerInfo);

		// person, location �ΰ��� ������ ������ؼ� ����
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("persons", workerArray);

		JSONArray locationArray = new JSONArray();
		JSONObject locationInfo = new JSONObject();

		locationInfo.put("name", "�Ｚ������");
		locationInfo.put("location", "����Ư����");
		locationArray.add(locationInfo);

		locationInfo = new JSONObject();
		locationInfo.put("name", "����");
		locationInfo.put("location", "���� - �̱�");
		locationArray.add(locationInfo);
		jsonObject.put("location", locationArray);

		String jsonInfo = jsonObject.toJSONString();
		System.out.print(jsonObject);
	}
}
