package itesm.mobilestore711;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jcisneros77 on 4/22/17.
 */

public class ProductsRequest extends StringRequest{
    private static final String request_url = "https://mobilestore711.herokuapp.com/api/product_stores/get_products_from_store";
    private Map<String,String> params;

    public ProductsRequest(String store_id, Response.Listener<String> listener, Response.ErrorListener errorListener){
        super(Method.POST,request_url,listener,errorListener);
        params = new HashMap<>();
        params.put("store_id",store_id);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
