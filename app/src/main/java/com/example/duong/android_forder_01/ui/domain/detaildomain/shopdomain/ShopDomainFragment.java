package com.example.duong.android_forder_01.ui.domain.detaildomain.shopdomain;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duong.android_forder_01.R;
import com.example.duong.android_forder_01.data.model.Domain;
import com.example.duong.android_forder_01.data.model.Shop;
import com.example.duong.android_forder_01.data.source.ShopRepository;
import com.example.duong.android_forder_01.databinding.FragmentShopDomainBinding;
import com.example.duong.android_forder_01.ui.adapter.ShopAdapter;
import com.example.duong.android_forder_01.ui.home.shop.ShopContract;
import com.example.duong.android_forder_01.ui.home.shop.ShopPresenter;

import java.util.ArrayList;
import java.util.List;

import static com.example.duong.android_forder_01.utils.Const.KeyIntent.EXTRA_DOMAIN;

/**
 * Created by Vinh on 07/03/2017.
 */
public class ShopDomainFragment extends Fragment implements ShopContract.View {
    private ShopContract.Presenter mPresenter;
    private List<Shop> mShopList = new ArrayList<>();
    private ObservableField<ShopAdapter> mShopAdapter = new ObservableField<>();
    private FragmentShopDomainBinding mBinding;
    private Domain mDomain;

    public static ShopDomainFragment newInstance(Domain domain) {
        ShopDomainFragment fragment = new ShopDomainFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_DOMAIN, domain);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shop_domain, container, false);
        setPresenter(new ShopPresenter(this, ShopRepository.getInstance()));
        mPresenter.start();
        return mBinding.getRoot();
    }

    public void initRecyclerView() {
        mShopAdapter.set(new ShopAdapter(mShopList, getActivity(), mPresenter));
    }

    @Override
    public void openShopDetail(Shop shop) {
        //TODO: Open shop detail
    }

    @Override
    public void showAllShop(List<Shop> list) {
        if (list == null) return;
        mShopList.clear();
        mShopList.addAll(list);
    }

    @Override
    public void showGetDataError() {
        //TODO: show data error
    }

    @Override
    public void onResume() {
        super.onResume();
        initRecyclerView();
    }

    @Override
    public void start() {
        mBinding.setShopDomainFragment(this);
        mDomain = (Domain) getArguments().getSerializable(EXTRA_DOMAIN);
        mShopList.clear();
        mShopList.addAll(mDomain.getShop());
        initRecyclerView();
    }

    @Override
    public void setPresenter(ShopContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public ObservableField<ShopAdapter> getShopAdapter() {
        return mShopAdapter;
    }
}