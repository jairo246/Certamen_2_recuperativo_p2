package com.example.jairo.certamenrecuperativo_2;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jairo on 14-12-2016.
 */

public class BackGroundTask {

    Context context;
    ArrayList<Registro> arrayList = new ArrayList<>();

    public BackGroundTask(Context context){
        this.context = context;
    }

    public void getList(String json_url, final List<Registro> lista) {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,json_url,null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                int count= 0;
                while (count<response.length()){
                    try {
                        JSONObject jsonObject = response.getJSONObject(count);
                        Registro datos = new Registro(jsonObject.getString("id"),jsonObject.getString("joke"));
                        arrayList.add(datos);
                        count++;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        Toast.makeText(context, "Error1: " + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }

                lista.Arrays.asList(arrayList);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
    }

}
