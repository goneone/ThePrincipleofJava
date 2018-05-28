package example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class generateJsonExample2 {
	public static void main(String[] args) {
		JSONArray workerArray = new JSONArray();

		JSONObject workerInfo = new JSONObject();

		workerInfo.put("name", "강하나");
		workerInfo.put("age", "28");
		workerArray.add(workerInfo);

		workerInfo = new JSONObject();
		workerInfo.put("name", "강두나");
		workerInfo.put("age", "25");
		workerArray.add(workerInfo);

		// person, location 두개로 나눠서 담기위해서 생성
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("persons", workerArray);

		JSONArray locationArray = new JSONArray();
		JSONObject locationInfo = new JSONObject();

		locationInfo.put("name", "삼성에스원");
		locationInfo.put("location", "서울특별시");
		locationArray.add(locationInfo);

		locationInfo = new JSONObject();
		locationInfo.put("name", "본사");
		locationInfo.put("location", "성남 - 미금");
		locationArray.add(locationInfo);
		jsonObject.put("location", locationArray);

		String jsonInfo = jsonObject.toJSONString();
		System.out.print(jsonObject);
	}
}
