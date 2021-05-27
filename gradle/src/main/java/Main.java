import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().get().url("https://quotes.rest/qod?language=en").build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

                String result =response.body().string();
                System.out.println(result);
                JSONObject jsonObject = new JSONObject(result).getJSONObject("contents").getJSONArray("quotes").getJSONObject(0);
                JSONObject jsonObject1 = new JSONObject(result).getJSONObject("copyright");
                 String quotes1 = jsonObject.getString("quote");
                 String quotes2 = jsonObject.getString("date");
                int quotes3 = jsonObject1.getInt("year");
                System.out.println(quotes1);
                System.out.println(quotes2);
                System.out.println(quotes3);
            }
        });
    }
}
