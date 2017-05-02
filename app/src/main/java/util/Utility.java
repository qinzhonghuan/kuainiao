package util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import db.Goods;

/**
 * Created by 73773 on 2017/5/2.
 */

public class Utility {
    public static boolean handleGoodsResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allGoods = new JSONArray(response);
                for (int i = 0; i < allGoods.length(); i++) {
                    JSONObject goodsObject = allGoods.getJSONObject(i);
                    Goods goods=new Goods();
                    goods.setOrderCode(goodsObject.getString("orderCode"));
                    goods.setShipperCode(goodsObject.getString("shipperCode"));
                    goods.setLogisticCode(goodsObject.getString("logisticCode"));
                    goods.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

}
