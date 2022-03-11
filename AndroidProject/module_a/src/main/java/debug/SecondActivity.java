package debug;

import android.util.Log;
import android.widget.TextView;


import com.sun.common_library.base.BaseActivity;
import com.sun.common_library.base.BaseApplication;
import com.sun.module_a.R;

public class SecondActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    protected void initView() {
        TextView tv_test = this.findViewById(R.id.test);
        tv_test.setText(BaseApplication.name);
    }

    @Override
    protected void initData() {
        Log.e("ME_module", "cur_str=" + BaseApplication.name);

    }
}