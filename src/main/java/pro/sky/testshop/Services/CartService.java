package pro.sky.testshop.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Service
public class CartService {
    private List<Integer> shoppingList = new ArrayList<>();

    public boolean addToCart(Integer...id) {
        if (id.length > 0) {
            for (int i = 0; i < id.length; i++) {
                if (id != null) {
                    shoppingList.add(id[i]);
                }
            }
        }
        return true;
    }

    public List<Integer> getAllId() {
        return new ArrayList<>(shoppingList);
    }
}
