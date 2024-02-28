package in.succinct.bpp.shopify.adaptor;

import com.venky.swf.plugins.background.core.Task;

import java.util.HashMap;
import java.util.Map;

public class ECommerceCustomizer implements Task {
    ECommerceSDK sdk;
    public ECommerceCustomizer(ECommerceSDK sdk){
        this.sdk = sdk;
    }
    @Override
    public void execute() {
        Map<String,Map<String,Map<String,String>>> map = new HashMap<>(){{
            put("location",new HashMap<>(){{
                put("lat", new HashMap<>(){{
                    put("type",double.class.getName());
                }});
                put("lng", new HashMap<>(){{
                    put("type",double.class.getName());
                }});
                put("enabled", new HashMap<>(){{
                    put("type",boolean.class.getName());
                }});
            }});
            put("order",new HashMap<>(){{
                put("cod", new HashMap<>(){{
                    put("type",boolean.class.getName());
                }});
                put("settled", new HashMap<>(){{
                    put("type",boolean.class.getName());
                }});
                put("picked_up", new HashMap<>(){{
                    put("type",boolean.class.getName());
                }});
                put("invoice_url", new HashMap<>(){{
                    put("type",String.class.getName());
                }});
                put("tracking_url", new HashMap<>(){{
                    put("type",String.class.getName());
                }});
                put("settled_amount", new HashMap<>(){{
                    put("type",double.class.getName());
                }});
            }});
        }};


    }

}
