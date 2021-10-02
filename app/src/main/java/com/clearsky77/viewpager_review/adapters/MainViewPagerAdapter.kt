package com.clearsky77.viewpager_review.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.clearsky77.viewpager_review.fragments.AgeFragment
import com.clearsky77.viewpager_review.fragments.GreetingFragment
import com.clearsky77.viewpager_review.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    // 탭레이아웃 페이지별 탭 제목
    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "인사말"
        } else if (position == 1) {
            return "이름"
        } else {
            return "나이"
        }
    }

    // 몇 장의 뷰를 만들것인가?
    override fun getCount(): Int {
        return 3
    }

    // 순서(번호)에 따른 프래그먼트 반환
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return GreetingFragment()
        } else if (position == 1) {
            return NameFragment()
        } else {
            return AgeFragment()
        }
    }
}