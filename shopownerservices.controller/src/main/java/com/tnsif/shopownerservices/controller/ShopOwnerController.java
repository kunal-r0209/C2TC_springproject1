package com.tnsif.shopownerservices.controller;

public class ShopOwnerController {
	@Autowired
    private ShopOwnerService service;

    @GetMapping
    public List<ShopOwner> getAll() {
        return service.getAllShopOwners();
    }

    @GetMapping("/{id}")
    public ShopOwner getById(@PathVariable Long id) {
        return service.getShopOwnerById(id);
    }

    @PostMapping
    public ShopOwner create(@RequestBody ShopOwner shopOwner) {
        return service.addShopOwner(shopOwner);
    }

    @PutMapping("/{id}")
    public ShopOwner update(@PathVariable Long id, @RequestBody ShopOwner shopOwner) {
        return service.updateShopOwner(id, shopOwner);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteShopOwner(id);
        return "Shop Owner deleted successfully";
    }

}
