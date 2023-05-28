/**
 *
 * Nama : Bayu Rifki Alghifari
 * Nim : 10120003
 * Kelas : IF 1
 * Email : Bayu Rifki Alghifari
 *
 */

package com.uts.muhammadfarhan_10120028.ui.information;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InformationsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}