package pro.sky.testshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.testshop.Services.CartService;

import java.util.List;

@RestController
@RequestMapping("/order/")
public class CartController {

    public CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("add")
    public boolean add(@RequestParam Integer...id) {
        return cartService.addToCart(id);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return cartService.getAllId();
    }

}