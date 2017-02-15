package com.example.duong.android_forder_01.ui.productdetail;

import android.support.annotation.NonNull;

import com.example.duong.android_forder_01.data.model.Product;

public class ProductDetailPresenter implements ProductDetailContract.Presenter {
    private ProductDetailContract.View mProductDetailView;

    public ProductDetailPresenter(@NonNull ProductDetailContract.View productDetailView) {
        mProductDetailView = productDetailView;
        mProductDetailView.setPresenter(this);
    }

    @Override
    public void start() {
        mProductDetailView.start();
    }

    @Override
    public void addShoppingCard(Product product) {
        // TODO: add product and update shopping card
    }

    @Override
    public void order(Product product) {
        // TODO: add product and open shopping card
    }
}
