package com.example.duong.android_forder_01.utils;

import com.example.duong.android_forder_01.service.API;

/**
 * Created by Duong on 2/14/2017.
 */
public class Const {
    public static final int ID_USER = 1;
    public static final int ID_DOMAIN = 1;
    public static final int ID_CATEGORY = 1;
    public static final int ID_ROOT_DOMAIN = 1;
    public static final String FORMAT_PRICE = "%1$,.0f";
    public static final String UNIT_MONEY = " VNĐ";
    public static final int START_INDEX = 11;
    public static final int END_INDEX = 16;

    public static class ConstantApi {
        public static final String PATH_LOGIN = "authen_user_tokens";
        public static final String PARAM_CATEGORY_ID = "category_id";
        public static final String PARAM_DOMAIN_ID = "domain_id";
        public static final String PARAM_USER_TOKEN = "user_token";
        public static final String PATH_CATEGORY = "v1/categories";
        public static final String PATH_DOMAIN = "v1/domains";
        public static final String URL_FORDER = "http://order.framgia.vn/";
        public static final String PATH_PRODUCT = "v1/products";
        public static final String PARAM_USER_EMAIL = "user_email";
        public static final String PARAM_PASSWORD = "password";
        public static final String PARAM_USER_ID = "user_id";
        public static final String MESSAGE_CONTENT = "message";
        public static final int STATUS_LOGIN_COMPLETED = 200;
    }

    public static class KeyIntent {
        public static final String EXTRA_PRODUCT = "product";
        public static final String EXTRA_SHOP = "shop";
        public static final String EXTRA_ID_CATEGORY = "id_category";
        public static final String EXTRA_DOMAIN = "domain";
    }

    public static class StatusCode {
        public static final int PENDING_CODE = 0;
        public static final int ACCEPT_CODE = 1;
        public static final int REJECT_CODE = 2;
    }
}
